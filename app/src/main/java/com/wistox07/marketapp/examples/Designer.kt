package com.wistox07.marketapp.examples

class Designer (names:String , lastName: String, val tools: Int) : Employee(names, lastName){
    override fun work() {
        println("El diseñador esta trabajando")
    }
}