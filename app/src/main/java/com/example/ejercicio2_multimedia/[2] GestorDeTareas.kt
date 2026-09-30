package com.example.ejercicio2_multimedia

var Tareas = mutableListOf<String>()

fun agregar(titulo: String) {
    Tareas.add(titulo)
}

fun completar(indice: Int) {
    if (!Tareas[indice].startsWith("[X] ")) {
        Tareas[indice] = "[X] " + Tareas[indice]
    }
}

fun listar() {
    for (tarea in Tareas) {
        if (!tarea.startsWith("[X]")) {
            println("[ ] $tarea")
        } else {
            println(tarea)
        }
    }
}
fun pendientes() {
    for (tarea in Tareas) {
        if (!tarea.startsWith("[X]")) {
            println("[ ] $tarea")
        }
    }
}

fun main() {
    var salir = false
    do {
        println("1. Agregar tarea")
        println("2. Completar tarea")
        println("3. Listar tareas")
        println("4. Listar tareas pendientes")
        println("5. Salir")
        val opcion = readln().toIntOrNull() ?: 0
        when (opcion) {
            1 -> {
                print("Ingrese el título de la tarea: ")
                val titulo = readln()
                agregar(titulo)
                println()
            }
            2 -> {
                print("Ingrese el índice de la tarea a completar: ")
                val indice = readln().toIntOrNull() ?: 0
                if (indice >= 0 && indice < Tareas.size) {
                    completar(indice)
                }
                println()
            }
            3 -> {
                listar()
                println()
            }
            4 -> {
                pendientes()
                println()
            }
            5 -> salir = true
            else -> {
                println("Opción inválida")
            }
        }
    } while (!salir)
}