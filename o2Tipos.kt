package com.example.kotlinbasic

fun main(){
    //booleanas

    val soySB=true

    println("soy DE sb?  $soySB")

    println("Numeros enteros")
    var entero: Int =120

    println(entero)

    val milisegundos: Long = 21_474_836_471L
    println("Valor de la variable: $milisegundos")

    println("Numeros decimales")
    val pi: Float = 3.1415F
    println("Valor de pi: $pi")

    println("Cadena de caracteres")
    val nombre: String = "Lucas"
    println("Valor de la cadena: $nombre")
    val casosEspeciales: String = "Hola, soy \\n\" Carlos\""
    println("casos especiales: $casosEspeciales")


    println("Concatenacion")
    val nombreCompleto=readln()
    println("Hola $nombreCompleto")
    println("Hola: "+nombreCompleto)


    println("Nulabilidad")

    var sobreNombre: String?=null
    sobreNombre="Macaco"
    println("Mi sobrenombre es: ${sobreNombre!!.length}")
    sobreNombre=null
    println("Mi sobrenombre es: ${sobreNombre?.length}")
}//mai

