package br.com.alura.colecoes

fun main() {
    testaCopia()
}

fun testaColecao() {
    val nomes: MutableCollection<String> = mutableListOf(
        "Marcio", "Fran", "Alex", "Maria", "Ana"
    )
    println("Lista Mutavel:")
    for (nome in nomes) {
        println(nome)
    }
    println("Fim Lista Mutavel")
    nomes.add("João")
    nomes.remove("Alex")
    println("Lista com add e remove = $nomes")
    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamamho da coleção ${nomes.size}")
}


fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
    println("banco de nome ${banco.nomes}")
    banco.salva("Alex")
    banco.salva("Joao")
    println("nomes salvos $nomesSalvos")
    println("banco de nomes ${BancoDeNomes().getLista()}")
}

class BancoDeNomes {
    //private val dados = mutableListOf<String>()
    fun getLista(): List<String> {
        return dados.toList()
    }
    val nomes: List<String> get() = dados.toList()   //funciona = função getLista
        //O toList() garante que não conseguirao manipular a collections

    fun salva(nome: String) {
        dados.add(nome)
    }
    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao2() {
    val nomes: Collection<String> = mutableListOf(
        "Marcio", "Fran", "Alex", "Maria", "Ana"
    )
    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção ${nomes.size}")
}

