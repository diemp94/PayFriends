package com.example.prueba

data class Client(
        val name: String,
        val lastName: String,
        var debt: Float? = 0f,
        var positiveIncome: Float? = 0f
) {
    val total: Float
        get() = positiveIncome!! - debt!!

}