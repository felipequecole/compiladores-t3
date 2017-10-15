grammar Tira_teima;

programa: dec_posicionamento*  time tatica;
dec_podicionamento: 'declare' 'posicionamento' IDENT '{'
		'defensores' ':' '[' espacamento',' direcao',' direcao ']' ';'
		'meiocampista' ':' '[' espacamento',' direcao',' direcao ']'';'
		'atacantes' ':' '[' espacamento',' direcao',' direcao ']'';'
'}';

time:'Time' '{' ('nome:' CADEIA ';')? 'esquema:' INT'-'INT'-'INT';' (comando_time)?'}';

comando_time: 	('treinador:' CADEIA ';')?
		(escalacao)? 
		('compactacao:' INT ';')? ;

escalacao: 	'goleiro:' CADEIA ';' 
		'defensores:' '['CADEIA (', ' CADEIA)*']' ';'
		'meiocampistas:' '['CADEIA,(', ' CADEIA)*']' ';'
		'atacantes:' '['CADEIA (', ' CADEIA)*']' ';';

tatica: 'Tatica''{'
		'nome:' CADEIA ';'
		'defensores:[' posicionamento ',' posicionamento'];'
		'meiocampistas:['posicionamento ',' posicionamento'];'
		'atacantes:[' posicionamento ',' posicionamento'];' ';'
'}';

posicionamento: IDENT|'recompoe';
direcao: 'bola'| 'linha'|'falso9'|'tras';
espacamento: 'compacto'| 'esparsos';
