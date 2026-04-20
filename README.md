# 🚀 TaskFlow API

API REST desenvolvida com Java + Spring Boot para gerenciamento de tarefas com autenticação JWT.

## 🔧 Tecnologias
- Java 21
- Spring Boot
- Spring Security
- JWT
- JPA / Hibernate
- H2 Database

## 🔐 Funcionalidades
- Cadastro de usuário
- Login com token JWT
- Criação de tarefas
- Listagem de tarefas do usuário autenticado
- Busca por ID (somente do dono)
- Exclusão de tarefas

## 🔒 Segurança
- Senhas criptografadas com BCrypt
- Autenticação stateless com JWT
- Controle de acesso por usuário

## ▶️ Como rodar

```bash
mvn spring-boot:run
