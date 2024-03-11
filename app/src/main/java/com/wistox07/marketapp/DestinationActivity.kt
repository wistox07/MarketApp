package com.wistox07.marketapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DestinationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destination)

        val bundle = intent.extras
        bundle?.let {bundleLibreNulos ->
            val names = bundleLibreNulos.getString("KEY_NAMES")
            val age = bundleLibreNulos.getString("KEY_AGE")
            println(names)
            println(age)
        }


        /*
            val names = bundle.getString("KEY_NAMES") ?: "Desconocido"
            val age = bundle.getString("KEY_AGE") ?: "Desconocido"
         */




    }
}