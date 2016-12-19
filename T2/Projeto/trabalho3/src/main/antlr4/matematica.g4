grammar matematica;

programa
 : ( intervalo |constante |Numero | Identificador | Incognita |String | Comentario)* EOF
 ;

intervalo
 : '['valor '<->' valor']'
 ;

valor
 : Numero
 | constante
 ;

constante
 : '+infinito'
 | '-infinito'
 | 'pi'
 | 'e'   //euler
 ;

Numero
 : Int ('.' Digito*)?
 ;

Incognita
 :[a-zA-Z_]
 ;

Identificador
 : [a-zA-Z_] [a-zA-Z_0-9]*
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
 ;