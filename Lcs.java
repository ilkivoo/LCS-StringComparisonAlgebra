
import java.util.Scanner;

public class Lcs {

    public enum Direction {
        LEFT, DIAGONALLY, UP
    }

    public String restorationWay(Direction[][] way,
                                 int n,
                                 int m,
                                 String str1) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = n;
        int j = m;
        while (i > 0 && j > 0) {
            if (way[i][j] == Direction.DIAGONALLY) {
                stringBuilder.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (way[i][j] == Direction.UP) {
                i--;
            } else if (way[i][j] == Direction.LEFT) {
                j--;
            }
        }
        return stringBuilder.reverse().toString();
    }

    public String get(String str1, String str2) {
        long[][] lcs = new long[str1.length() + 1][str2.length() + 1];
        Direction[][] way = new Direction[str1.length() + 1][str2.length() + 1];

        for (int i = 1; i < str1.length() + 1; i++) {
            for (int j = 1; j < str2.length() + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                    way[i][j] = Direction.DIAGONALLY;
                } else {
                    if (lcs[i - 1][j] > lcs[i][j - 1]) {
                        lcs[i][j] = lcs[i - 1][j];
                        way[i][j] = Direction.UP;
                    } else {
                        lcs[i][j] = lcs[i][j - 1];
                        way[i][j] = Direction.LEFT;
                    }

                }
            }
        }
        return restorationWay(way, str1.length(), str2.length(), str1);
    }

    public static void main(String[] args) {
        Lcs lcs = new Lcs();
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println(lcs.get(s1, s2));
    }
}
