package com.example.invocarmetododeclasse_10

import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textview.MaterialTextView

class ClasseSomar004: AppCompatActivity() {

    val textView = findViewById<MaterialTextView>(R.id.minhaTextViewDois)

    fun funcaoSomar004(numero001: Int): Int {
        if (numero001 == 5){
            textView.text = "Verdadeiro"
        }
        else{
            textView.text = "Verdadeiro"
        }
        return numero001
    }
}