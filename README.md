# We Code - Java Edition 🚀

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)
![Bootstrap](https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white)
![VS Code](https://img.shields.io/badge/VS_Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white)

## 📋 Sobre o Curso

O **We Code - Java Edition** é um programa intensivo de 5 semanas focado no desenvolvimento full-stack com Java. O curso combina fundamentos sólidos da linguagem com as mais modernas tecnologias do ecossistema Java para preparar desenvolvedores completos para o mercado.

### 🎯 Objetivos
- Dominar programação Java do básico ao avançado
- Desenvolver aplicações web, mobile e desktop
- Implementar sistemas com banco de dados relacional
- Aprender boas práticas e padrões de projeto
- Construir portfólio com projetos reais

## 📅 Duração e Estrutura

- **Duração:** 5 semanas intensivas
- **Carga Horária:** 80 horas
- **Modalidade:** Presencial/Online
- **Metodologia:** Hands-on com projetos práticos

### 🗓️ Cronograma Semanal

| Semana | Foco | Tecnologias Principais |
|--------|------|------------------------|
| 1 | Fundamentos Web | Java, Git, HTML/CSS, Bootstrap, Servlets |
| 2 | Desenvolvimento Mobile | POO, MVC, Spring Boot, JavaFX |
| 3 | Banco de Dados | MySQL, JDBC, JPA/Hibernate |
| 4 | Aplicações Desktop | JavaFX, UI/UX, Testes |
| 5 | Finalização | Docker, Deploy, Projeto Final |

## 🛠️ Tecnologias e Ferramentas

### 💻 Linguagens de Programação
- **Java 17+** - Linguagem principal
- **SQL** - Banco de dados
- **HTML5/CSS3** - Frontend web
- **JavaScript** - Interatividade

### 🌐 Frameworks e Bibliotecas
- **Spring Boot** - Framework backend
- **JavaFX** - Aplicações desktop/mobile
- **Bootstrap 5** - Framework CSS
- **Hibernate/JPA** - ORM
- **JUnit 5** - Testes unitários
- **Thymeleaf** - Templates web

### 🗄️ Banco de Dados
- **MySQL** - Banco relacional
- **MySQL Workbench** - Interface gráfica

### 🔧 Ferramentas de Desenvolvimento
- **IntelliJ IDEA** - IDE principal
- **Git & GitHub** - Controle de versão
- **Maven** - Gerenciamento de dependências
- **Postman** - Teste de APIs
- **Docker** - Containerização

## 📚 Conteúdo Detalhado

### Semana 1: Fundamentos Web
- ✅ Sintaxe Java e lógica de programação
- ✅ Controle de versão com Git
- ✅ HTML5, CSS3 e Bootstrap 5
- ✅ Desenvolvimento web com Servlets
- ✅ **Projeto 1:** Website responsivo com Bootstrap

### Semana 2: Desenvolvimento Mobile
- ✅ Programação Orientada a Objetos
- ✅ Padrões MVC e MVVM
- ✅ Spring Boot para APIs REST
- ✅ JavaFX para interfaces
- ✅ **Projeto 2:** App mobile com JavaFX

### Semana 3: Banco de Dados
- ✅ Fundamentos de SQL e MySQL
- ✅ JDBC para conexão com banco
- ✅ JPA/Hibernate para ORM
- ✅ Consultas avançadas e otimização
- ✅ **Projeto 3:** Sistema integrado com persistência

### Semana 4: Aplicações Desktop
- ✅ Princípios de UI/UX
- ✅ JavaFX avançado
- ✅ Testes unitários com JUnit
- ✅ Padrões de projeto
- ✅ **Projeto 4:** Sistema desktop completo

### Semana 5: Finalização
- ✅ Empacotamento e distribuição
- ✅ Docker e containerização
- ✅ Deploy em nuvem
- ✅ **Projeto Final:** E-commerce completo

## ⚙️ Pré-requisitos

### Conhecimentos Básicos
- Uso de Computador
- Noções de inglês
- Familiaridade com sistemas operacionais

### Requisitos Técnicos
- Computador com mínimo 8GB RAM
- Conexão estável à internet
- Permissões para instalar software

## 🚀 Preparação do Ambiente

### Passo 1: Instalação do JDK
```bash
# Download do JDK 17 ou superior
https://www.oracle.com/java/technologies/javase-jdk17-downloads.html

# Verificar instalação
java -version
javac -version

```

### Passo 2: Configuração do VS Code
```bash
# Download do VS Code
https://code.visualstudio.com/download

# Extensões essenciais para Java:
# - Extension Pack for Java (Microsoft)
# - Spring Boot Extension Pack
# - Maven for Java
# - Project Manager for Java
# - Debugger for Java
# - Test Runner for Java
# - GitLens
# - Bootstrap 5 Quick Snippets
# - Thunder Client (alternativa ao Postman)

```
Configuração das Extensões no VS Code:
Extension Pack for Java - Suporte completo ao Java

Spring Boot Extension Pack - Desenvolvimento Spring Boot

Maven for Java - Gerenciamento de dependências

Bootstrap 5 Quick Snippets - Snippets para Bootstrap

Configuração do settings.json:
```bash
{
    "java.home": "C:\\Program Files\\Java\\jdk-17",
    "java.configuration.runtimes": [
        {
            "name": "JavaSE-17",
            "path": "C:\\Program Files\\Java\\jdk-17",
            "default": true
        }
    ],
    "maven.executable.path": "C:\\apache-maven-3.8.6\\bin\\mvn.cmd",
    "java.compile.nullAnalysis.mode": "automatic"
}
```
### Passo 3: Instalação do Git
```bash
# Windows: https://git-scm.com/download/win
# Linux: sudo apt install git
# Mac: brew install git

# Configuração inicial
git config --global user.name "Seu Nome"
git config --global user.email "seu.email@dominio.com"

```
### Passo 4: Banco de Dados
```bash
# Download do MySQL Community Server
https://dev.mysql.com/downloads/mysql/

# Download do MySQL Workbench
https://dev.mysql.com/downloads/workbench/

```
### Passo 5: Ferramentas Adicionais
```bash
# Maven: https://maven.apache.org/download.cgi
# Postman: https://www.postman.com/downloads/
# Docker: https://www.docker.com/products/docker-desktop/
```
### Passo 6: Verificação Final
```bash
# Executar verificação de ambiente
java -version
git --version
mvn --version
docker --version
code --version
```
## 🎯 Configuração de Projeto Java no VS Code

Criando um novo projeto Java:
Abrir VS Code

Ctrl+Shift+P → "Java: Create Java Project"

Selecionar "Maven" ou "No build tools"

Escolher versão do Java (17)

Nomear o projeto

### Estrutura de projeto Maven:
```bash
meu-projeto/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── wecode/
│   │   │           └── App.java
│   │   └── resources/
│   └── test/
│       └── java/
└── pom.xml

```
### Executando a aplicação:
# Terminal no VS Code
```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.wecode.App"
```
## 📁 Estrutura do Repositório
```text
Programa_We_Code/
├── semana-1/              # Fundamentos Web
│   ├── fundamentos-java/
│   ├── git-versionamento/
│   ├── programacao-web/
│   └── projeto-1/         # Website com Bootstrap
├── semana-2/              # Desenvolvimento Mobile
│   ├── poo-java/
│   ├── padroes-arquitetura/
│   ├── spring-boot/
│   └── projeto-2/         # App Mobile JavaFX
├── semana-3/              # Banco de Dados
│   ├── mysql-basico/
│   ├── jdbc-hibernate/
│   ├── consultas-avancadas/
│   └── projeto-3/         # Sistema com Persistência
├── semana-4/              # Aplicações Desktop
│   ├── ui-ux-principios/
│   ├── javafx-avancado/
│   ├── testes-junit/
│   └── projeto-4/         # Sistema Desktop
├── semana-5/              # Finalização
│   ├── empacotamento/
│   ├── docker-deploy/
│   └── projeto-final/     # E-commerce Completo
├── recursos/              # Material de apoio
│   ├── documentacao/
│   ├── exercicios/
│   └── templates/
├── .vscode/               # Configurações do VS Code
│   ├── settings.json
│   └── extensions.json
└── README.md
```
### *Configuração do VS Code (.vscode/extensions.json):*
```json
{
    "recommendations": [
        "vscjava.vscode-java-pack",
        "vmware.vscode-spring-boot",
        "vscjava.vscode-maven",
        "vscjava.vscode-java-dependency",
        "vscjava.vscode-java-test",
        "vscjava.vscode-spring-initializr",
        "ecmel.vscode-html-css",
        "bradlc.vscode-tailwindcss",
        "anbuselvanrocky.bootstrap5-vscode",
        "ritwickdey.liveserver"
    ]
}
```


## 📖 Material de Apoio

### Documentação Oficial
- [📚 Java Documentation](https://docs.oracle.com/javase/) - Documentação oficial da Oracle para Java
- [🌱 Spring Boot Guides](https://spring.io/guides) - Tutoriais e guias do Spring Boot
- [🎨 Bootstrap Documentation](https://getbootstrap.com/docs/) - Documentação completa do Bootstrap
- [🖥️ JavaFX Documentation](https://openjfx.io/) - Guias e referências do JavaFX
- [⚡ VS Code Java](https://code.visualstudio.com/docs/languages/java) - Documentação para Java no VS Code

### Livros Recomendados
- **"Java: Como Programar"** - Paul Deitel
- **"Effective Java"** - Joshua Bloch
- **"Spring in Action"** - Craig Walls
- **"Clean Code"** - Robert C. Martin

### Recursos Adicionais
- [📖 W3Schools Java](https://www.w3schools.com/java/) - Tutoriais interativos de Java
- [🚀 Java Tutorials - Baeldung](https://www.baeldung.com/) - Tutoriais avançados e best practices
- [🌿 Spring Boot Tutorial](https://www.tutorialspoint.com/spring_boot/index.htm) - Guia completo do Spring Boot
- [💎 Bootstrap Examples](https://getbootstrap.com/docs/5.3/examples/) - Exemplos práticos de Bootstrap
- [🎯 JavaFX Tutorial](https://docs.oracle.com/javase/8/javafx/get-started-tutorial/index.html) - Tutorial oficial JavaFX
- [📦 Maven Documentation](https://maven.apache.org/guides/) - Guias oficiais do Maven
- [🐙 GitHub Learning Lab](https://lab.github.com/) - Cursos interativos de Git e GitHub

### Canais e Comunidades
- [👨‍💻 Stack Overflow - Java](https://stackoverflow.com/questions/tagged/java)
- [💬 Reddit - r/learnjava](https://www.reddit.com/r/learnjava/)
- [👥 Discord - Java Programming](https://discord.gg/java)
- [📺 YouTube - Java Brains](https://www.youtube.com/c/JavaBrainsChannel)

### Ferramentas Online
- [🛠️ JDoodle](https://www.jdoodle.com/online-java-compiler/) - Compilador Java online
- [📊 DB Fiddle](https://www.db-fiddle.com/) - SQL online para testar queries
- [🎨 CodePen](https://codepen.io/) - Editor online para HTML/CSS/JS
- [🔗 JSON Formatter](https://jsonformatter.org/) - Validador e formatador JSON


## 🚀 Comece Agora

### Clone o Repositório
```bash
git clone https://github.com/JohnJoshua-Dev/Programa_We_Code.git
cd Programa_We_Code
code . #Abre no vs code

```
### Primeiros Passos
1. Siga o guia de preparação do ambiente

2. Instale as extensões recomendadas no VS Code

3. Acesse a pasta semana-1/fundamentos-java

4. Complete os exercícios iniciais

5. Participe de Discussões

## Estrutura de um Projeto Java Básico
```java
// Exemplo de estrutura inicial
package com.wecode;

public class HelloWeCode {
    public static void main(String[] args) {
        System.out.println("🚀 Bem-vindo ao We Code Java Edition!");
        System.out.println("✅ VS Code configurado com sucesso!");
    }
}
```
## Comandos Úteis no VS Code
```bash
# Atalhos importantes:
# Ctrl+Shift+P - Command Palette
# Ctrl+` - Abrir terminal
# F5 - Debug
# Ctrl+F5 - Executar sem debug
# Ctrl+Shift+X - Gerenciar extensões
```

## 📞 Contato e Suporte

**Email:** josuerafaelsitoe@gmail.com
**Portifolio:** [JohnJoshua-Dev](https://johnjoshua-dev.github.io/JosueSitoe.github.io/)
**Website:** www.joshuasoluctiondevelopment.com 
**Fórum:** TeleGram & Whatsapp (privados)
**Telefone:** +258 872737483

---

<div align="center">

### 💡 **Pronto para começar sua jornada Java com VS Code?**
*"A melhor maneira de prever o futuro é criá-lo."* - Peter Drucker

[**📚 Acessar Material da Semana 1**](./semana-1/) | [**🐛 Reportar Problema**](https://github.com/JohnJoshua-Dev/Programa_We_Code.git/issues)

</div>

---

**⭐ Não se esqueça de dar uma estrela no repositório se este curso foi útil para você!**

---
*Última atualização: Novembro 2025 | Versão 1.0 - VS Code Edition*
