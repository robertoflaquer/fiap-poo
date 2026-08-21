# FiapRide - Interruptor

Projeto desenvolvido na disciplina de **Programação Orientada a Objetos** da FIAP.

## O que o objeto representa

O objeto `Interruptor` representa um interruptor elétrico inteligente (como os usados em automação residencial). Ele possui atributos que descrevem suas características físicas e um estado que indica se está ligado ou desligado.

## Diagrama de Classes (UML)

```
+---------------------------------------+
|            Interruptor                |
+---------------------------------------+
| - tamanho : int                       |
| - modelo  : String                    |
| - cor     : String                    |
| - ligado  : boolean                   |
+---------------------------------------+
| + Interruptor(int, String, String)    |
| + ligar() : void                      |
| + desligar() : void                   |
| + setCor(String) : void               |
| + setTamanho(int) : void              |
| + getTamanho() : int                  |
| + getModelo() : String                |
| + getCor() : String                   |
| + isLigado() : boolean                |
| + toString() : String                 |
+---------------------------------------+
```

## Atributos

| Atributo  | Tipo    | Descrição                                    |
|-----------|---------|----------------------------------------------|
| tamanho   | int     | Tamanho do interruptor (1 a 5)               |
| modelo    | String  | Modelo do interruptor (ex: "Wifi", "Touch")  |
| cor       | String  | Cor do interruptor (ex: "Branco", "Preto")   |
| ligado    | boolean | Estado atual: `true` = ligado, `false` = desligado |

## Métodos e Regras de Negócio

### `ligar()`
Liga o interruptor.
- **Regra:** não é possível ligar um interruptor que já está ligado.

### `desligar()`
Desliga o interruptor.
- **Regra:** não é possível desligar um interruptor que já está desligado.

### `setCor(String cor)`
Altera a cor do interruptor.
- **Regra:** a cor não pode ser nula ou vazia.

### `setTamanho(int tamanho)`
Altera o tamanho do interruptor.
- **Regra:** o tamanho deve ser um valor entre 1 e 5.

## Como usar

```java
// Criar o interruptor
Interruptor interruptor = new Interruptor(2, "Wifi", "Branco");

// Ligar e desligar
interruptor.ligar();
interruptor.desligar();

// Alterar atributos com validação
interruptor.setCor("Preto");
interruptor.setTamanho(3);

// Consultar estado
System.out.println(interruptor.isLigado());
System.out.println(interruptor);
```

## Como executar

1. Importe o projeto no Eclipse
2. Execute a classe `SistemaPrincipal.java`
3. Observe no console os testes com valores válidos e inválidos
