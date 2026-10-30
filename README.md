# Padrão Strategy

## Objetivo
Formas alternativas de pagamento em um pedido: Pix, débito e crédito.

## Funcionamento
O pedido recebe a estratégia de pagamento em tempo de execução. Pix dá 5% de desconto; débito não altera o preço; crédito tem 2% sobre cada parcela que excede três.

## Tecnologias
- Java 11 ou superior
- Maven
- JUnit 5

## Estrutura
```text
padraoStrategy/
├── pom.xml
├── README.md
├── docs/
│   └── diagrama.png
└── src/
    ├── main/java/padraoStrategy/ (classes + Main.java)
    └── test/java/padraoStrategy/ (testes JUnit)
```

## Como executar no terminal
No diretório do projeto, execute:
```bash
mvn clean test
mvn compile exec:java
```

Também é possível abrir diretamente o `pom.xml` no IntelliJ IDEA ou Eclipse e executar a classe `padraoStrategy.Main`.

## Exemplo
Execute `Main.java` para ver o padrão em funcionamento.
A pasta `docs/` contém um diagrama ilustrativo das classes e/ou do fluxo.
