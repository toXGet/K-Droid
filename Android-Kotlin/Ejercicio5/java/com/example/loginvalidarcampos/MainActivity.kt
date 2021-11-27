package com.example.loginvalidarcampos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.regex.Matcher
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {

    private var listaUsuarios: MutableList<Usuario> = mutableListOf(
        Usuario( "Yoco", "123"),
        Usuario( "Pepe", "5678"),
        Usuario( "Juanito", "ru34")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRegistro = findViewById<Button>(R.id.btnRegistrarse)
        btnRegistro.setOnClickListener {
            val edtUsuario = findViewById<EditText>(R.id.edtUsuario)
            val edtPass = findViewById<EditText>(R.id.edtClave)

            if (validarContrasena(edtPass.text.toString()))
                listaUsuarios.add(Usuario(edtUsuario.text.toString(), edtPass.text.toString()))
            else
                Toast.makeText(this, "No cumple con las politicas", Toast.LENGTH_LONG).show()

            println(listaUsuarios)
        }
    }

    private fun validarContrasena(pass: String): Boolean {
        var pattern: Pattern
        var matcher: Matcher

        val PATRON_CONTRASENA = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@!%*?&])(?=\\S+$).{4,}$"

        pattern = Pattern.compile(PATRON_CONTRASENA)
        matcher = pattern.matcher(pass)

        return matcher.matches();

    }



}