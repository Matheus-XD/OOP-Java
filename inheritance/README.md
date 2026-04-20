### 📘 README — Herança (Inheritance)

Este diretório reúne projetos em Java focados no estudo de **Herança**, um dos pilares da Programação Orientada a Objetos (POO).

O objetivo desses projetos é entender como classes podem **herdar atributos e comportamentos**, além de aplicar:

* Reutilização de código
* Sobrescrita de métodos (**@Override**)
* Polimorfismo
* Uso de classes abstratas
* Especialização de comportamentos

---

## 📂 Projetos

### 🔹 Employee System (Inheritance)

Sistema de funcionários com diferentes tipos de cargos e regras de bônus.

**Funcionalidades:**

* Cadastro de funcionários com nome e salário
* Cálculo de bônus baseado no tipo de funcionário
* Exibição de informações completas (salário + bônus + salário atualizado)

**Regras implementadas:**

* Gerente recebe **20% de bônus**
* Desenvolvedor recebe **10% de bônus**
* Estagiário **não recebe bônus**

**Conceitos praticados:**

* Herança (`Manager`, `Developer`, `Intern` herdam de `Employee`)
* Sobrescrita de métodos (`calculateBonus`)
* Polimorfismo (mesmo método com comportamentos diferentes)
* Reutilização de código da classe base

---

### 🔹 School System (Inheritance + Abstraction)

Sistema escolar com diferentes tipos de pessoas e suas especializações.

**Estrutura:**

* Classe base abstrata: `Person`
* Classes derivadas:

  * `Student`
  * `Teacher`
  * `Worker`
  * `Guest`
* Classe derivada de outra subclasse:

  * `ScholarshipStudent` (herda de `Student`)

**Funcionalidades:**

* Armazenamento de dados comuns (nome, idade, sexo)
* Comportamentos específicos para cada tipo de pessoa
* Controle de mensalidade para alunos
* Sistema de bolsa de estudos com desconto na mensalidade

**Regras implementadas:**

* `Person` não pode ser instanciada diretamente (classe abstrata)
* Aluno bolsista paga mensalidade com desconto
* Professores possuem especialidade e salário
* Funcionários podem mudar de setor

**Conceitos praticados:**

* Herança em múltiplos níveis
* Uso de classe abstrata (`abstract class`)
* Sobrescrita de métodos (`toString`, `payfee`)
* Especialização de comportamento em subclasses
* Polimorfismo aplicado a diferentes tipos de objetos

------------------

