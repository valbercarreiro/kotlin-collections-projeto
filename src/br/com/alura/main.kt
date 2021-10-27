package br.com.alura

fun main() {

    val banco = BancoDeNomes()
    val nomesSalvos = banco.nomes

    banco.salva("Alex")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)

}

class BancoDeNomes {

    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: MutableList<String> = mutableListOf("Alex", "Fran", "Gui", "Maria", "Ana")

    nomes.add("Paulo")
    nomes.remove("Alex")

    println(nomes)
}
