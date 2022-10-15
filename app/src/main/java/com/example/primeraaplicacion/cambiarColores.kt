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


    /**
     * Se guarda en una variable el textView para poder cambiar algunas características,
     * en ete caso para cambiar el color a verde.
     */
    fun cambiarAVerde(view: View){

        var texto  = findViewById<TextView>(R.id.textoColores)

        texto.setTextColor(Color.GREEN)

    }

    /**
     * Igual que el anterior pero se cambia a azul
     */
    fun cambiarAAzul(view: View){

        var texto  = findViewById<TextView>(R.id.textoColores)

        texto.setTextColor(Color.BLUE)

    }


    /**
     * Igual que el anterior pero se cambia a rojo
     */
    fun cambiarARojo(view: View){

        var texto  = findViewById<TextView>(R.id.textoColores)

        texto.setTextColor(Color.RED)

    }

    /**
     * Método para volver al menu principal, cambia la actividad y ejecuta la del Main
     */

    fun volverAtras(view: View){

        val cambiarPantalla = Intent(this,MainActivity ::class.java).apply {

        }
        startActivity(cambiarPantalla)
    }


}