package com.smitpatel.mad_practical_4_22012012034

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var Login_button=findViewById<Button>(R.id.LoginButton)
        var SignUp_button=findViewById<Button>(R.id.Sign_up)
        Login_button.setOnClickListener(){
            Intent(this@MainActivity,MainActivity_login::class.java).also { startActivity(it)}
        }
        SignUp_button.setOnClickListener(){
            Intent(this@MainActivity,MainActivity_Register::class.java).also { startActivity(it)}
        }
    }
}