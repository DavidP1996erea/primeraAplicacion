package com.example.primeraaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class sumaNumeros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suma_numeros)
        supportActionBar?.hide()
    }



    fun sumaTodo(): Int{
        var mensaje = AlertDialog.Builder(this);
        mensaje.setTitle("Contenido incorrecto");
        mensaje.setMessage("Introduce algún número");
        var primerNumero = findViewById<EditText>(R.id.primerNumero)
        var segundoNumero= findViewById<EditText>(R.id.segundoNumero)
        var sumaTotal=0

            try{

                sumaTotal = Integer.parseInt(primerNumero.text.toString())+ Integer.parseInt(segundoNumero.text.toString())

            }catch (e: NumberFormatException){

                mensaje.show()
            }




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