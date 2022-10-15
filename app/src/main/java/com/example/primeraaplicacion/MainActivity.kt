package com.example.primeraaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar;

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    /**
     * Se crea el menú, haciendo que aparezca en pantalla. Este menú esta creado en un XML, en
     * la carpeta menu
     */

    override fun onCreateOptionsMenu(menu: Menu): Boolean {


        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menuopcion, menu)
        return true
    }


    /**
     * A cada opción del menú creado en el XML, se le da una orden, ejecutan diferentes métodos
     * que cada uno llevará a la Activivy correspondiente a la acción
     */
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

    /**
     * Cada uno de estos métodos llevan al activity correspondiente
     */

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