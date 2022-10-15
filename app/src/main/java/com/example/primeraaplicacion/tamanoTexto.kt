package com.example.primeraaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import android.util.TypedValue
import android.view.View
import android.webkit.WebSettings
import android.widget.EditText

class tamanoTexto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tamano_texto)
        supportActionBar?.hide()
    }

    /**
     * Cada vez que se activa este método el tamaño del texto aumenta en 1
     */
    fun aumentar(view: View){

        var texto = findViewById<EditText>(R.id.textoCambiar)

            texto.setTextSize(TypedValue.COMPLEX_UNIT_PX,texto.textSize+1f)

    }

    /**
     * Cada vez que se activa este método el tamaño del texto disminuye en 1
     */
    fun dismunuir(view: View){

        var texto = findViewById<EditText>(R.id.textoCambiar)

        texto.setTextSize(TypedValue.COMPLEX_UNIT_PX,texto.textSize-1f)

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