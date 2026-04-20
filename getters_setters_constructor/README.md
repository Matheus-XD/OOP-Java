### 📘 README — Getters, Setters & Constructors

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

### 🔹 Pencil 

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

## 🚀 Objetivo

Esses projetos ajudam a consolidar a base da POO em Java, preparando para conceitos mais avançados como:

* Herança
* Polimorfismo
* Abstração
* Interfaces

---

