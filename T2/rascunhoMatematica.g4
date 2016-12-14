/*
+ identificadores: [a-zA-Z_] [a-zA-Z_0-9]*

+ constantes: numeros inteiros e de ponto flutuante, pi, +infinito, -infinito

+ funcoes: somar, subtrair, dividir, multiplicar, integrar

+ laços: while

+ condicionais: if, else, else if

+ saida de dados: println() 

+ expressao -> funcao:
	   '-' expressao                          #unaryMinusexpressao
	 | '!' expressao                          #notexpressao
	 | expressao '^'  expressao                #powerexpressao
	 | expressao '*'  expressao                #multiplyexpressao
	 | expressao '/'  expressao                #divideexpressao
	 | expressao '%'  expressao                #modulusexpressao
	 | expressao '+'  expressao                #addexpressao
	 | expressao '-'  expressao                #subtractexpressao
	 | expressao '>=' expressao               #gtEqexpressao
	 | expressao '<=' expressao               #ltEqexpressao
	 | expressao '>'  expressao                #gtexpressao
	 | expressao '<'  expressao                #ltexpressao
	 | expressao '==' expressao               #eqexpressao
	 | expressao '&&' expressao               #andexpressao
	 | expressao '||' expressao               #orexpressao
	 | funcaoMat
	 | Number                                 #numberexpressao
	 | list indices?                          #listexpressao
	 | '(' expressao ')' expressao             #expressao

+ funcaoMat :
   identificador( '(' identificador ')' ) 


+ comentario : //

*/

f(x) = x^2 + 2x + 1

v1 = integre f(x) de +infinito ate -infinito

v2 = integre f(x) de a ate b

v1+v2

v1-v2

print(v1)

print(v1)






limite de f(x) com x indoPara 5

derivada de f(x)
