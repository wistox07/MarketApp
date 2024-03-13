package com.wistox07.marketapp

class Developer(names:String , lastName: String, val languages:Int) : Employee(names, lastName) {
    override fun work() {
        println("El desarrollador esta trabajando")
    }
}