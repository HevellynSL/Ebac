package com.example.ebac

class Condicionais {
}

fun main (){
    var numero = 3
    var numero1= 98
    var numero2= 55

    /*if (numero % 2 ==0){
        println("$numero = Par")
    }else{
        println("$numero = Impar")
    }

    if (numero1 % 2 ==0){
        println("$numero1 = Par")
    }else{
        println("$numero1 = Impar")
    }

    if (numero2 % 2 ==0){
        println("$numero2 = Par")
    }else{
        println("$numero2 = Impar")
    }*/

        println(
            when {
                numero % 2 == 0 -> "$numero = Par"
                else -> "$numero = Impar"
            }
        )

        println(
            when {
                numero1 % 2 == 0 -> "$numero1 = Par"
                else -> "$numero1 = Impar"
            }
        )

        println(
            when {
                numero2 % 2 == 0 -> "$numero2 = Par"
                else -> "$numero2 = Impar"
            }
        )
    }