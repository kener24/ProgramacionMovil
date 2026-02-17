package com.example.presentacion.ifelse

fun main() {

    val persona = mayorEdad()

    print("Ingrese su edad: ")

    val edad = readLine()!!.toInt()

    val resultado = persona.verificarEdad(edad)

    println(resultado)

}
