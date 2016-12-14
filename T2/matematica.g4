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
 | Funcao     ';'
 ;

Atribuicao
 : Identificador  '=' Expressao
 ;

Funcao
 : Relacao Identificador '('Incognita')' '=' Expressao
 ;

Integral
 : 'integre' Funcao 'd' Incognita ('de' Numero 'ate' Numero)?;
 ; 

Expressao
 : '-' Expressao                           
 | Expressao '^' Expressao                
 | Expressao '*' Expressao                
 | Expressao '/' Expressao                
 | Expressao '+' Expressao                
 | Expressao '-' Expressao                
 | Numero                                   
 ;

Relacao
 : '{' Dominio'|'Imagem'}'
 ;

Dominio
 : 'N' | 'Z' | 'Q' | 'R' (Intervalo)?  
 ;

Imagem
 : 'N' | 'Z' | 'Q' | 'R' (Intervalo)?  
 ;

Intervalo
 : '['Valor '..' Valor']'
 ;

Valor
 : Numero
 | Constante 
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