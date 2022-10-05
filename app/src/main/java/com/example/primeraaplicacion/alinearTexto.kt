package com.example.primeraaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView

class alinearTexto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alinear_texto)
    }


    fun alinearTextoIzquierda(view: View){


        var texto = findViewById<TextView>(R.id.textoAlinear)

        texto.gravity = Gravity.LEFT



    }
//

    fun alinearTextoDerecha(view: View){


        var texto = findViewById<TextView>(R.id.textoAlinear)

        texto.gravity = Gravity.RIGHT



    }


}