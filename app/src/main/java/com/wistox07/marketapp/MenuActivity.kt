package com.wistox07.marketapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.wistox07.marketapp.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    //ActivityRegisterBinding

    //private val binding : ActivityMenuBinding? = null
    private lateinit var binding : ActivityMenuBinding
    private lateinit var fragment : Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_menu)

        //val btnTab1 : Button = findViewById(R.id.btnTab1)
        //ViewBIndings
        binding.btnTab1.setOnClickListener {
            fragment = TabOneFragment()
            addFragment()
        }

        binding.btnTab1.setOnClickListener {
            fragment = TabTwoFragment()
            addFragment()
        }


    }
    private fun addFragment(){
        fragment?.let {
            supportFragmentManager.beginTransaction().replace(R.id.container, fragment).commit()
        }

    }
}