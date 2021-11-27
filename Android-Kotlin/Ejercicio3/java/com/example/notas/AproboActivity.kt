package com.example.notas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AproboActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aprobo)

        val notasIntent: Intent = intent
        var nota1: Int = notasIntent.getIntExtra("nJava", 0)
        var nota2: Int = notasIntent.getIntExtra("nAngular", 0)
        var nota3: Int = notasIntent.getIntExtra("nKotlin", 0)

        validarCalificacion(nota1, nota2, nota3)
    }

    fun validarCalificacion(n1: Int = 0, n2: Int = 0, n3: Int = 0){
        var promedio: Double = ((n1+n2+n3)/3).toDouble()
        val tvNotaFinal = findViewById<TextView>(R.id.tvNotaFinal)

        // El when Uno a Uno
        /*when(promedio){
            5.0 -> tvNotaFinal.text = "Aprobo el curso"
            3.0 -> tvNotaFinal.text = "Puedes hacerlo mejor"
            0.0 -> tvNotaFinal.text = "NO Aprobó el Curso!"
        }*/

        // El when con rangos
        /* when (promedio) {
            in 3.0 .. 5.0 -> tvNotaFinal.text = "Aprobo el curso"
            else -> tvNotaFinal.text = "NO Aprobó el Curso!"
        }*/

        // El when con rangos asignando a una variable
         var res = when (promedio) {
             in 3.0 .. 5.0 -> "Aprobo el curso"
             else -> "NO Aprobó el Curso!"
         }
         tvNotaFinal.text = res + " nota: " + promedio


    }

    fun cerrar(view: android.view.View) {
        finish()
    }

}