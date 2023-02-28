package net.iessochoa.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

/**
 * Controlador de la Activity secundaria "HiActivity"
 * Se encarga de saludar al usuario
 */
class HiActivity : AppCompatActivity() {

    // companion object son como campos estáticos de la clase
    companion object {
        // Clave que permite recibir un texto que mostrará en pantalla
        val EXTRA_NAME = "practica1.HiActivity.name"
    }

    // text view para mostrar el saludo
    private lateinit var tvHi: TextView

    /**
     * Sobreescritura de la función "OnCreate". Se llama al inicio de la aplicación
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hi)

        tvHi = findViewById(R.id.tvHi)

        val name = intent.getStringExtra(EXTRA_NAME)
        tvHi.text = String.format(getString(R.string.hi_to_user), name)
    }
}