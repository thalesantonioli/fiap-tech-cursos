# fiap-tech-cursos
<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/henriquevergara/android-alura-orgs">
    <img src="https://w7.pngwing.com/pngs/713/936/png-transparent-spring-framework-representational-state-transfer-java-api-for-restful-web-services-microservices-others-text-trademark-logo.png" alt="Logo" width="300" height="100">
  </a>

  <h3 align="center">Fiap-tech-cursos</h3>

  <p align="center">
    Entregável da segunda etapa, atividade fase 3.
    <br />
</p>

<!-- ABOUT THE PROJECT -->
## Sobre o projeto

Neste projeto foi desenvolvido a API de cursos para ser integrada com o projeto Front-End (ReactJs) e nossa aplicação mobile (Kotlin).

Instruções Gerais:
* API desenvolvida com o framework Spring, nela é possível listar cursos e cadastrar usuários.
* Esta sendo utilizado o banco em memória H2, para agilizar o desenvolvimento e a avaliação do tutor desta fase.
* Para geração das tabelas, estamos utilizando Hibernate, e para popular os dados, foi inserido um script data.sql na pasta src/main/resources.
* Foi realizado um deploy da API na plataforma Heroku, ela pode ser acessada através do link https://api-tech-cursos.herokuapp.com/swagger-ui.html

### Tecnologias utilizadas

* [Spring](https://spring.io/)
* [H2 Database](https://www.h2database.com/html/main.html)
* [API](https://api-tech-cursos.herokuapp.com/cursos)
* [Swagger](https://swagger.io/)

<!-- GETTING STARTED -->
# Acesso ao banco em memória

Para acesso ao banco em memória e suas tabelas, use a seguinte URL:

* Rodando projeto local: http://localhost:8082/h2-console


Para conectar ao console, deve ser fornecido:

* JDBC URL: jdbc:h2:mem:api
* Username: sa
* Password: 

![image](https://user-images.githubusercontent.com/36764823/136699547-c33a9f47-9727-4fd9-ab90-92a31ac07a4b.png)

## Documentação da API

Neste projeto, esta sendo utilizado o Swagger, para documentar os endpoints e tornar o consumo da API mais intuitivo.

Para acessar o swagger, utilize o link abaixo:

* Rodando localmente o projeto: http://localhost:8082/swagger-ui.html
* Utilizando projeto deployado na nuvem: https://api-tech-cursos.herokuapp.com/swagger-ui.html
