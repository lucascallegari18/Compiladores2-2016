grammar matematica;

programa
 : bloco EOF
 ;

bloco
 : (declaracao)* ('return' expressao ';')?
 ;

declaracao
 : atribuicao ';'
 | funcao     ';'
 | print      ';'
 ;
print
 : 'print' (expressao | String)
 ;
atribuicao
 : identificador  '=' expressao
 ;

expressao
 : '-' expressao
 | integral
 | expressao '^' expressao
 | expressao '*' expressao
 | expressao '/' expressao
 | expressao '+' expressao
 | expressao '-' expressao
 | '(' expressao ')'
 | valor
 | identificadorF
 | identificador
 ;

integral
 : 'integre' expressao fatorInt identificador (intervaloInt)?
 ;

fatorInt
: 'd'
;

intervaloInt
 : 'de' (valor | identificador) 'a' (valor | identificador)
 ;

funcao
 : (relacao)? seno
 | (relacao)? cosseno
 | (relacao)? identificadorF '=' expressao
 ;

identificadorF
 : identificador '('identificador')'
 ;

relacao
 : '{' dominio'|'contradominio'}'
 ;

dominio
 : ('N' | 'Z' | 'Q' | 'R') (intervalo)?
 ;

contradominio
 : ('N' | 'Z' | 'Q' | 'R') (intervalo)?
 ;

intervalo
 : '['valor '<->' valor']'
 ;
seno
 : 'sen''('identificador | expressao')'
 ;

cosseno
 : 'cos''('identificador | expressao')'
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

identificador
 : ID
 ;

ID
 : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
 ;
Numero
 : Int ('.' Digito*)?
 | '-'Int ('.' Digito*)?
 ;

Letra
  : 'a'..'z'
  | 'A'..'Z'
  ;

String
 : '"' ~('\r'|'\n')*? '"'
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
 : '0'..'9'
 ;