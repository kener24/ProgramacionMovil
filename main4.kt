package com.example.presentacion.IF

fun main() {


    val evaluador = Evaluador()


    print("Ingrese un numero: ")
    val numero = readLine()!!.toInt()


    val resultado = evaluador.evaluarNumero(numero)


    println(resultado)

}