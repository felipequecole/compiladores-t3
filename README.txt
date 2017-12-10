
É necessário instalar o matplotlib
No linux:
  pip install matplotlib

Instruções para compilar o compilador:
  java -jar ./lib/antlr-4.7-complete.jar -visitor -package t3 -o ./ t3/src/t3/Tira_teima.g4
  javac -cp ./lib/*.jar -d ./build t3/src/t3/*.java
  jar -cfm t3.jar t3/src/t3/Manifest.txt -C diretorio_de_saida t3

Instruções para executar o compilador:
  java -jar t3.jar arquivo_entrada arquivo_saida.py

A saída do compilador deverá ser:
  o arquivo python capaz de gerar as imagens dos esquemas
  as imagens proprimente ditas
