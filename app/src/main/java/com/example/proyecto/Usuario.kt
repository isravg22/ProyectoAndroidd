package com.example.proyecto

class Usuario {
    lateinit var nombre: String
    lateinit var apellidoP: String
    lateinit var apellidoM: String
    lateinit var nombreUsuario:String
    lateinit var email:String
    lateinit var contraseña:String
/*
    fun Autor(nombre:String,apellidoP:String,nombreUsuario:String,apellidoM: String,contraseña:String){
        this.nombre=nombre
        this.apellidoP=apellidoP
        this.apellidoM=apellidoM
        this.nombreUsuario=nombreUsuario
        this.contraseña=contraseña
    }

*/
    fun Imprimir(){
        println("Nombre: ${nombre}, Primer Apellido: ${apellidoP}, Segundo Apellido: ${apellidoM}, Nombre de Usuario: ${nombreUsuario}, Contraseña: ${contraseña}, Email: ${email}")
    }

}


