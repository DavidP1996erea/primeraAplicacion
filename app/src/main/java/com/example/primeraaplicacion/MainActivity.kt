package com.example.primeraaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun sumaNumeros( view: View){


        val cambiarPantalla = Intent(this,sumaNumeros ::class.java).apply {

        }
        startActivity(cambiarPantalla)

    }


    fun cambiarColoresTexto( view: View){


        val cambiarPantalla = Intent(this,cambiarColores ::class.java).apply {

        }
        startActivity(cambiarPantalla)

    }


    fun alineacionesTexto( view: View){


        val cambiarPantalla = Intent(this,alinearTexto ::class.java).apply {

        }
        startActivity(cambiarPantalla)

    }


}