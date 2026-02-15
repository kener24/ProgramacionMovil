package com.example.kotlinbasic

fun main() {
    println("Sentencias o condicionales")
    println("a:")
    val a  = readln().toInt()
    println("b:")
    val b  = readln().toInt()

    println("Sentencia if")
    if (true)
        println("La sentencia se cumplio")
    else
        println("La sentencia no se cumplio")

    println("Sentencia if else")

    var comparacion=(a<b)

    if (comparacion)
        println("$a es menor que $b")
    else
        println("$a es mayor que $b")
    println("Sentencia If else if")

    if(comparacion)
        println(comparacion)
    else if(a==b)
        println("No use comparacion")
    else
        println(comparacion)

    println("Sentencia when")
    println("Ingresa tu nombre para ver tu salario")
    val nombre=readln()
    when (nombre){
        "Lucas" -> println("Tu salario es de 10000")
        "Carlos" -> println("Tu salario es de 20000")
        "Pedro" -> println("Tu salario es de 30000")
        else -> println("No encontramos tu salario1")

    }


}