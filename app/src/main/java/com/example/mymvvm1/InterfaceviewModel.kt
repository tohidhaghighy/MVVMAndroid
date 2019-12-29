package com.example.mymvvm1

import androidx.lifecycle.LiveData

interface InterfaceviewModel {

    fun Error(msg:String)
    fun Success(UserLogin:LiveData<String>)


}