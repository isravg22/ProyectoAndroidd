package com.example.proyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.google.firebase.database.database
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val database= Firebase.database
        val myref= database.getReference("message")

        myref.setValue("Hello, World!")
    }
    fun Logeo(){
        val userName=findViewById<EditText>(R.id.editTextText5).text
        val contraseña=findViewById<EditText>(R.id.editTextTextPassword2).text


        if(userName.isEmpty() || contraseña.isEmpty()) println("Algun campo esta vacío")

        val database=Firebase.database
        database.goOnline()
        database.auth().onAuthStateChaged(function(user)){

        }

    }
}