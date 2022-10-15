package com.example.primeraaplicacion

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class galeriaFotos : AppCompatActivity() {

    /**
     * Primero se crea un arraylist con todas las fotos dentro, para poder recorrerlo y pasar
     * de una foto a otra
     */
    var listaFotos = arrayListOf<Int>(
        R.drawable.suma, R.drawable.caracol, R.drawable.gallina,
        R.drawable.gato
    )

    var next = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeria_fotos)
        supportActionBar?.hide()

    }


    /**
     * Cada vez que se pulsa el botón que acciona este método, avanza a la siguiente imagen hasta
     * que llega al final del array, donde se dirige a la primera imagen
     */
    fun siguienteImagen(view: View){


        if(next >= listaFotos.size-1){
            next=0
        }else{
            next++
        }



        var fotoss = findViewById<ImageView>(R.id.imageView2)
        fotoss.setImageResource(listaFotos[next])
        fotoss.visibility = View.VISIBLE



    }

    /**
     * Igual que el método interior, pero cuando vas hacia atrás y llegas a la última foto,
     * vas a la última foto
     */

    fun atrasImagen(view: View) {


        if(next<=0){
            next = listaFotos.size-1
        }else{
            next--
        }


        var fotoss = findViewById<ImageView>(R.id.imageView2)
        fotoss.setImageResource(listaFotos[next])
        fotoss.visibility = View.VISIBLE
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