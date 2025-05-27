🎓 API de Gestão de Matrículas e Alunos

Esta API foi desenvolvida para gerenciar alunos, suas matrículas e desempenho acadêmico. O sistema permite realizar operações de cadastro, consulta, atualização e remoção de alunos, além de gerenciar matrículas e gerar o histórico escolar com cálculo automático de média e status de aprovação.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL (ou outro banco relacional)
- Lombok
- DBeaver (opcional, para gerenciamento visual do banco)

 🛠️ Funcionalidades
 
- ✅ Cadastro de alunos
- ✅ Listagem de alunos
- ✅ Atualização de dados dos alunos
- ✅ Remoção de alunos
- ✅ Cadastro de matrículas
- ✅ Listagem de matrículas por aluno
- ✅ Cancelamento de matrículas
- ✅ Geração de histórico escolar do aluno
- ✅ Cálculo de média e status (Aprovado/Reprovado)

📦 Como executar o projeto
  🔧 Pré-requisitos

- Java 17+
- Maven
- PostgreSQL (ou outro banco compatível)
- DBeaver (opcional, para visualização do banco)
 
1. Clone o repositório

git clone https://github.com/seu-usuario/nome-do-repositorio.git
cd nome-do-repositorio

2. Configure no Banco de Dados
No arquivo src/main/resources/application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/alunosdb
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update

3. Execute a aplicação
./mvnw spring-boot:run

🧠 Organização do Projeto
src/
 ├── main/ 
 │   ├── java/ 
 │   │   └── br/ 
 │   │       └── com/ 
 │   │           └── alunoonline/ 
 │   │               └── api/ 
 │   │                   ├── controller/   # Controladores REST
 │   │                   ├── service/      # Regras de negócio
 │   │                   ├── repository/   # Acesso ao banco
 │   │                   ├── model/        # Entidades JPA
 │   │                   └── dto/          # Transferência de dados
 │   └── resources/ 
 │       ├── application.properties         # Configuração da aplicação 
 │       ├── db/ 
 │       │   └── dump.sql                   # Backup do banco de dados
 │       └── insomnia/
 │           └── Insomnia_2025-05-27.yaml   # Collection de testes da API
 └── test/                                  # Testes unitários e de integração
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# aluno
listarTodosAlunos, buscarAlunoPorId e deletarAlunoPorId
![print1](https://i.imgur.com/iEuD1Rv.png)
print criarAluno 
![print2](https://i.imgur.com/jkUs1RW.png)
print listarAlunos
![print3](https://i.imgur.com/cwQj3pz.png)
print buscarAlunoPorId
![print4](https://i.imgur.com/DTacnwy.png)
print deletarAluno

#
