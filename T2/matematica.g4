grammar Matematica;

Programa
 : Bloco EOF
 ;

Bloco
 : (Declaracao)* ('return' Expressao ';')?
 ;

Declaracao
 : Atribuicao ';'
 | Integral   ';'
 | Funcao     ';'
 | 'print' '(' Expressao | String ')' ';'  
 ;

Atribuicao
 : Identificador  '=' Expressao // tou em duvida, tah bastante abrangente
 ;

Integral
 : 'integre' Expressao 'd' Incognita (IntervaloInt)?
 ; 

IntervaloInt
 : 'de' (Valor | Identificador) 'a' (Valor | Identificador) 
 ;

Expressao
 //: Funcao (Expressao)?
 : '-' Expressao                           
 | Expressao '^' Expressao                
 | Expressao '*' Expressao                
 | Expressao '/' Expressao                
 | Expressao '+' Expressao                
 | Expressao '-' Expressao                
 | Numero
 | Incognita
 | IdentificadorF
 | Identificador
 | '(' Expressao ')'
 ;

// Talvez fazer um IdentificadorFuncao para facilitar o semântico
Funcao
 : Relacao Seno ';'
 | Relacao Cosseno ';'
 | Relacao IdentificadorF '=' Expressao
 ;

Relacao
 : '{' Dominio'|'Contradominio'}'
 ;

Dominio
 : 'N' | 'Z' | 'Q' | 'R' (Intervalo)?  
 ;

Contradominio
 : 'N' | 'Z' | 'Q' | 'R' (Intervalo)?  
 ;

Intervalo
 : '['Valor '..' Valor']'
 ;

IdentificadorF
 : Identificador '('Incognita')'
 ;

Valor
 : Numero
 | Constante 
 ;

 Seno
 : 'sen''('Incognita | Expressao')'
 ;

 Cosseno
 : 'cos''('Incognita | Expressao')'
 ;

Constante
 : '+infinito'
 | '-infinito'
 | 'pi'
 | 'e'   //euler
 ;

Numero
 : Int ('.' Digito*)?
 ;

Identificador
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

Incognita
 :[a-zA-Z_]
 ;

 String
 : '"' ~('\r' | '\n' | '"')* '"'
 ;

Comentario
 : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip
 ;

Espaco
 : [ \t\r\n\u000C] -> skip
 ;

fragment Int
 : [1-9] Digito*
 | '0'
 ;
  
fragment Digito 
 : [0-9]