package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Emerson"
    var cpf: String = "111.222.333-45"

}

fun main () {
    val emerson = Pessoa()
    println(emerson.nome)
    println(emerson.cpf)
}