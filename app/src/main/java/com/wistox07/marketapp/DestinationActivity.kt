package com.wistox07.marketapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DestinationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destination)

        val bundle = intent.extras
        val names = bundle?.getString("KEY_NAMES")
        val age = bundle?.getString("KEY_AGE")

        println(names)
        println(age)


    }
}