package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {
    val maria = Analista(nome = "Maria do Carmo", cpf: "13151050808", salario: 5000.0)

    ImprimeRelatorioFuncionario.imprime(maria)
