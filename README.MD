# Comandi maven utili
- ```mvn clean``` pulisce la cartella target
- ```mvn compile``` compila e crea i files ```.class``` dentro la cartella
- ```mvn test``` lancia i metodi di test
- ```mvn package```genera detro la cartella target il jar del progetto
- ```mvn install``` installa il progetto corrento nel local repository di maven
- ```mvn exec:java  -Dexec.args="-goldbach -value 3"``` esegue la classe main (descritta nel pom.xml) egli passa i parametri ```-goldbach -value 3````
- ```mvn javadoc:javadoc``` chiama il goal per la generazione dei javadoc
