package com.example.primeraaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class cambiarImagen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambiar_imagen)
        supportActionBar?.hide()


    }

    /**
     * Se guarda en una variable un objeto tipo ImageButton, que en el XML está en Gone, por lo que
     * no se ve pero guarda su posición, al darle a la primera imagen se activa este método
     * que hace visible la otra imagen
     */
    fun cambiarBombillaApagada(view: View){

        var bombillaApagada = findViewById<ImageButton>(R.id.botonApagado)
        bombillaApagada.visibility = View.VISIBLE

    }

    /**
     * Con este método al pulsar la imagen button, se retira la imagen de la bombilla
     * apagada y se vuelve visible la bombilla encendida
     */

    fun cambiarBombillaEncendida(view: View){

        var bombillaEncendida = findViewById<ImageButton>(R.id.botonEncendido)
        var bombillaApagada = findViewById<ImageButton>(R.id.botonApagado)
        bombillaApagada.visibility = View.GONE
        bombillaEncendida.visibility = View.VISIBLE


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