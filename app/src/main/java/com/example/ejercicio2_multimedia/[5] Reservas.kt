package com.example.ejercicio2_multimedia

fun main() {
    val asientosTotales = arrayOf(
        arrayOf("A1", "A2", "A3", "A4", "A5"),
        arrayOf("B1", "B2", "B3", "B4", "B5"),
        arrayOf("C1", "C2", "C3", "C4", "C5"),
        arrayOf("D1", "D2", "D3", "D4", "D5"),
        arrayOf("E1", "E2", "E3", "E4", "E5")
    )
    val asientosReservados = mutableMapOf<String?, Boolean>()
    do {
        println("1. Reservar asiento")
        println("2. Cancelar asiento")
        println("3. Mostrar asientos")
        println("4. Salir")
        print("Elige una opción: ")
        val opcion = readln().toIntOrNull() ?: 4
        when (opcion) {
            1 -> {
                println("Asientos disponibles:")
                for (fila in asientosTotales) {
                    println()
                    print("Fila ${fila[0][0]}: ")
                    for (asiento in fila) {
                        if (!asientosReservados.containsKey(asiento)) {
                            print("$asiento ")
                        } else {
                            print("[] ")
                        }
                    }
                }
                println()
                print("Elige un asiento: ")
                val asiento: String = readln().uppercase()
                if (!asiento.matches(Regex("[A-E][1-5]"))) {
                    println("Asiento inválido")
                } else if (!asientosReservados.containsKey(asiento)) {
                    asientosReservados[asiento] = true
                    println("Asiento $asiento reservado")
                } else {
                    println("Asiento $asiento ya reservado")
                }
                println()
            }
            2 -> {
                println("Asientos reservados: ")
                for (fila in asientosTotales) {
                    println()
                    print("Fila ${fila[0][0]}: ")
                    for (asiento in fila) {
                        if (asientosReservados.containsKey(asiento)) {
                            print("$asiento ")
                        } else {
                            print("[] ")
                        }
                    }
                }
                println()
                print("Elige un asiento: ")
                val asiento: String = readln().uppercase()
                if (!asiento.matches(Regex("[A-E][1-5]"))) {
                    println("Asiento inválido")
                } else if (asientosReservados.containsKey(asiento)) {
                    asientosReservados.remove(asiento)
                    println("Reserva de $asiento cancelada")
                } else {
                    println("El asiento $asiento no esta reservado")
                }
                println()
            }
            3 -> {
                println("Asientos totales:")
                for (fila in asientosTotales) {
                    println()
                    print("Fila ${fila[0][0]}: ")
                    for (asiento in fila) {
                        if (!asientosReservados.containsKey(asiento)) {
                            print("$asiento ")
                        }
                    }
                }
                println()
            }
            4 -> break
        }
    } while (true)
}