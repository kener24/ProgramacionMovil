package com.example.presentacion.Flujo

fun main() {

    val control = ControlFlujo()

    print("Ingrese un numero: ")

    val numero = readLine()!!.toInt()

    control.ejemplo(numero)

}
