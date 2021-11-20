package com.example.retodos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val btnProf = findViewById<Button>(R.id.btnProfile)
        val btnSeti = findViewById<Button>(R.id.btnSettings)
        val btnAbou = findViewById<Button>(R.id.btnAbout)

        btnPlay.setOnClickListener { Toast.makeText(this,
            "Oprimiste el Boton Jugar", Toast.LENGTH_LONG).show() }
        btnProf.setOnClickListener { Toast.makeText(this,
            "Oprimiste el Boton Perfil", Toast.LENGTH_LONG).show() }
        btnSeti.setOnClickListener { Toast.makeText(this,
            "Oprimiste el Boton Ajustes", Toast.LENGTH_LONG).show() }
        btnAbou.setOnClickListener { Toast.makeText(this,
            "Oprimiste el Boton Acerca de", Toast.LENGTH_LONG).show() }
    }
}