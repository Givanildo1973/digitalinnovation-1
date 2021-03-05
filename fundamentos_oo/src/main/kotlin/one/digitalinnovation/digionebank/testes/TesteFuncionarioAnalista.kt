package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val joao = Analista(nome = "Joao Pedro", cpf: "13151050808", salario: 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}

