package com.example.ejercicio2_multimedia

fun main() {
    val frecuenciaLetras = mutableMapOf<Char, Int>()
    print("Introduce un texto: ")
    val texto = readln().trim().lowercase()
    val letras = texto.toCharArray()
    for (letra in letras) {
        if (letra.isLetter()) {
            if (frecuenciaLetras.containsKey(letra)) {
                frecuenciaLetras[letra] = frecuenciaLetras.getOrDefault(letra, 0) + 1
            } else {
                frecuenciaLetras[letra] = 1
            }
        }
    }
    println("Para la palabra introducida:")
    val ordenado = frecuenciaLetras.toList().sortedBy {
        (_, valor) -> valor
    }.asReversed().toMap()
    println(ordenado)
}