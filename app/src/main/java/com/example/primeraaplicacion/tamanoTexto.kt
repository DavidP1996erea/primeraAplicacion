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


    fun aumentar(view: View){

        var texto = findViewById<EditText>(R.id.textoCambiar)

            texto.setTextSize(TypedValue.COMPLEX_UNIT_PX,texto.textSize+1f)

    }

    fun dismunuir(view: View){

        var texto = findViewById<EditText>(R.id.textoCambiar)

        texto.setTextSize(TypedValue.COMPLEX_UNIT_PX,texto.textSize-1f)

    }

    fun volverAtras(view: View){

        val cambiarPantalla = Intent(this,MainActivity ::class.java).apply {

        }
        startActivity(cambiarPantalla)
    }









}