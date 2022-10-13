package com.example.primeraaplicacion

import android.content.Intent
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import java.awt.font.TextAttribute
import java.lang.reflect.Type
import java.net.Proxy
import java.time.format.TextStyle

class checkBoxTexto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box_texto)
        supportActionBar?.hide()
    }


    fun volverAtras(view: View){

        val cambiarPantalla = Intent(this,MainActivity ::class.java).apply {

        }
        startActivity(cambiarPantalla)
    }

    fun textoNegrita(view: View){


        var negrita = findViewById<CheckBox>(R.id.negritaTexto)
        var texto = findViewById<TextView>(R.id.textoChecks)

        if (negrita.isChecked){

            texto.setTypeface(null,Typeface.BOLD)

        }else{
            texto.setTypeface(null, Typeface.NORMAL)
        }


    }


    fun fuenteGigante(view: View){

        var gigante = findViewById<CheckBox>(R.id.fuenteGrandeTexto)
        var texto = findViewById<TextView>(R.id.textoChecks)


        if (gigante.isChecked){

           texto.textSize=80f

        }else{
            texto.textSize = 15f

        }

    }


    fun fuenteDiminuta(view: View) {

        var gigante = findViewById<CheckBox>(R.id.fuentePequenaTexto)
        var texto = findViewById<TextView>(R.id.textoChecks)


        if (gigante.isChecked) {

            texto.textSize = 3f

        } else {
            texto.textSize = 15f

        }
    }


        fun fuenteRoja(view: View) {

            var gigante = findViewById<CheckBox>(R.id.coloRojoTexto)
            var texto = findViewById<TextView>(R.id.textoChecks)


            if (gigante.isChecked) {

                texto.setTextColor(Color.RED)
            } else {
                texto.setTextColor(Color.GRAY)

            }
        }

    }

