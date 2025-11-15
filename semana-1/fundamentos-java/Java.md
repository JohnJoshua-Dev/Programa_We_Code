# Módulo 1.1: Fundamentos de Java
## Conteúdo Teórico:
### •	História e características do Java
### •	JVM, JRE, JDK - diferenças
### •	Sintaxe básica e convenções
### •	Tipos de dados primitivos e wrappers
### •	Operadores aritméticos, relacionais e lógicos
### •	Estruturas de controle (if/else, switch, loops)

## 📚 História e Características do Java

### Origens (1991-1995)
Criado por James Gosling e sua equipe na Sun Microsystems (adquirida pela Oracle em 2010)

Projeto inicial: "Green Project" (1991) para dispositivos eletrônicos inteligentes

Nome original: Oak (carvalho), depois renomeado para Java

Lançamento oficial: 1995 com o Java 1.0

### Evolução Cronológica
```text
1995 - Java 1.0 → Applets para web
1997 - Java 1.1 → JDBC, RMI
1998 - Java 1.2 (Java 2) → Collections Framework
2004 - Java 5 → Generics, Annotations
2014 - Java 8 → Lambda Expressions, Stream API
2018 - Java 11 → LTS (Long Term Support)
2021 - Java 17 → LTS atual
2023 - Java 21 → Último LTS
```
### ⭐ Principais Características do Java

#### 1. 🤖 Orientação a Objetos
```Java
// Exemplo de classe Java
public class Carro {
    private String modelo;
    
    public Carro(String modelo) {
        this.modelo = modelo;
    }
    
    public void acelerar() {
        System.out.println(modelo + " acelerando!");
    }
}

```
#### 2. 📦 Plataforma Independente (WORA)
"Write Once, Run Anywhere" - Escreva uma vez, execute em qualquer lugar

Compilação para bytecode (.class)

Execução na JVM (Java Virtual Machine)

#### 3. 🔒 Segurança
Verificação de bytecode pela JVM

Gerenciamento automático de memória

Controle de acesso (public, private, protected)

Security Manager para aplicações enterprise

#### 4. 🚀 Robustez
Verificação em tempo de compilação

Exception handling

Garbage Collection automático

Tipagem forte

#### 5. 💾 Garbage Collection Automático
Liberação automática de memória não utilizada

Desenvolvedor não precisa gerenciar memória manualmente

## 🏗️ Arquitetura Java
### JDK (Java Development Kit)
 * Compilador (javac)

 * Ferramentas de desenvolvimento

 * JRE (Java Runtime Environment)

### JRE (Java Runtime Environment)
 * JVM (Java Virtual Machine)

 * Bibliotecas padrão

 * Ambiente de execução

### JVM (Java Virtual Machine)
 * Interpreta bytecode

 * Otimização em tempo de execução (JIT)

 * Gerenciamento de memória

 ## 📈 Versões e Ecossistema
### Edições do Java
Java SE (Standard Edition) - Para desktop e aplicações básicas

Java EE (Enterprise Edition) - Para aplicações corporativas

Java ME (Micro Edition) - Para dispositivos embarcados

### Principais Frameworks
Spring - Para aplicações enterprise

Hibernate - ORM para banco de dados

Jakarta EE - Especificações enterprise

Maven/Gradle - Gerenciamento de dependências

## 🌟 Vantagens do Java
Pontos Fortes
Grande comunidade e documentação

Multiplataforma nativa

Performance otimizada (JIT compiler)

Segurança robusta

Escalabilidade para grandes sistemas

Ampla adoção no mercado corporativo

## ⚠️ Desvantagens
Sintaxe verbosa comparada a linguagens modernas

Consumo de memória mais elevado

Tempo de inicialização pode ser lento

Menos flexível que linguagens dinâmicas

## 🎯 Áreas de Aplicação
### 💻 Desktop
Aplicações Swing/JavaFX

Softwares corporativos

### 🌐 Web
Servidores (Tomcat, Jetty)

Aplicações Spring Boot

Microservices

### 📱 Mobile
Aplicações Android (embora Kotlin seja mais moderno)

### 🏢 Enterprise
Sistemas bancários

E-commerce

Big Data (Hadoop, Spark)

### 🔧 Embarcados
IoT devices

Smart cards

#### 🔄 Java Moderno (Versões 8+)
Recursos Importantes
Lambda Expressions - Programação funcional

Stream API - Processamento de dados

Modules (Java 9) - Sistema de módulos

Records (Java 16) - Classes de dados

Pattern Matching - Simplificação de código

```Java
// Java moderno - Records e Streams
public record Usuario(String nome, int idade) {}

List<Usuario> usuarios = //...
usuarios.stream()
        .filter(u -> u.idade() > 18)
        .map(Usuario::nome)
        .forEach(System.out::println);

```
###  JVM vs JRE vs JDK - Diferenças Detalhadas

#### 🏗️ Visão Geral da Arquitetura
```text
┌─────────────────────────────────────────────────────────────┐
│                    JDK (Java Development Kit)               │
│  ┌───────────────────────────────────────────────────────┐  │
│  │                 JRE (Java Runtime Environment)        │  │
│  │  ┌─────────────────────────────────────────────────┐  │  │
│  │  │            JVM (Java Virtual Machine)           │  │  │
│  │  │                                                 │  │  │
│  │  │  • Class Loader                                 │  │  │
│  │  │  • Memory Areas (Heap, Stack, etc)              │  │  │
│  │  │  • Execution Engine                             │  │  │
│  │  └─────────────────────────────────────────────────┘  │  │
│  │                                                       │  │
│  │  • Biblioteca de Classes (java.lang, java.util, etc) │  │
│  │  • Arquivos de Suporte                               │  │
│  └───────────────────────────────────────────────────────┘  │
│                                                             │
│  • Ferramentas de Desenvolvimento (javac, jar, javadoc)   │
│  • Debuggers (jdb)                                        │
│  • Utilitários (jconsole, jstat)                         │
└─────────────────────────────────────────────────────────────┘
```
####  JVM (Java Virtual Machine)
O que é:
Máquina Virtual que executa bytecode Java

Especificação abstrata - cada plataforma tem sua implementação

"Motor de execução" do Java

#### Funções Principais:
```Java
// Arquivo .java → Compilação → Arquivo .class → JVM
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello JVM!");
    }
}
```
#### Componentes da JVM:
1. Class Loader - Carrega classes .class

2. Memory Areas:

Heap - Objetos e instâncias

Stack - Variáveis locais e chamadas de método

Method Area - Metadados das classes

3. Execution Engine:

JIT Compiler - Compila bytecode para nativo

Garbage Collector - Gerencia memória automaticamente

#### Características:
✅ Platform Dependent (Depende da plataforma)

✅ Interpreta bytecode

✅ Otimização em tempo de execução

✅ Gerenciamento automático de memória

#### 📦 JRE (Java Runtime Environment)
O que é:
Ambiente de execução para aplicações Java

Contém JVM + Bibliotecas padrão

Necessário apenas para EXECUTAR programas Java

#### Componentes do JRE:
```text
JRE = JVM + Bibliotecas + Arquivos de Suporte
     └── java.lang (String, Object, System)
     └── java.util (Collections, Date)
     └── java.io (File, Streams)
     └── java.net (Sockets, URL)
     └── java.awt/swing (GUI - em versões antigas)
```
##### Quando usar:
❌ Não desenvolve aplicações

✅ Apenas executa aplicações Java

✅ Usuário final que roda software Java

✅ Servidores de produção

##### Exemplo de uso:
```bash
# Com JRE instalado, você pode executar:
java -jar minha-aplicacao.jar
java MinhaClasse
```
#### 🛠️ JDK (Java Development Kit)
O que é:
Kit completo de desenvolvimento Java

Contém JRE + Ferramentas de desenvolvimento

Necessário para PROGRAMAR em Java

##### Componentes do JDK:
```text
JDK = JRE + Ferramentas de Desenvolvimento
     └── javac (Compilador)
     └── jar (Empacotador)
     └── javadoc (Documentação)
     └── jdb (Debugger)
     └── jconsole (Monitoramento)
```

#### Ferramentas Principais:
```bash
# Compilar código fonte
javac MeuPrograma.java

# Executar programa
java MeuPrograma

# Criar arquivo JAR
jar cf meu-app.jar *.class

# Gerar documentação
javadoc MeuPrograma.java

```
#### Quando usar:
✅ Desenvolve aplicações Java

✅ Compila código fonte

✅ Debug e teste de aplicações

✅ Desenvolvedores e programadores

### 📊 Tabela Comparativa
|Aspecto|	JVM|	JRE|	JDK|
|----------|---------|-------------|---------|
|Finalidade|	Executar bytecode|	Executar aplicações|	Desenvolver aplicações|
|Contém|	Runtime engine|	JVM + Bibliotecas|	JRE + Ferramentas dev|
|Para quem|	Sistema runtime|	Usuário final|	Desenvolvedor|
|Plataforma|	Dependente|	Dependente|	Dependente|
|Tamanho|	Menor|	Médio|	Maior|

### 🔄 Fluxo de Desenvolvimento
#### 1. Desenvolvimento (JDK)
```Java
// Desenvolvedor escreve código
public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
}
```

#### 2. Compilação (JDK)
```bash
# JDK compila para bytecode
javac Calculator.java
# Gera: Calculator.class
```

#### 3. Execução (JRE/JVM)
```bash
# JRE/JVM executa o bytecode
java Calculator
```

### 🎯 Exemplo Prático
#### Cenário 1: Usuário Final
```bash
# Usuário precisa apenas do JRE
# Baixa e instala JRE
java -jar minecraft.jar
```

#### Cenário 2: Desenvolvedor
```bash
# Desenvolvedor precisa do JDK
# Baixa e instala JDK
javac MeuApp.java
java MeuApp
jar cvf meu-app.jar *.class
```
### 📦 Resumo Visual
```text 
┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐
│   DESENVOLVEDOR │    │    USUÁRIO      │    │    SISTEMA      │
│                 │    │                 │    │                 │
│      JDK        │    │      JRE        │    │      JVM        │
│   (Programar)   │    │   (Executar)    │    │  (Executar)     │
└─────────────────┘    └─────────────────┘    └─────────────────┘
```

##### Em resumo:

🛠️ JDK = Para desenvolver (contém tudo)

📦 JRE = Para executar (contém JVM + bibliotecas)

🤖 JVM = Para rodar bytecode (parte do JRE)

Desenvolvedor instala JDK, usuário final instala JRE! 🎯

# 📚 Tipos de Dados Primitivos e Wrappers em Java

## 🎯 Tipos Primitivos

### 🔢 **Numéricos Inteiros**

| Tipo | Tamanho | Intervalo | Valor Default | Exemplo |
|------|---------|-----------|---------------|---------|
| `byte` | 8 bits | -128 a 127 | 0 | `byte idade = 25;` |
| `short` | 16 bits | -32.768 a 32.767 | 0 | `short ano = 2024;` |
| `int` | 32 bits | ±2.1 bilhões | 0 | `int populacao = 2140000000;` |
| `long` | 64 bits | ±9.2 quintilhões | 0L | `long estrelas = 1000000000000L;` |

### 🔢 **Numéricos de Ponto Flutuante**

| Tipo | Tamanho | Precisão | Valor Default | Exemplo |
|------|---------|----------|---------------|---------|
| `float` | 32 bits | 6-7 dígitos | 0.0f | `float preco = 29.99f;` |
| `double` | 64 bits | 15-16 dígitos | 0.0d | `double pi = 3.14159265359;` |

### ✨ **Outros Primitivos**

| Tipo | Tamanho | Uso | Valor Default | Exemplo |
|------|---------|-----|---------------|---------|
| `char` | 16 bits | Caractere Unicode | `\u0000` | `char letra = 'A';` |
| `boolean` | 1 bit | true/false | `false` | `boolean ativo = true;` |

## 📦 Classes Wrapper

### **O que são Wrappers?**
- **Classes que encapsulam** tipos primitivos
- **Permitem usar primitivos como objetos**
- **Necessárias para Collections** (List, Set, Map)

### **Tabela de Wrappers Correspondentes**

| Primitivo | Wrapper | Exemplo |
|-----------|---------|---------|
| `byte` | `Byte` | `Byte valor = 10;` |
| `short` | `Short` | `Short codigo = 100;` |
| `int` | `Integer` | `Integer idade = 25;` |
| `long` | `Long` | `Long timestamp = 1700000000000L;` |
| `float` | `Float` | `Float altura = 1.75f;` |
| `double` | `Double` | `Double peso = 68.5;` |
| `char` | `Character` | `Character letra = 'X';` |
| `boolean` | `Boolean` | `Boolean status = true;` |

