package br.com.alura

fun main() {

    val assistiramCursoAndroid: Set<String> = setOf<String>("Alex", "Fran", "Gui", "Maria")
    val assistiramcursoKotlin: Set<String> = setOf<String>("Alex", "Paulo", "Maria")
    val assistiramAmbos: MutableSet<String> = mutableSetOf()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramcursoKotlin)

    println(assistiramAmbos.distinct())
    println()

    println(assistiramcursoKotlin - assistiramCursoAndroid)
    println(assistiramcursoKotlin subtract assistiramCursoAndroid)
    println()

    println(assistiramcursoKotlin + assistiramCursoAndroid)
    println(assistiramcursoKotlin union assistiramCursoAndroid)
    println()

    println(assistiramcursoKotlin intersect assistiramCursoAndroid)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet())

}
