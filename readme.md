
2.
 Пусть a, b - произвольные строки\
 x, y - произвольные символы. \
 Обозначим длину строки s через |s|.\
  Верно ли, что из равенств\
  
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
		|LCS(xay, b)| = |LCS(xtty, ywwx)| = 1\
		