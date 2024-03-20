package com.wistox07.marketapp.examples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.wistox07.marketapp.R

class MainActivity : AppCompatActivity() {

    private lateinit var edtNames : TextInputEditText
    private lateinit var edtAge : TextInputEditText
    private lateinit var btnRegister : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inyeccion de vistas : findViewById o (viewBindings)
        val tilNames : TextInputLayout = findViewById(R.id.tilNames)
        edtNames = findViewById(R.id.edtNames)
        val tilAge : TextInputLayout = findViewById(R.id.tilAge)
        edtAge = findViewById(R.id.edtAge)
        btnRegister  = findViewById(R.id.btnRegister)

        edtNames.addTextChangedListener(validationTextWatcher)
        edtAge.addTextChangedListener(validationTextWatcher)

        btnRegister.setOnClickListener {
            val names = edtNames.text.toString()
            val age  = edtAge.text.toString()

            if(names.isEmpty()){
                //tilNames.error = getString(R.string.main_activity_validation_names)
                //Toast.makeText(this,getString(R.string.main_activity_validation_names), Toast.LENGTH_LONG).show()
                toast(getString(R.string.main_activity_validation_names))
                return@setOnClickListener
            }

            if(age.isEmpty()){
                //tilAge.error = getString(R.string.main_activity_validation_age)
                //Toast.makeText(this,getString(R.string.main_activity_validation_age), Toast.LENGTH_LONG).show()
                toast(getString(R.string.main_activity_validation_age))

                return@setOnClickListener
            }

            //Scope Funtions : APPLY - LET


            val bundle = Bundle().apply {
                putString("KEY_NAMES",names)
                putString("KEY_AGE", age)
            }


            val intent = Intent(this, DestinationActivity::class.java).apply {
                putExtras(bundle)
            }
            startActivity(intent)

            //val number:Int = 2
            //number.myPlus(3 , 2)
            //number.myPlus(number2 = 2, number1 = 1)
            //val myName:String = "Fernando"
            //myName.hello()

            val result = 3 mas 4

        }


    }

    private val validationTextWatcher = object : TextWatcher{
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            val names = edtNames.text.toString()
            val age = edtAge.text.toString()
            btnRegister.isEnabled = names.isNotEmpty() && age.isNotEmpty()
        }

        override fun afterTextChanged(s: Editable?) {
        }

    }
    //fun toast(message:String) = Toast.makeText(this,message, Toast.LENGTH_LONG).show()

    fun add(number1:Int , number2:Int) : Int {
        return number1 + number2
    }

    fun add2(number1:Int , number2:Int) =  number1 + number2

    fun hello(name:String) : Unit {
        println("Hola $name")
    }

    fun hello2(name:String) = println("Hola $name")

    fun Int.myPlus(number1:Int , number2:Int) = this + number1 + number2

    fun String.hello() = "Hello $this"


    //Infix Functions tiene que ser una funcion de extension
    infix fun Int.mas(number1: Int) = this + number1

}