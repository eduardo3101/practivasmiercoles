package com.example.android

fun main(){
    var kiloInt:Int = 64
    var AlturaFloat:Float =1.5f
    var resultFlat:Float =(kiloInt /(AlturaFloat*AlturaFloat))

    if (resultFlat<=18.5){
        println("está dentro de los valores correspondientes a “delgadez o bajo peso")
    }
    else if (resultFlat>=18.5 && resultFlat <24.9){
        println("está dentro de los valores \"normales\" o de peso saludable")
    }
    else if (resultFlat>=25 && resultFlat <29){
        println("está dentro de los valores correspondientes a sobrepeso")
    }
        else {
            println("superior, está dentro de los valores de obesidad")

        }

    println(resultFlat)


}