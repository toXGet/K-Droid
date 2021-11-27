package com.example.notas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var notaJava: Int = 0
    var notaAngular: Int = 0
    var notaKotlin: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //lista1()

        val btnGuardar = findViewById<Button>(R.id.btnGuardarNota)
        btnGuardar.setOnClickListener{
            guardarNotas()
        }
    }

    /*fun lista1(){
        //Arreglos Estáticos
        val diasSemana = arrayOf("L","M","M","J","V","S")

        val meses = listOf("E","F" ,"M")

        print("El primer día de la semana es " + diasSemana[0])

        var pos=0
        while (pos<meses.size) {
            Toast.makeText(this, "El mes es " + meses[pos], Toast.LENGTH_SHORT).show()
            pos++
        }
        for (dia in diasSemana){
            Toast.makeText(this, "El día es " + diasSemana, Toast.LENGTH_SHORT).show()
        }

    }*/

    fun guardarNotas(){
        val edtJava = findViewById<EditText>(R.id.edtJava)
        if (edtJava.text.toString().isNotEmpty())
            notaJava = edtJava.text.toString().toInt()
        else
            notaJava = 0

        val edtAngular = findViewById<EditText>(R.id.edtAngular)
        if (edtAngular.text.toString().isNotEmpty())
            notaAngular = edtAngular.text.toString().toInt()
        else
            notaAngular = 0

        val edtKotlin = findViewById<EditText>(R.id.edtKotlin)
        if (edtKotlin.text.toString().isNotEmpty())
            notaKotlin = edtKotlin.text.toString().toInt()
        else
            notaKotlin = 0


        //Llamar la actividad
        val aproboIntent = Intent(this, AproboActivity::class.java)

        aproboIntent.putExtra("nJava", notaJava)
        aproboIntent.putExtra("nAngular", notaAngular)
        aproboIntent.putExtra("nKotlin", notaKotlin)

        /*aproboIntent.putExtra("nJava", notaJava)
            .putExtra("nAngular", notaAngular)
            .putExtra("nKotlin", notaKotlin)*/

        startActivity(aproboIntent)


    }

}