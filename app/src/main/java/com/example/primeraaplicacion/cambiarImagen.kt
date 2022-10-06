package com.example.primeraaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class cambiarImagen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambiar_imagen)


    }

    fun cambiarBombillaApagada(view: View){

        var bombillaApagada = findViewById<ImageButton>(R.id.botonApagado)
        bombillaApagada.visibility = View.VISIBLE

    }

    fun cambiarBombillaEncendida(view: View){

        var bombillaEncendida = findViewById<ImageButton>(R.id.botonEncendido)
        var bombillaApagada = findViewById<ImageButton>(R.id.botonApagado)
        bombillaApagada.visibility = View.GONE
        bombillaEncendida.visibility = View.VISIBLE


    }
}