# Visão Geral 
- Serviço de Storage;
- Objetos e Buckets;
	- 100 Buckets;
	- Não há limite de objetos;
- APIs;
- **Default:** privado e acesso restrito; <br>

**Sub-recursos**
- CORS;

## Criando um Bucket (S3) a partir o Java
Spring <br>
https://start.spring.io/
- Project: Maven Project
- Language: Java
- Spring Boot: 2.7.2
- Java 11
- Dependencies: 
	- Spring Boot Dev Tools
	- Lombok
	- Spring Web
- Extrair o arquivo
- Abrir com o Intellij
- Copiar o código do site: https://mvnrepository.com/artifact/com.amazonaws/aws-java-sdk-s3
```
<!-- https://mvnrepository.com/artifact/com.amazonaws/aws-java-sdk-s3 -->
<dependency>
    <groupId>com.amazonaws</groupId>
    <artifactId>aws-java-sdk-s3</artifactId>
    <version>1.12.279</version>
</dependency>
```

- Colar no arquivo "pom.xml" - Linha 41 (conferir)
- Baixar a dependência da AWS
- Em: `src/main/java/S3withspringApplication`
	- Run (testar se tá tudo certo);
- Criar uma classe em com.dioclass.s3withspring
<br>
- **Confiuração da AWS:** AmazonConfig 
- **Método para criação do Bucket:** BucketServices

