grammar Matematica;

Programa
 : Bloco EOF
 ;

Bloco
 : (Declaracao)* (‘return’ Expressao ';')?
 ;

Declaracao
 : Atribuicao ';'
 | Integral   ';'
 | Funcao 
 | 'print' '(' Expressao | String ')' ';'  
 ;

Atribuicao
 : Identificador  '=' Expressao
 ;

Integral
 : 'integre' Expressao 'd' Incognita ('de' Numero 'a' Numero)?;
 ; 

Expressao
 : Funcao (Expressao)?
 | '-' Expressao                           
 | Expressao '^' Expressao                
 | Expressao '*' Expressao                
 | Expressao '/' Expressao                
 | Expressao '+' Expressao                
 | Expressao '-' Expressao                
 | Numero                                   
 ;

Funcao
 : Relacao Seno ';'
 | Relacao Cosseno ';'
 | Relacao Identificador '('Incognita')' '=' Expressao ';'
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