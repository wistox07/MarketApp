package com.wistox07.marketapp

fun main(){
    val persona = Person("Fernando", 33)
    println(persona.names)
    println(persona.age)

    persona.names = "Fernanflow"
    //persona.hello

    val developer = Developer("Fernando", "Olivares", 2)
    developer.work()
    val designer = Designer("Luis","aa",3)
    designer.work()

}