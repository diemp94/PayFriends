package com.example.prueba.Login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.prueba.DashBoard.DashBoardActivity
import com.example.prueba.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    val password:String = "prueba"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnSignIn.setOnClickListener {

            val intent = Intent(this, DashBoardActivity::class.java)
            startActivity(intent)


        }

    }

    private fun checkLogin(pass:String):Boolean{
        val password = editTextPasswordLogin.text
        if(editTextEmailLogin.text.isNullOrEmpty()){
            Toast.makeText(this,"Ingresa un correo valido",Toast.LENGTH_SHORT).show()
            return false
        } else if(password!!.equals(pass)){
            Toast.makeText(this,"contraseña Incorrecta",Toast.LENGTH_SHORT).show()
            return false
        } else
            return true
    }

}
