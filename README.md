# LoginPUC — Atividade 2 (DIAW)

Aplicação web com telas de login, cadastro e recuperação de senha, feita com Spring Boot e Thymeleaf.

## Integrantes
- Arthur Gabriel
- Pedro Felipe

## Tecnologias

- Java 25
- Spring Boot 4.1.1 (Web MVC + Thymeleaf)
- Maven (o projeto já inclui o Maven Wrapper, não precisa instalar)

## Pré-requisitos

- JDK 25 instalado, com `java -version` funcionando no terminal
- Git (opcional, só para clonar)

## Como rodar

```bash
git clone https://github.com/PedroFelipeBastos/LOGIN---Atv-2-DIAW-.git
cd LOGIN---Atv-2-DIAW-/LoginPUC
```

No **Windows**:

```bash
mvnw.cmd spring-boot:run
```

No **Linux/macOS**:

```bash
chmod +x mvnw
./mvnw spring-boot:run
```

Depois acesse **http://localhost:8080/login** no navegador.

Para parar a aplicação, use `Ctrl + C` no terminal.

### Gerar o .jar (opcional)

```bash
./mvnw clean package
java -jar target/LoginPUC-0.0.1-SNAPSHOT.jar
```

## Endpoints

| Método | Endpoint           | Descrição                                   |
|--------|--------------------|---------------------------------------------|
| GET    | `/login`           | Exibe a tela de login                       |
| POST   | `/login`           | Processa o login e abre a tela inicial      |
| GET    | `/register`        | Exibe a tela de cadastro                    |
| POST   | `/register`        | Processa os dados do cadastro               |
| GET    | `/recoverpassword` | Exibe a tela de recuperação de senha        |
| POST   | `/recoverpassword` | Processa a solicitação de recuperação       |

## Estrutura

```
LoginPUC/
├── pom.xml
└── src/main/
    ├── java/com/example/LoginPUC/
    │   ├── LoginPucApplication.java        # classe principal
    │   └── controller/
    │       └── SecureLoginController.java  # endpoints
    └── resources/
        ├── application.properties
        ├── static/
        │   ├── css/                        # login.css, register.css
        │   └── images/                     # imagens, logo e patinho
        └── templates/                      # login, register, recoverpassword, home
```

## Observações

- Não há banco de dados nem Spring Security: o cadastro e a recuperação de senha apenas recebem os dados e mostram o resultado no console.
- A porta padrão é `8080`. Se ela estiver ocupada, adicione `server.port=8081` no `application.properties`.
- Se alguma mudança de CSS não aparecer, recarregue a página com `Ctrl + F5`.
