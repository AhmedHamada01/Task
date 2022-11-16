package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class login_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var DonotAccount = findViewById<TextView>(R.id.do_not_account)
        DonotAccount.setOnClickListener{
            var i = Intent(this,signup_activity::class.java)
           startActivity(i)
        }

        var emailAdd= findViewById<TextView>(R.id.emailAdd)
        var passwardAdd= findViewById<TextView>(R.id.passwardAdd)
        var btnLogin= findViewById<Button>(R.id.btn_login)

        btnLogin.setOnClickListener{
            var edemail =emailAdd.text
            var edpassward = passwardAdd.text

            if (edemail.trim()==""||edpassward.trim()==""){
                Toast.makeText(this,"Input Required",Toast.LENGTH_SHORT).show()

            }else{
                var exist = false
                for (p in myData.Users){
                    if (p.email == edemail && p.password==edpassward){
                        exist = true

                        myData.LoggedInUser.name = p.name
                        myData.LoggedInUser.email = p.email
                        myData.LoggedInUser.password = p.password
                        myData.LoggedInUser.country = p.country

                        var i = Intent(this,home::class.java)
                        startActivity(i)
                        break;
                    }
                }
                if (exist == false){
                    Toast.makeText(this,"Not Found",Toast.LENGTH_SHORT).show()
                }
            }
        }



    }
}