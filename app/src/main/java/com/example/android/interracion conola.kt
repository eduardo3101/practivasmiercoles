package com.example.android



fun main(parametro: Array<String>){
    print("ingrese el sueldo del empleado:")
    val sueldo = readln().toDouble()
    if (sueldo> 3000){
        println("Pagar impuestos")
    }

}

