
1.

Изучить алгоритм динамического программирования для вычисления LCS (по любым источникам). 

https://github.com/ooalyokhina/LCS-StringComparisonAlgebra/blob/master/Lcs.java 

2.

 Пусть a, b - произвольные строки\
 x, y - произвольные символы. \
 Обозначим длину строки s через |s|.\
  Верно ли, что из равенств
  
|LCS(xa, b)| = |LCS(a, b)| + 1,


|LCS(ay, b)| = |LCS(a, b)| + 1


следует равенство


|LCS(xay, b)| = |LCS(a, b)| + 2?


Пусть\
	a = tt\
	b = ywwx\
	\
	Тогда \
		|LCS(a, b)| = 0\
		|LCS(xa, b)| = |LCS(xtt, ywwx)| = 1 = |LCS(a, b)| + 1\
		|LCS(ay, b)| = |LCS(tty, ywwx)| = 1 = |LCS(a, b)| + 1\
	Но \
		|LCS(xay, b)| = |LCS(xtty, ywwx)| = 1
		

3.

Палиндромом называется строка, читающаяся одинаково в обоих направлениях, например "АТАТА". Написать программу на любом языке программирования, вычисляющая для заданной строки ее максимальную подпоследовательность (упорядоченную, с произвольными пропусками символов), являющуюся палиндромом. 

https://github.com/ooalyokhina/LCS-StringComparisonAlgebra/blob/master/MaxPalindrome.java 

