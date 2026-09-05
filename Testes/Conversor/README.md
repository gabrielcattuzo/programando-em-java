# Conversor de Unidades em Java

Projeto de terminal desenvolvido para praticar os fundamentos da linguagem Java. O programa possui dois sistemas independentes: conversões tradicionais e conversões utilizadas na aviação.

## Funcionalidades

### Conversões tradicionais

- Celsius e Fahrenheit;
- quilômetros e milhas;
- quilogramas e libras;
- quilômetros por hora e metros por segundo.

### Conversões de aviação

- nós e quilômetros por hora;
- pés e metros;
- milhas náuticas e quilômetros;
- libras e quilogramas;
- galões americanos e litros;
- Flight Level e pés;
- massa e volume de Jet A/Jet A-1;
- massa e volume de AVGAS;
- combustível com densidade informada pelo usuário.

## Estrutura do projeto

```text
conversor-unidades-java/
├── Main.java
├── Conversor.java
├── README.md
└── .gitignore
```

- `Main.java`: contém a execução do programa, menus, leitura e validação dos dados.
- `Conversor.java`: contém as fórmulas e constantes usadas nas conversões.
- `.gitignore`: impede que arquivos compilados e configurações das IDEs sejam enviados ao Git.

## Como o programa funciona

Ao iniciar, o usuário escolhe entre os dois sistemas:

```text
1 - Conversões tradicionais
2 - Sistema de conversões de aviação
0 - Encerrar
```

A seleção inicial utiliza `if`, `else if` e `else`. Dentro de cada sistema, um `switch` encaminha o usuário para a conversão escolhida. Os menus usam laços `do/while`, permitindo realizar várias operações sem reiniciar o programa.

## Requisitos

- Java Development Kit (JDK) 8 ou superior;
- terminal, PowerShell ou uma IDE como IntelliJ IDEA, Eclipse ou VS Code.

Verifique a instalação do Java:

```bash
java -version
javac -version
```

## Compilação e execução

Abra o terminal na pasta do projeto e execute:

```bash
javac Main.java Conversor.java
java Main
```

No PowerShell, um exemplo seria:

```powershell
cd C:\caminho\para\conversor-unidades-java
javac Main.java Conversor.java
java Main
```

Os arquivos `.class` serão gerados na compilação, mas não serão rastreados pelo Git porque estão incluídos no `.gitignore`.

## Exemplos

### Velocidade em nós

Um nó corresponde exatamente a uma milha náutica por hora:

```text
100 kt = 185,20 km/h
```

### Altitude em pés

```text
10.000 ft = 3.048 m
```

### Flight Level

O número do Flight Level representa centenas de pés:

```text
FL100 = 10.000 ft
FL350 = 35.000 ft
```

Flight Level se refere a uma superfície de pressão com o altímetro ajustado para a pressão padrão, portanto não é sempre equivalente à altitude real da aeronave acima do nível médio do mar.

### Combustível

A conversão entre massa e volume utiliza:

```text
volume em litros = massa em kg / densidade em kg/L
massa em kg = volume em litros × densidade em kg/L
```

O programa fornece como referência:

| Combustível | Densidade aproximada |
| --- | ---: |
| Jet A/Jet A-1 | 0,80 kg/L |
| AVGAS | 0,72 kg/L |

Exemplo:

```text
800 kg de Jet A-1 / 0,80 kg/L = 1.000 litros
```

As densidades são aproximações didáticas. A densidade real varia conforme a temperatura, o lote e a especificação do produto. O programa permite informar outra densidade, mas seus resultados não devem ser utilizados para abastecimento, cálculo de peso e balanceamento ou planejamento real de voo.

## Conceitos de Java praticados

- classes e métodos;
- métodos e constantes `static`;
- modificadores `public` e `private`;
- estruturas `if/else` e `switch`;
- laços `do/while` e `while`;
- entrada de dados com `Scanner`;
- tratamento de entradas inválidas com `try/catch`;
- separação de responsabilidades entre classes.

## Possíveis melhorias

- guardar um histórico das conversões em um `ArrayList`;
- exportar o histórico para um arquivo `.txt`;
- adicionar uma interface gráfica com Swing ou JavaFX;
- criar testes automatizados com JUnit;
- adicionar conversões de temperatura entre Celsius e Kelvin;
- aceitar uma tabela de densidade do combustível em função da temperatura.

## Aviso

Este projeto tem finalidade exclusivamente educacional. As conversões comuns usam constantes padronizadas, mas os cálculos relacionados a combustível e Flight Level exigem dados operacionais adicionais em situações reais.
