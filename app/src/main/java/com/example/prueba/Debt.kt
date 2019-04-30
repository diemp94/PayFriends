package com.example.prueba

import java.io.Serializable
import java.text.SimpleDateFormat
import java.util.*

data class Debt(
        val debt: Float? = 0f,
        val debtId: Int?,
        val _date: Date,
        val subject: String?,
        val description: String?
) : Serializable {
    val sdf = SimpleDateFormat("dd/M/yyyy",Locale.US)
    val date: String
        get() = sdf.format(_date)
}



