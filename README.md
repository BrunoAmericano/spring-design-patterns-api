# 🧩 Spring Design Patterns API

Bem-vindo à **Spring Design Patterns API** — um projeto que demonstra, de forma prática e didática, como aplicar os Padrões de Projeto do GoF utilizando o poderoso ecossistema do **Spring Framework**!

Esta aplicação simula um sistema simples de **gerenciamento de clientes**, onde são implementados os padrões **Singleton**, **Strategy** (com Repository) e **Facade**, todos integrados em uma API RESTful funcional e leve.

---

## 🚀 Tecnologias Utilizadas

- ☕ **Java 17**
- 🌱 **Spring Boot 3.x**
- 🧪 **Spring Web**
- 🧠 **Spring Data JPA**
- 🛢️ **H2 Database (em memória)**
- 📦 **Maven**

---

## 📌 Padrões de Projeto Aplicados

### 🔂 Singleton
Criamos um `LoggerSingleton`, responsável por registrar ações da aplicação de forma centralizada. Ele garante que apenas **uma instância** seja utilizada ao longo do sistema.

### 🎭 Strategy (Repository)
A interface `ClienteRepository` define o contrato para as operações de persistência. Com o Spring Data JPA, o padrão **Strategy** entra em ação quando o Spring injeta dinamicamente a implementação da interface no tempo de execução.

### 🧰 Facade
A classe `ClienteServiceFacade` atua como uma **fachada**, centralizando toda a lógica de negócio e servindo de intermediária entre o controller e os serviços. Isso simplifica a arquitetura e reduz o acoplamento.

---

## 📦 Estrutura de Diretórios

```plaintext
spring-design-patterns-api/
│
├── src/main/java/com/bruno/designpatterns/
│   ├── controller/             # Endpoints REST
│   ├── facade/                 # Fachada de serviços (padrão Facade)
│   ├── model/
│   │   └── entity/             # Entidades JPA (ex: Cliente)
│   ├── repository/             # Interface de persistência (padrão Strategy)
│   ├── service/                # Lógica de negócio
│   ├── singleton/              # Implementação do padrão Singleton
│   └── DesignPatternsApplication.java  # Classe principal da aplicação
│
├── src/main/resources/
│   └── application.properties  # Configurações do Spring Boot
│
├── README.md                   # Documentação do projeto
└── pom.xml                     # Gerenciador de dependências Maven

````

## 🧪 Funcionalidades da API
- ✅ Cadastrar cliente

- 📋 Listar todos os clientes

- 🔍 Buscar cliente por ID

- ❌ Deletar cliente

---

## ▶️ Como Rodar o Projeto

```bash

# Clone o repositório
git clone https://github.com/seu-usuario/spring-design-patterns-api.git
cd spring-design-patterns-api

# Execute a aplicação
./mvnw spring-boot:run

```

Depois de iniciar, acesse:
🔗 http://localhost:8080/api/clientes

---

## 💡 Observações
Este projeto é ideal para quem está começando a aplicar boas práticas de arquitetura com Java e Spring. Ele pode servir como base para projetos maiores ou como referência para entrevistas técnicas.

Sinta-se à vontade para clonar, estudar, melhorar e compartilhar!

## 👨‍💻 Autor
Bruno José Americano Prado de Jesus
Estudante de TI | Apaixonado por tecnologia | Explorador de boas práticas
🚀 "Transformando código em soluções reais."