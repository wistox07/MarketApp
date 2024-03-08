package com.wistox07.marketapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inyeccion de vistas : findViewById o (viewBindings)
        val tilNames : TextInputLayout = findViewById(R.id.tilNames)
        val edtNames : TextInputEditText = findViewById(R.id.edtNames)
        val tilAge : TextInputLayout = findViewById(R.id.tilAge)
        val edtAge : TextInputEditText = findViewById(R.id.edtAge)
        val btnRegister : Button = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val names = edtNames.text.toString()
            val age  = edtAge.text.toString()

            if(names.isEmpty()){
                tilNames.error = getString(R.string.main_activity_validation_names)
                return@setOnClickListener
            }

            if(age.isEmpty()){
                tilNames.error = getString(R.string.main_activity_validation_age)
                return@setOnClickListener
            }

        }
    }
}