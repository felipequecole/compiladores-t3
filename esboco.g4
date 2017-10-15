


programa: "declare" time "declare" tatica "declare" posicionamento;

time:"{" comando_time* "esquema:" INT"-"INT"-"INT";" comando_time* "}";
comando_time: "nome:" CADEIA;|
	"treinador:" CADEIA;|
	"goleiro:" CADIEA;|
	"defensores:" [CADEIA,(" " CADEIA)*]|
	"meiocampistas:"[CADEIA,(" " CADEIA)*]|
	"atacantes:"[CADEIA,(" " CADEIA)*]|
	"compactacao:" INT;

tatica: "{" 
	comando_tatica+
"}"

comando_tatico: "nome:" CADEIA;|
	"defensores:["pal_reservada_tatica (",pal_reservada_tatica)* "];"|
	"meiocampistas:[" pal_reservada_tatica  (",pal_reservada_tatica)* "];"|
	"atacantes:[" pal_reservada_tatica  (",pal_reservada_tatica)* "];";

posicionamento...

