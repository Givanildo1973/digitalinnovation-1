package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa

fun main() {
    val Givanildo = Pessoa(nome = "Givanildo Santos", cpf = "13151050808")
    println(Givanildo.nome)
    println(Givanildo.cpf)

    val joao = Funcionario(nome = "Givanildo Santos", cpf: "13151050808")
    println(joao.nome)
    println(joao.cpf)
}