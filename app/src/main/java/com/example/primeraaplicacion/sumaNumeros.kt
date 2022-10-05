package com.example.primeraaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class sumaNumeros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suma_numeros)
    }



    fun sumaTodo(): Int{

        var primerNumero = findViewById<EditText>(R.id.primerNumero)
        var segundoNumero= findViewById<EditText>(R.id.segundoNumero)

        var sumaTotal = Integer.parseInt(primerNumero.text.toString())+ Integer.parseInt(segundoNumero.text.toString())


        return sumaTotal;

    }

    fun mostrarResultado(view: View){

        var resultado = findViewById<TextView>(R.id.sumaTotal)
        resultado.text = sumaTodo().toString()

    }


    fun volverAtras(view: View){

        val cambiarPantalla = Intent(this,MainActivity ::class.java).apply {

        }
        startActivity(cambiarPantalla)
    }

}