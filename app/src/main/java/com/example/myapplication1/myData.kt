package com.example.myapplication1

import android.widget.EditText

class myData {
   companion object {
       var Users = mutableListOf<User>()
       var LoggedInUser = User("","","","")
       }
   }
class  User(var name: String, var email: String, var password: String, var country: String){}

