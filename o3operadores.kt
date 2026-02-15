package com.example.kotlinbasic

fun main(){
    println("Operador Elvis")

    var version: Int?=3
    println("La version actual es: $version")
   version=null
    println("La version actual es: $version")
    println("La version actual es: ${version?:-20}")

    println("Operadores aritmeticos")
    print("Ingrese el primer numero: ")
    var num1= readln().toInt()
    print("Ingrese el segundo numero: ")
    var num2= readln().toInt()
    println("Suma: ${num1+num2}")


    println("Operadores de incremento")
    var x: Int = 10

    var xmas = ++x
    var xmenos =x++
    println(xmas)
    println(xmenos)


    println("Operadores de igualdad")
    var esIgual: Boolean =(3==3)
    println(esIgual)
    esIgual=(3!=3)
    println(esIgual)


    println("Operadores logicos")

    val valor0=(1==1 || 1==5)
    println(valor0)

    val valor1=(1==1 && 1==5)
    println("and :$valor1")

    val valorMenorOigual=(1<=2)
    println("menor o igual: $valorMenorOigual")

    val valorMayorOigual=(1>=2)
    println("mayor o igual: $valorMayorOigual")



}//main