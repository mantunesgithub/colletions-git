package br.com.alura

public fun main() {
    //    SET o elemento não se repete (Pode ser String, Int, Object)
    val assistiramCursoAndroid: Set<String> = setOf("Marcio", "Ivan", "Maria", "Claudio, Pedro")
    println("Android => $assistiramCursoAndroid")
    val assistiramCursoKotlin = listOf("Marcio", "João", "Maria", "José", "Bob")
    println("Kotlin => $assistiramCursoKotlin")
    var assistiramAmbos = mutableSetOf<String>()
//Podemos fazer Assim
    assistiramAmbos.addAll(assistiramCursoAndroid)
    println("Ambos-Android: $assistiramAmbos")
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Ricardo")
    println("Ambos sincronizados: $assistiramAmbos")

// Ou Podemos fazer Assim
//      println("Ambos: " + (assistiramCursoAndroid + assistiramCursoKotlin))
// Ou Podemos fazer Assim
//    println("Union: " + (assistiramCursoAndroid union assistiramCursoKotlin))
//
//// Ou Podemos fazer Assim Extração
//    println("Subtract (A-K): " + (assistiramCursoAndroid - assistiramCursoKotlin))
//    //ou no lugar do (-) colocar subtract dara mesmo resultado
//// Ou Podemos fazer Assim Intersection
//    println("Intersect: " + (assistiramCursoAndroid intersect assistiramCursoKotlin)) // intersecção
//
//    assistiramAmbos.addAll(assistiramCursoAndroid)
//    assistiramAmbos.addAll(assistiramCursoKotlin)
//    println("Ambos: $assistiramAmbos")
//
//    val assitiramList: MutableList<String> = assistiramAmbos.toMutableList()
//    assitiramList.add("Marcio")
//    println("Adiciona - MutableLIst" + assitiramList)
//    println("Elimina com Set" + assitiramList.toSet())
}
