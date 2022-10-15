package com.example.primeraaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView

class alinearTexto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alinear_texto)

        //Se oculta la barra superior de tareas para que no aparezca el nombre de la app
        supportActionBar?.hide()

        //Se coloca el texto en el centro al iniciarse la app
        var texto = findViewById<TextView>(R.id.textoAlinear)

        texto.gravity = Gravity.CENTER_HORIZONTAL

    }


    /**
     * Con este método se coloca el texto a la izquierda
     */
    fun alinearTextoIzquierda(view: View){


        var texto = findViewById<TextView>(R.id.textoAlinear)

        texto.gravity = Gravity.LEFT


    }


    /**
     * Con este método se coloca el texto a la derecha
     */
    fun alinearTextoDerecha(view: View){


        var texto = findViewById<TextView>(R.id.textoAlinear)

        texto.gravity = Gravity.RIGHT


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