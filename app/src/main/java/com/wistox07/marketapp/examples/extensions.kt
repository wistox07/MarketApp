package com.wistox07.marketapp.examples

import android.content.Context
import android.widget.Toast

//fun toast(message:String) = Toast.makeText(this,message, Toast.LENGTH_LONG).show()
fun Context.toast(message:String) = android.widget.Toast.makeText(this,message, android.widget.Toast.LENGTH_LONG).show()