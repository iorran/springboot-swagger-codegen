# springboot-swagger-codegen
Generate Java / Angular client to API 


Esse projeto, adicionei a library da propria API para testar.

A classe main não serve para absolutamente nada, apenas teste.

O cliente em java é gerado com o "mvn install" dentro da pasta target.

Executando o segundo "mvn install" no projeto cliente, gerado pelo primeiro comando, obtemos a library para consumo. ( neste caso para o java, usamos o rest-template )

Sendo assim, adicionei essa library no proprio pom.xml, para que pudessemos testar no método main mencionado acima.


---------------------------------------------------------------------------------------------------------------------------

O mundo ideal é que um outro projeto que precise consumir informações dessa API, carregue como dependencia a propria library do mesmo que foi gerada via maven.
