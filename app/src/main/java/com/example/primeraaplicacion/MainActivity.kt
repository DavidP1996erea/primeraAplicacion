package com.example.primeraaplicacion

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {


        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menuopcion, menu)
        return true
    }




    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.ejercicioSumar -> {
                sumarNumeros(null)
                true
            }
            R.id.ejercicioColores -> {
                cambiarColoresTexto(null)
                true
            }
            R.id.ejercicioTexto -> {
                alineacionesTexto(null)
                true
            }

            R.id.ejercicioGaleria -> {
                galeriaFotos(null)
                true
            }

            R.id.ejercicioTamanoTexto -> {
                tamanosTexto(null)
                true
            }

            R.id.ejercicioBombillas -> {
                bombillas(null)
                true
            }

            R.id.ejercicioChecks -> {
                checks(null)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }


    fun sumarNumeros( view: View?){


        val cambiarPantalla = Intent(this,sumaNumeros ::class.java).apply {

        }
        startActivity(cambiarPantalla)

    }


    fun cambiarColoresTexto(view: View?){


        val cambiarPantalla = Intent(this,cambiarColores ::class.java).apply {

        }
        startActivity(cambiarPantalla)

    }


    fun alineacionesTexto( view: View?){


        val cambiarPantalla = Intent(this,alinearTexto ::class.java).apply {

        }
        startActivity(cambiarPantalla)

    }

    fun galeriaFotos( view: View?){


        val cambiarPantalla = Intent(this,galeriaFotos ::class.java).apply {

        }
        startActivity(cambiarPantalla)

    }


    fun tamanosTexto( view: View?){


        val cambiarPantalla = Intent(this,tamanoTexto ::class.java).apply {

        }
        startActivity(cambiarPantalla)

    }

    fun bombillas( view: View?){


        val cambiarPantalla = Intent(this,cambiarImagen ::class.java).apply {

        }
        startActivity(cambiarPantalla)

    }


    fun checks( view: View?){


        val cambiarPantalla = Intent(this,checkBoxTexto ::class.java).apply {

        }
        startActivity(cambiarPantalla)

    }
}