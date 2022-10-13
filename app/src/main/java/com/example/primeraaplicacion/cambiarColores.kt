package com.example.primeraaplicacion

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class cambiarColores : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_cambiar_colores)
    }


    fun cambiarAVerde(view: View){

        var texto  = findViewById<TextView>(R.id.textoColores)

        texto.setTextColor(Color.GREEN)

    }

    fun cambiarAAzul(view: View){

        var texto  = findViewById<TextView>(R.id.textoColores)

        texto.setTextColor(Color.BLUE)

    }



    fun cambiarARojo(view: View){

        var texto  = findViewById<TextView>(R.id.textoColores)

        texto.setTextColor(Color.RED)

    }

    fun volverAtras(view: View){

        val cambiarPantalla = Intent(this,MainActivity ::class.java).apply {

        }
        startActivity(cambiarPantalla)
    }


}