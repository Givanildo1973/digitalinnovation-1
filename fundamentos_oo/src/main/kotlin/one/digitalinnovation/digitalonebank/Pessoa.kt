package one.digitalinnovation.digitalonebank

class Pessoa {
    var nome: String = "Givanildo"
    var  cpf: String = "131.510.508-08"
        private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val Givanildo = Pessoa()


    println(Givanildo.pessoaInfo())

}