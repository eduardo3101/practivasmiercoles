package com.example.android

fun main() {
    print("Ingrese el dia de la semana:  ")
    val DiaSemana= readln().toDouble()

    when (DiaSemana){
        1.0 -> println("lunes")
        2.0 -> println("Martes")
        3.0 -> println("Miercoles")
        4.0 -> println("Jueves")
        5.0 -> println("Viernes")
        else -> println("Fin de semana")

    }
}