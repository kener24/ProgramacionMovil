package com.example.presentacion.Flujo

class ControlFlujo {

    fun ejemplo(numero: Int) {

        // RETURN: termina la función si el número es negativo
        if (numero < 0) {
            println("Numero invalido")
            return
        }

        for (i in 1..numero) {

            // CONTINUE: salta el número 5
            if (i == 5) {
                println("Se salto el 5")
                continue
            }

            // BREAK: detiene el ciclo en el 8
            if (i == 8) {
                println("Se detuvo en el 8")
                break
            }

            println("Numero: $i")

        }

        println("Fin del programa")

    }

}