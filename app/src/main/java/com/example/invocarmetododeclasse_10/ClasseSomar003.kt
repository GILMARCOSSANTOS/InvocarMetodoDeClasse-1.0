package com.example.invocarmetododeclasse_10

import androidx.appcompat.app.AppCompatActivity

class ClasseSomar003: AppCompatActivity() {

    fun funcaoSomar003(numero001: Int): Int {
        if (numero001 <500 ){
            return numero001 * 5
        }
        else{
           return numero001 / 10
        }
    }
}