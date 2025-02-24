package com.example.ebac

class Array {
}

fun main() {

    val arrayNumeros = IntArray(40)

    for (i in 1..39) {
        arrayNumeros[i - 1] = i
    }


    println("Array preenchido:")
    println(arrayNumeros.joinToString(", "))

    val listaNumeros = mutableListOf<Int>()

    for (i in 1..99) {
        listaNumeros.add(i)
    }

    var soma = 0

    for (numero in listaNumeros) {
        soma += numero
    }

    println("Lista preenchida:")
    println(listaNumeros.joinToString(", "))

    println("A soma dos números de 1 a 99 é: $soma")

}