package net.iessochoa.practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

/**
 * Controlador de la Activity principal "MainActivity"
 */
class MainActivity : AppCompatActivity() {

    // Campo para introducir texto
    private lateinit var etName:EditText

    // Botón aceptar
    private lateinit var btAccept:Button

    /**
     * Sobreescritura de la función "OnCreate". Se llama al inicio de la aplicación
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Asignamos a las campos de la clase los elementos de la aplicación
        etName = findViewById(R.id.etName)
        btAccept = findViewById(R.id.btAccept)

        // Le asignamos la función "sendHi" a la acción del botón "btAccept"
        btAccept.setOnClickListener{sendHi()}
    }

    /**
     * Este método envía a la siguiente Activity el texto introducido en el campo "etName"
     */
    private fun sendHi() {
        // Comprobar si el campo está vacío
        if (!etName.text.isEmpty()) {
            // Creamos el Intent hacia HiActivity
            val intent = Intent(this, HiActivity::class.java)
            // Le pasamos el contenido de "etNombre" como clave:valor
            intent.putExtra(HiActivity.EXTRA_NAME, etName.text.toString())
            // Iniciamos la otra Activity
            startActivity(intent)
        } else {
            // Motramos un menaseje por pantalla
            Toast.makeText(this, R.string.warning_no_name, Toast.LENGTH_LONG).show()
        }
    }
}