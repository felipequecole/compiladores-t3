programa: dec_posicionamento*  time tatica;
dec_podicionamento: "declare" "posicionamento" IDENT "{"
		"defensores" ":" "[" espacamento"," direcao"," direcao "]";
		"meiocampista" ":" "[" espacamento"," direcao"," direcao "]";
		"atacantes" ":" "[" espacamento"," direcao"," direcao "]";
"}";

time:"Time""{" comando_time* "esquema:" INT"-"INT"-"INT";" comando_time* "}";

comando_time: "nome:" CADEIA;|
		"treinador:" CADEIA;|
		"goleiro:" CADIEA;|
		"defensores:" [CADEIA,(" " CADEIA)*]|
		"meiocampistas:"[CADEIA,(" " CADEIA)*]|
		"atacantes:"[CADEIA,(" " CADEIA)*]|
		"compactacao:" INT;

tatica: "Tatica""{"
		comando_tatico: "nome:" CADEIA ";"
		"defensores:[" posicionamento "," posicionamento"];"
		"meiocampistas:["posicionamento "," posicionamento"];"
		"atacantes:[" posicionamento "," posicionamento"];";
"}"

posicionamento: IDENT|"recompoe";
direcao: "bola"| "linha"|"falso9"|"tras";
espacamento: "compacto"| "esparsos";
