package com.example.primeraaplicacion

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
    }


    fun aumentar(view: View){

        var texto = findViewById<EditText>(R.id.textoCambiar)

            texto.setTextSize(TypedValue.COMPLEX_UNIT_PX,texto.textSize+1)

    }

    fun dismunuir(view: View){

        var texto = findViewById<EditText>(R.id.textoCambiar)

        texto.setTextSize(TypedValue.COMPLEX_UNIT_PX,texto.textSize-1)

    }









}