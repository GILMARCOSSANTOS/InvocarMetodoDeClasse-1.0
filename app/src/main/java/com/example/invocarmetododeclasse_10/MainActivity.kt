package com.example.invocarmetododeclasse_10

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val somar001 = ClasseSomar001()
        val resultado001 = somar001.funcaoSomar001(99)
        Log.d("ResultadoAAA ", resultado001.toString())
//        var minhaTextView001 = findViewById<TextView>(R.id.minhaTextView)
//        minhaTextView001.text = "ResultadoAAA = " + resultado001.toString()

        val somar002 = ClasseSomar002()
        val resultado002 = somar002.funcaoSomar002(150, 75)
        Log.d("ResultadoAAB ", resultado002.toString())
//        var minhaTextView002 = findViewById<TextView>(R.id.minhaTextView)
//        minhaTextView002.text = "ResultadoAAB = $resultado002"

        val somar003 = ClasseSomar003()
        val resultado003 = somar003.funcaoSomar003(501)
        Log.d("ResultadoAAC ", resultado003.toString())
        var minhaTextView003 = findViewById<TextView>(R.id.minhaTextViewUm)
        minhaTextView003.text = "ResultadoAAC = $resultado003"
    }
}