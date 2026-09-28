package com.example.ejercicio2_multimedia

fun main() {
    print("Escribe una contraseña: ")
    val contrasena = readln()
    if (contrasena.length < 8) {
        println("La contraseña debe tener al menos 8 caracteres")
    } else if (!contrasena.any { it.isUpperCase() }) {
        println("La contraseña debe tener al menos una letra mayúscula")
    } else if (!contrasena.any { it.isLowerCase() }) {
        println("La contraseña debe tener al menos una letra minúscula")
    } else if (!contrasena.any { it.isDigit() }) {
        println("La contraseña debe tener al menos un número")
    } else if (!contrasena.any { !it.isLetterOrDigit() }) {
        println("La contraseña debe tener al menos un carácter especial")
    } else {
        println("La contraseña es válida")
    }
}