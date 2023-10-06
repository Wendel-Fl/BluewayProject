# BluewayProject

## Stack de tecnologia
- Spring Boot
- Maven
- MongoDB
* A escolha do MongoDB foi feita por ser um banco de dados não relacional, que permite uma maior flexibilidade na hora de modelar os dados, além de ser um banco de dados de alta performance e escalável.
* A escolha do Spring Boot foi feita por ser um framework que facilita a configuração e execução de aplicações Java, além de ser um framework que possui uma grande comunidade, uma documentação bem completa e com o qual possuo mais experiência.
* A escolha do Maven foi feita por ser uma ferramenta de automação de compilação que facilita a criação de projetos Java.

## Endpoints (localhost:8080)
### GET
- /api/v1/ratings/status

### POST
- /api/v1/users/create
- /api/v1/ratings/vote

## Execução
- Para rodar a aplicação:
  - cd .\out\artifacts\BluewayProject_jar\
  - java -jar .\BluewayProject-0.0.1-SNAPSHOT.jar

- Para usar a aplicação:
  - Primeiro é necessário criar um usuário para poder votar, para isso basta fazer uma requisição POST para o endpoint /api/v1/users/create com o seguinte body:
  - Após isso, basta fazer uma requisição POST para o endpoint /api/v1/ratings/vote com o seguinte body:
```
{
    "name": "Nome",
    "cpf": "cpf"
}
```


```
{
    "user": {
        "name": "Nome",
        "cpf": "cpf"
    },
    "realEstate": "Nome do Empreendimento", ('Le Jardin', 'Evian' ou 'Olimpia Thermas')
    "vote": "vote" (É necessário usar a palavra vote)
}
```