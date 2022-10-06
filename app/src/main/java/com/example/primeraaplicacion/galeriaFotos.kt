package com.example.primeraaplicacion

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class galeriaFotos : AppCompatActivity() {

    var listaFotos = arrayListOf<Int>(
        R.drawable.suma, R.drawable.caracol, R.drawable.gallina,
        R.drawable.gato
    )

    var next = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeria_fotos)

    }



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



}