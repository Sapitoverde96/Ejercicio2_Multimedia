package com.example.ejercicio2_multimedia

val listaCSV = listOf(
    "NOMBRE, NOTA_1, NOTA_2, NOTA_3",
    "Ana, 7, 8, 9",
    "Luis, 5, 6, 4",
    "Marta, 9, 10, 8")

fun notaMedia(n01: Int, n02: Int, n03: Int): Float {
    return (n01 + n02 + n03) / 3.0F
}

fun calificacion(media: Float): String {
    return when {
        media >= 9 -> "Sobresaliente"
        media >= 7 -> "Notable"
        media >= 5 -> "Aprobado"
        else -> "Suspenso"
    }
}

fun main() {
    for (elemento in 1 until listaCSV.size) {
        val linea = listaCSV[elemento]
        val fragmento = linea.split(",")
        val nombre = fragmento[0].trim()
        val nota01 = fragmento[1].trim().toInt()
        val nota02 = fragmento[2].trim().toInt()
        val nota03 = fragmento[3].trim().toInt()
        val notaMD = notaMedia(nota01,nota02, nota03)
        println("Nombre: $nombre")
        println("Nota 1: $nota01")
        println("Nota 2: $nota02")
        println("Nota 3: $nota03")
        println("Nota M: $notaMD")
        println(calificacion(notaMD))
        println()
    }
}