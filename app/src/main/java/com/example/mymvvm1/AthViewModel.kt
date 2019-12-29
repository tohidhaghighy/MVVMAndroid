package com.example.mymvvm1

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mymvvm1.Rep.UserLogin

class AthViewModel : ViewModel() {

    var user:String?=null
    var pass:String?=null
    var interfacecheck:InterfaceviewModel?=null

    fun click(view :View){
        if(user.isNullOrEmpty()){
            interfacecheck?.Error("user name is empty")
        }else  if(pass.isNullOrEmpty()){
            interfacecheck?.Error("password is empty")
        }else{
            val user=UserLogin().UserLoginRep(user!!,pass!!)
            interfacecheck?.Success(user)
        }
    }

}