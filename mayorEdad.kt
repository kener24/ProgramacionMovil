package com.example.presentacion.ifelse

class mayorEdad {
    fun verificarEdad(edad: Int): String {

        if (edad >= 18) {
            return "Eres mayor de edad"
        } else {
            return "Eres menor de edad"
        }

    }
}