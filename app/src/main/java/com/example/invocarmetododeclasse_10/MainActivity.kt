package com.example.invocarmetododeclasse_10

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    /* Declaração de Variávevl em Escopo Global: */
    private lateinit var txtViewUm: TextView
    private lateinit var txtViewDois: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Declarar Funções: */
        declararVariaveis()

        val somar001 = ClasseSomar001()
        val resultado001 = somar001.funcaoSomar001(99)
        Log.d("ResultadoAAA ", resultado001.toString())
//        txtViewUm.text = "ResultadoAAA = $resultado001"

        val somar002 = ClasseSomar002()
        val resultado002 = somar002.funcaoSomar002(150, 75)
        Log.d("ResultadoAAB ", resultado002.toString())
//        txtViewUm.text = "ResultadoAAB = $resultado002"

        val somar003 = ClasseSomar003()
        val resultado003 = somar003.funcaoSomar003(501)
        Log.d("ResultadoAAC ", resultado003.toString())
        // txtViewUm.text = "ResultadoAAC = $resultado003"

        val somar004 = ClasseSomar004()
        val resultado004 = somar004.textView
        Log.d("ResultadoAAD ", resultado004.toString())
        txtViewUm.text = "ResultadoAAD = ${resultado004.text}"
    }

    private fun declararVariaveis() {
        txtViewUm = findViewById(R.id.minhaTextViewUm)
        txtViewDois = findViewById(R.id.minhaTextViewDois)
    }

}