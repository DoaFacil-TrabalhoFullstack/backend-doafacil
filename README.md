# Doa Fácil

O projeto tem como objetivo desenvolver e implementar uma plataforma web que permita o cadastro de itens para doação, facilite o contato entre doadores e pessoas interessadas, e promova a entrega de itens entre doadores (pessoas físicas e jurídicas) e donatários (estudantes, pessoas em vulnerabilidade social, ONG's e escolas públicas). A plataforma deve ser intuitiva, segura e acessível, facilitando a visualização de itens disponíveis e permitindo a manifestação de interesse e contato direto entre as partes.

## Tecnologias Utilizadas

Este projeto utiliza as seguintes tecnologias e dependências:

- **Java 17**
- **Spring Boot 3.3.4**
  - Spring Boot Starter Web
  - Spring Boot DevTools
  - Spring Boot Starter Test
  - Spring Boot Starter Security
  - Spring Boot Starter Data JDBC
  - Spring Boot Starter Data JPA
- **MySQL Connector/J**
- **Spring Plugin Core 2.0.0**
- **SpringDoc OpenAPI (Swagger) 2.2.0**
- **Java JWT 3.18.1**

## Instalação

### Pré-requisitos

- **Java 17** ou superior instalado
- **Maven** configurado na máquina
- Banco de dados **MySQL**

### Passos

1. Clone o repositório:
   
   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd doaFacil

3. Configure as variáveis de ambiente necessárias no arquivo `application.properties`:
   
    ```properties
    # Configurações de JWT
    doafacil.jwt.secret=<SEU_SECRET>
    doafacil.jwt.issuer=<SEU_ISSUER>
    # Configurações do Banco de Dados
    spring.datasource.url=<URL_BANCO_DE_DADOS>
    spring.datasource.username=<USUARIO_BANCO>
    spring.datasource.password=<SENHA_BANCO>

4. Compile e instale as dependências do projeto:
   
    ```bash
    mvn clean install

## Execução

- Para rodar a aplicação, use o comando abaixo no terminal:
  
    ```bash
    mvn spring-boot:run

Após iniciar, a API estará disponível em http://localhost:8080.
A documentação dos endpoints (Swagger) pode ser acessada em:
[http://localhost:8080/swagger-ui/index.html#/](http://localhost:8080/swagger-ui/index.html#/)

## Endpoints da API

A API contém endpoints documentados no Swagger, incluindo:

- Cadastro de usuários e itens.
- Listagem de itens disponíveis para doação.
- Contato entre doadores e donatários.
- Entre outros.

Consulte o Swagger para detalhes sobre os endpoints e exemplos de uso.

## Licença
Este projeto não possui uma licença definida.

## Desenvolvedores
Projeto desenvolvido por:

- Lucas Bomfim Mujo de Mattos
- Thalia Araujo Levy
- Douglas Moura Lopes
- João Vitor Montemór Maganin
- Jefferson Rocha da Silva Teixeira

