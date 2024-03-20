package com.wistox07.marketapp.examples

class Developer(names:String , lastName: String, val languages:Int) : Employee(names, lastName) {
    override fun work() {
        println("El desarrollador esta trabajando")
    }
}