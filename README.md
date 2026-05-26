```markdown
# Sistema de Gerenciamento de Estoque de Hardware 🖥️📦

Este projeto é um laboratório prático desenvolvido para consolidar e aplicar conceitos avançados da linguagem Java, com foco em **Generics, Curingas Delimitados (Bounded Wildcards), Polimorfismo e Encapsulamento**.

O sistema simula o controle de estoque de uma loja de informática, permitindo o cadastro de diferentes componentes de hardware (como Placas-Mãe e Memórias RAM) e a transferência segura de itens entre diferentes estoques.

## 🚀 Conceitos Java Aplicados

### 1. Generics (`Estoque<T>`)
A classe `Estoque` foi projetada utilizando Generics. O parâmetro `<T>` permite que a classe seja reaproveitada para criar estoques específicos (ex: um estoque que aceita apenas memórias) ou estoques genéricos, garantindo a segurança de tipos (*Type Safety*) em tempo de compilação e evitando *casts* manuais perigosos.

### 2. Curingas Delimitados / Bounded Wildcards (`<? extends T>`)
Para permitir a comunicação e transferência de dados entre diferentes objetos de estoque, foi aplicado o conceito de **Upper Bounded Wildcards** através da regra do **PECS (Producer Extends)**.

```java
public void transferirPecasDeEstoque(Estoque<? extends T> outroEstoque) {
    this.pecas.addAll(outroEstoque.getPecas());
}

```

Graças ao `? extends T`, o método aceita receber um estoque de uma subclasse específica (como `Estoque<MemoriaRam>`) e extrair seus dados com segurança para um estoque de uma superclasse (como `Estoque<Peca>`), impedindo a operação inversa em tempo de compilação.

### 3. Polimorfismo e Herança

* **Classe Mãe (`Peca`):** Centraliza os atributos comuns a qualquer componente de hardware (`nomePeca`, `quantidadePeca`, `valorPeca`).
* **Classes Filhas (`PlacaMae` e `MemoriaRam`):** Herdam o comportamento base reutilizando o construtor ancestral através do método `super()` e sobrescrevem o método `toString()` para fornecer uma exibição personalizada no console.

---

## 🛠️ Estrutura do Projeto

O projeto está dividido em pacotes seguindo boas práticas de organização:

```text
src/
├── application/
│   └── Program.java         # Classe principal com a lógica do console e Scanner
└── model/
    └── entities/
        ├── Peca.java        # Classe base (Superclasse)
        ├── PlacaMae.java    # Subclasse de Peca
        ├── MemoriaRam.java  # Subclasse de Peca
        └── Estoque.java     # Classe Genérica com as regras do estoque

```

---

## 💻 Como Executar o Projeto

1. Certifique-se de ter o **Java JDK 11 ou superior** instalado na sua máquina.
2. Clone este repositório ou baixe os arquivos fonte.
3. Abra o projeto na sua IDE de preferência (IntelliJ IDEA, Eclipse, VS Code).
4. Execute a classe `Program.java`.

### Exemplo de Uso no Console:

```text
Quantas placas-mãe serão registradas?: 1
#1 placa-mãe: 
Nome: ASUS ROG Strix B550-F
Quantidade: 5
Valor: R$1150.00

Quantas memórias-ram serão registradas?: 1
#1 memória-ram: 
Nome: Corsair Vengeance 16GB 3200MHz
Quantidade: 10
Valor: R$350.00

Estoque atualizado:
Placa-Mãe: ASUS ROG Strix B550-F, Quantidade em estoque: 5, Valor: R$1150.0
Memória Ram: Corsair Vengeance 16GB 3200MHz, Quantidade em estoque: 10, Valor: R$350.0

```

---

## 🧠 Aprendizados Coletados

* **Manipulação de Referências:** Compreensão de como o Java gerencia referências de listas (`ArrayList`) na memória heap e como métodos acessores (`getters`) expõem essas referências para operações como `addAll()`.
* **Identidade de Objetos (`this`):** Fixação do conceito do operador `this` para diferenciar o objeto invocador atual das variáveis passadas por parâmetro em escopos concorrentes.

```

```
