package com.example.loginscreenexercices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Actividad2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad2)

        // Recupera los datos enviados desde la MainActivity
        // 1. Declarar variable tipo Intent y se inicializa con minuscula
        val intMainActivity: Intent = intent

        // 2. Obtener el dato enviado desde la actividad anterior
        val usuario:String = intMainActivity.getStringExtra("nombreUsuario").toString()

        Toast.makeText(this, "El nombre de usuario es $usuario", Toast.LENGTH_LONG).show()


        val btnCerrar = findViewById<Button>(R.id.btnCerrar)
        btnCerrar.setOnClickListener {
            cerrarSesion()
        }
    }

    private fun cerrarSesion(){
        finish()

    }
}