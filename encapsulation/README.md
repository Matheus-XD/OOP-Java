### 📘 README — Encapsulation

Este diretório reúne projetos em Java focados na prática de conceitos fundamentais da Programação Orientada a Objetos (POO), especialmente:

* Encapsulamento
* Uso de **getters** e **setters**
* Criação de **construtores**
* Validação de dados
* Organização de classes e métodos

Os projetos aqui simulam situações reais simples para reforçar boas práticas no controle e manipulação de atributos.

---

## 📂 Projetos

### 🔹 Employee Salary Raise

Programa que gerencia os dados de um funcionário.

**Funcionalidades:**

* Armazena nome, salário bruto e imposto
* Calcula o salário líquido (`grossSalary - tax`)
* Exibe os dados do funcionário
* Permite aumentar o salário com base em uma porcentagem

**Conceitos praticados:**

* Encapsulamento com atributos privados
* Uso de getters e setters
* Métodos de cálculo (`netSalary`)
* Atualização de estado com lógica (`increaseSalary`)

---

### 🔹 Pencil Simulation

Simulação simples do funcionamento de uma caneta.

**Funcionalidades:**

* Define modelo, cor, espessura da ponta, carga e estado da tampa
* Exibe o status da caneta
* Permite tampar e destampar
* Verifica se é possível escrever

**Conceitos praticados:**

* Uso de construtor para inicialização
* Controle de estado com boolean (`capped`)
* Métodos de comportamento (`write`, `cap`, `uncap`)
* Encapsulamento completo da classe

---

### 🔹 Student Control System

Sistema de controle de alunos com validação de dados.

**Regras implementadas:**

* A matrícula não pode ser alterada após a criação
* O nome não pode ser vazio
* A idade deve estar entre 0 e 120
* A nota final deve estar entre 0 e 10

**Funcionalidades:**

* Cadastro de aluno com validações
* Exibição dos dados do aluno

**Conceitos praticados:**

* Imutabilidade parcial (matrícula sem setter)
* Validação dentro dos setters
* Proteção contra dados inválidos
* Regras de negócio aplicadas na classe

---

### 🔹 Bank Account Simulation

Simulação de um sistema de conta bancária com operações básicas.

**Funcionalidades:**

* Abertura de conta (corrente `"ca"` ou poupança `"sa"`)
* Depósito e saque de dinheiro
* Pagamento de taxa mensal (dependendo do tipo da conta)
* Encerramento de conta com validações
* Exibição das informações da conta

**Regras implementadas:**

* Conta só pode ser usada se estiver ativa
* Não é possível sacar mais do que o saldo disponível
* Não é possível fechar a conta com saldo positivo ou negativo
* Taxas diferentes para tipos de conta (corrente e poupança)

**Conceitos praticados:**

* Uso de **interface** (`bankInterface`)
* Encapsulamento com controle de acesso (setter privado para saldo)
* Regras de negócio dentro dos métodos (validações)
* Manipulação de estado do objeto (ativo/inativo)
* Organização de operações estilo CRUD

---------------

