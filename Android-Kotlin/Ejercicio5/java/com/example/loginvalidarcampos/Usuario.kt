package com.example.loginvalidarcampos

// Tipo DATA CLASS de Kotlin
// Tiene el constructor unicamente, los get y set los tiene implicitos
// no usa otros métodos

data class Usuario(
    // Atributos:
    val nombreUsuario: String,
    val pass: String
)


