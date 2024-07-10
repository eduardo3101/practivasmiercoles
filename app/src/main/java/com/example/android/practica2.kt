package com.example.android
//programa que nos diga si podemos votar ut¬ilizando condicionales
fun main(){
    val edad = 52
        if (edad<18){
            println("no puedes consumir")
        }
    else if (edad>=18 && edad <50){
            println("saca las chelas")
        }
        else if (edad>=51 && edad <61){
            println("Ya estas viejo \n preocupate")
        }
        else if (edad>=62 && edad <100){
            println("viejo")
        }
    else {
            println("aun vives")
        }


}
