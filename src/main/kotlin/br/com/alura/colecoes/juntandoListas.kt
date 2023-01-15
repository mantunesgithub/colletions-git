package br.com.alura
fun main () {
    juntandoListas()
}
public fun juntandoListas() {
    //    //Podemos juntar as Listas assim
//    val assistiramCursoAndroid = listOf("Marcio", "Ivan", "Maria", "Claudio")
//    val assistiramCursoKptlin = listOf("Marcio", "João", "Maria", "José")
//    val assistiramAmbos = mutableListOf<String>()
//    assistiramAmbos.addAll(assistiramCursoAndroid)
//    println("Ambos: $assistiramAmbos")
//    assistiramAmbos.addAll(assistiramCursoKptlin)
//    println("Ambos: $assistiramAmbos")
    //Ou Podemos juntar as Listas assim
    val assistiramCursoAndroid = listOf("Marcio", "Ivan", "Maria", "Claudio")
    val assistiramCursoKptlin = listOf("Marcio", "João", "Maria", "José")
    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKptlin
    println("Ambos: $assistiramAmbos")
//  Para não imprimir repetido
    println("Ambos com distintic: ${assistiramAmbos.distinct()}")
}