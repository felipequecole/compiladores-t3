grammar Tira_teima;

programa: time taticas esquemas+;

/* estou colocando tudo em regras para facilitar a detecção na geraçao
	 de imagens */

time: 'Time''{' nome_time
								treinador_time?
								goleiro?
								conjunto_jogadores?
								'compactacao'':' INT '}';

nome_time: 'Nome'':' CADEIA;

treinador_time: 'Treinador'':' CADEIA ;

goleiro: 'Goleiro' ':' CADEIA ;

conjunto_jogadores: 'Jogadores_de_linha'':' l_jog += CADEIA (',' l_jog += CADEIA)*;

pos_tatica: IDENT '(' posicionamento','posicionamento','espacamento')';

taticas: 'Taticas''{'
		list_taticas += pos_tatica+
'}';

esquemas: 'Esquema' IDENT '{'
 					(lista_jog_tat +=conteudo_esquema':' nome_tat += IDENT )+
					 '}';


conteudo_esquema: l_jog_esq += CADEIA (',' l_jog_esq += CADEIA)* | '['INT']';

posicionamento: 'pressao'|'bola'|'flanco_direito'|'flanco_esquerdo'|'protege_gol'
								'faixa_central'|'NULO';

espacamento: 'agrupados'| 'esparsos';

INT: ('-')? '0'..'9' ('0'..'9')* ;

IDENT	:	('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;

CADEIA	:	'"' ~('\n' | '\r' | '\'')* '\'' | '"' ~('\n' | '\r' | '"')* '"';

WS	:	(' ' | '\t' | '\r' | '\n') -> skip;
