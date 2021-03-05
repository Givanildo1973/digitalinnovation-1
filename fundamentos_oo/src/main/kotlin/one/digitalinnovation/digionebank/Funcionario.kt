package one.digitalinnovation.digionebank

abstract class Funcionario(
    nome: String,
     cpf: String,
          val salario: Int
): Pessoa(nome, cpf) {
    abstract fun calculoAuxilio();
}