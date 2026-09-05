# 🎓 Sistema de Cadastro e Média de Alunos

Aplicação de terminal desenvolvida em **Java** para praticar conceitos básicos de Programação Orientada a Objetos, coleções e entrada de dados.

O sistema permite cadastrar alunos, armazenar suas notas, calcular automaticamente a média e gerenciar os registros através do RA.

---

## 🚀 Funcionalidades

O programa possui um menu interativo com as seguintes opções:

```text
===== CADASTRO DE ALUNOS =====
1 - Cadastrar aluno
2 - Listar alunos
3 - Buscar aluno pelo RA
4 - Remover aluno
0 - Encerrar
```

### Cadastro de aluno

Para cada aluno são armazenados:

* nome;
* RA;
* primeira nota;
* segunda nota.

O sistema impede o cadastro de dois alunos com o mesmo RA.

---

### Cálculo da média

A média é calculada automaticamente a partir das duas notas cadastradas.

```text
media = (nota1 + nota2) / 2
```

A classe `Aluno` é responsável por armazenar os dados e realizar os cálculos relacionados ao aluno.

---

### Validação das notas

O programa aceita somente notas entre:

```text
0 <= nota <= 10
```

Caso seja informado um valor inválido, o programa solicita uma nova entrada.

Também é possível utilizar vírgula ou ponto para valores decimais.

Exemplo:

```text
7,5
```

ou:

```text
7.5
```

---

### Busca por RA

O sistema permite localizar um aluno utilizando seu RA.

A comparação não diferencia letras maiúsculas de minúsculas através do método:

```java
equalsIgnoreCase()
```

---

### Remoção de alunos

Um aluno cadastrado pode ser removido informando seu RA.

Caso o RA não exista, o programa informa que o aluno não foi encontrado.

---

## 🗂️ Estrutura

```text
Media/
├── Aluno.java
├── main.java
└── README.md
```

### `Aluno.java`

Representa um aluno dentro do sistema.

A classe é responsável por armazenar informações como:

* nome;
* RA;
* notas.

Também possui métodos relacionados ao cálculo da média, situação acadêmica e exibição dos dados.

### `main.java`

Contém a execução principal da aplicação.

É responsável por:

* exibir os menus;
* receber dados do usuário;
* cadastrar alunos;
* buscar alunos;
* listar registros;
* remover alunos;
* validar entradas.

---

## 🧠 Conceitos de Java praticados

Este projeto utiliza conceitos fundamentais da linguagem Java:

* classes e objetos;
* construtores;
* atributos;
* métodos;
* encapsulamento;
* `ArrayList`;
* laço `for-each`;
* `Scanner`;
* `switch`;
* `do/while`;
* métodos `static`;
* tratamento de exceções com `try/catch`;
* validação de dados;
* comparação de `String`.

---

## ▶️ Como executar

### Requisitos

É necessário possuir o **JDK** instalado.

Verifique com:

```bash
java -version
javac -version
```

### Compilação

Abra o terminal dentro da pasta `Media` e execute:

```bash
javac Aluno.java main.java
```

### Execução

Depois da compilação:

```bash
java Main
```

---

## 💻 Exemplo de utilização

```text
===== CADASTRO DE ALUNOS =====
1 - Cadastrar aluno
2 - Listar alunos
3 - Buscar aluno pelo RA
4 - Remover aluno
0 - Encerrar

Escolha uma opção: 1

===== CADASTRO =====
Nome do aluno: Gabriel
RA do aluno: 123456
Digite a primeira nota: 8.5
Digite a segunda nota: 7.5

Aluno cadastrado com sucesso!
Média: 8.00
```

Depois do cadastro, o aluno permanece armazenado no `ArrayList` enquanto o programa estiver em execução.

---

## ⚠️ Persistência dos dados

Atualmente os alunos são armazenados apenas na memória através de um `ArrayList`.

Isso significa que os registros são perdidos quando o programa é encerrado.

Uma futura versão poderá utilizar arquivos ou banco de dados para persistir os dados.

---

## 🔮 Possíveis melhorias

Algumas funcionalidades que podem ser implementadas futuramente:

* edição dos dados de um aluno;
* cadastro de mais notas;
* cálculo de média ponderada;
* ordenação dos alunos por média;
* exibição da média geral da turma;
* aluno com maior e menor média;
* salvamento dos alunos em arquivo;
* banco de dados;
* testes automatizados com JUnit;
* interface gráfica;
* separação do projeto em mais classes.

---

## 📚 Objetivo

Este projeto foi desenvolvido para praticar os fundamentos de **Programação Orientada a Objetos em Java**, principalmente a interação entre objetos, coleções e métodos.

Ele faz parte do repositório [`programando-em-java`](../../README.md).
