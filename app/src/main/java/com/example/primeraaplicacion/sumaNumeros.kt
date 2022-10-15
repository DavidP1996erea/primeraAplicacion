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


    /**
     * Este método retorna un entero que se usará en el método de abajo. Se crean las variables
     * necesarias, en este caso un mensaje de texto que informará al usuario de que no
     * introdució los datos correctos, y una variable para cada número. En caso de que todo esté
     * correcto ambos números se sumarán. En caso de que hubiese algo mal se mostará el mensaje
     * de error
     */
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

    /**
     * Se mostrará el resultado en un TextView
     */

    fun mostrarResultado(view: View){

        var resultado = findViewById<TextView>(R.id.sumaTotal)
        resultado.text = sumaTodo().toString()

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