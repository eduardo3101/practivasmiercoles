package com.example.android

fun main(parametro: Array<String>){
    print("Ingrese su Altura:  ")
    var Altura = readln().toDouble()
    print("Ingrese su Peso:    ")
    var Peso = readln().toDouble()
    var Resultado1 = (Peso / (Altura*Altura))

    if (Resultado1<=18.5){
        println("está dentro de los valores correspondientes a “delgadez o bajo peso")
    }
    else if (Resultado1>=18.5 && Resultado1 <24.9){
        println("está dentro de los valores \"normales\" o de peso saludable")
    }
    else if (Resultado1>=25 && Resultado1 <29){
        println("está dentro de los valores correspondientes a sobrepeso")
    }
    else {
        println("superior, está dentro de los valores de obesidad")

    }

    println(Resultado1)
}






