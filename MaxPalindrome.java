import java.util.Scanner;

public class MaxPalindrome {
    public enum Direction {
        LEFT, DIAGONALLY, UP
    }

    public String restorationWay(Lcs.Direction[][] way,
                                 int n,
                                 int m,
                                 String str1) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = n;
        int j = m;
        while (i > 0 && j > 0) {
            if (way[i][j] == Lcs.Direction.DIAGONALLY) {
                stringBuilder.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (way[i][j] == Lcs.Direction.UP) {
                i--;
            } else if (way[i][j] == Lcs.Direction.LEFT) {
                j--;
            }
        }
        return stringBuilder.reverse().toString();
    }

    public String get(String str1, String str2) {
        long[][] lcs = new long[str1.length() + 1][str2.length() + 1];
        Lcs.Direction[][] way = new Lcs.Direction[str1.length() + 1][str2.length() + 1];

        for (int i = 1; i < str1.length() + 1; i++) {
            for (int j = 1; j < str2.length() + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                    way[i][j] = Lcs.Direction.DIAGONALLY;
                } else {
                    if (lcs[i - 1][j] > lcs[i][j - 1]) {
                        lcs[i][j] = lcs[i - 1][j];
                        way[i][j] = Lcs.Direction.UP;
                    } else {
                        lcs[i][j] = lcs[i][j - 1];
                        way[i][j] = Lcs.Direction.LEFT;
                    }

                }
            }
        }
        return restorationWay(way, str1.length(), str2.length(), str1);
    }

    public static void main(String[] args) {
        Lcs lcs = new Lcs();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String reverse = new StringBuilder(s).reverse().toString();
        System.out.println(lcs.get(s, reverse));
    }
}
