package com.example.kotlinbasic

fun main() {
    println("Ciclos o bucles")
    println("Ciclos for")

    for (i in 1..10){
        println("Valor de i: $i")
    }

    val nombre="Jose"

    for (i in 0..nombre.length-1){
        print(nombre[i])
    }

    for(letra in nombre){
        print(letra)
    }

   nombre.forEach { letra->print(letra) }
    nombre.forEach { print(it) }

    println("Ciclos while y do while")

    var indice = 0
    while (indice>nombre.length){
        print("indice: $indice = ${nombre[indice]}")
        indice++
    }

    indice=4

    do {
        indice--
        print("indice: $indice = ${nombre[indice]}")

    }while (indice>0)






 }

