grammar Tira_teima;

programa: time taticas esquemas+;

/* estou colocando tudo em regras para facilitar a detecção na geraçao
	 de imagens */

time: 'Time''{' nome_time
								treinador_time?
								conjunto_jogadores?
								'compactacao:' INT '}';

nome_time: 'Nome:' CADEIA;

treinador_time: 'Treinador'':' CADEIA ;

conjunto_jogadores: 'Goleiro' ':' CADEIA |
										'Jogadores de linha'':' CADEIA (',' CADEIA)*;

taticas: 'Taticas''{'
		(IDENT'('posicionamento','posicionamento','espacamento')')+
'}';

esquemas: 'Esquema' CADEIA '{'
 					(conteudo_esquema':' IDENT )+
					 '}';


conteudo_esquema: CADEIA (',' CADEIA)* | '['INT']';

posicionamento: 'pressao'|'bola'|'flanco_direito'|'flanco_esquerdo'|'protege_gol'
								'faixa_central'|'NULO';

espacamento: 'agrupados'| 'esparsos';

INT: ('-')? '0'..'9' ('0'..'9')* ;

IDENT	:	('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;

CADEIA	:	'"' ~('\n' | '\r' | '\'')* '\'' | '"' ~('\n' | '\r' | '"')* '"';

WS	:	(' ' | '\t' | '\r' | '\n') -> skip;
