package com.example.myapplication1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class signup_activity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        var name = findViewById<EditText>(R.id.name)
        var email = findViewById<EditText>(R.id.email)
        var password = findViewById<EditText>(R.id.password)
        var country = findViewById<EditText>(R.id.country)
        var signup = findViewById<EditText>(R.id.signup)

        signup.setOnClickListener {
            var namere = name.text.toString()
            var emailre = email.text.toString()
            var passwordre = password.text.toString()
            var countryre = country.text.toString()

            if (namere=="" || emailre==""|| passwordre==""||countryre==""){
                Toast.makeText(this,"Inputs Required", Toast.LENGTH_SHORT).show()
            }else{

                var u =  User(namere , emailre , passwordre , countryre)

                myData.Users.add(u)
                finish()
            }
        }

        var HaveAccount =findViewById<TextView>(R.id.Have_Account)
        HaveAccount.setOnClickListener{
            finish()
        }
    }
}