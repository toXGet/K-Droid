package com.example.loginscreenexercices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun iniciarSession(view: android.view.View) {
        val edtUsr = findViewById<EditText>(R.id.edtUsuario)
        if (edtUsr.text.toString() == "correo@mail.com")
        {
            // Log.e("USUARIO", "Bienvenido!!!!")
           /* val dialogo = AlertDialog.Builder(this)
                .setTitle("Bienvenido")
                .setMessage("Ha ingresado a la app de manera correcta")
                .create()
                .show()*/
            // Generar Un Intent
            val intentSaludo = Intent(this, Actividad2::class.java)

            // Enviar Parametros entre actividades
            intentSaludo.putExtra("nombreUsuario", edtUsr.text.toString())

            // Llama a la otra actividad con el intent creado
            startActivity(intentSaludo)

        }else{
            // Log.e("USUARIO", "No se encuentra registrado")
            Toast.makeText(this, "El usuario no se encuentra registrado", Toast.LENGTH_SHORT)
                .show()
        }
    }

    /*
    Tamaños de las pantallas
    1. mdpi = medium (defecto)
        imágenes = 173x...
    2. hdpi = alto
        imágenes = 260px
    3. xhdpi = extra alto
        imágenes = 350
    4. xxhdpi = extra extra alto
        imágenes = 520
    5. xxxhdpi = extra extra extra alto
        imágenes = 690

    Dialogos:
    1. Dialog: AlertDialog
    2. Toast = alerta - aviso - temporizado
    */




}