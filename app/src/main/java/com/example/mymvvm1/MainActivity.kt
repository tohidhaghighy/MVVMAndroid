package com.example.mymvvm1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.mymvvm1.RoomLayer.AppDatabase
import com.example.mymvvm1.RoomLayer.Entities.UserEntity
import com.example.mymvvm1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() ,InterfaceviewModel{

    val context =this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bind:(ActivityMainBinding)=DataBindingUtil.setContentView(this,R.layout.activity_main)
        val viewmodel=ViewModelProviders.of(this).get(AthViewModel::class.java)
        bind.viewmodel=viewmodel
        viewmodel.interfacecheck=this

        test()
    }

    override fun Error(msg: String) {
        ToastMassage(msg)
    }

    override fun Success(UserLogin:LiveData<String>) {
        UserLogin.observe(this, Observer {
            ToastMassage(it)
        })
    }


    fun test(){
        val db=AppDatabase.getInstanse(context)

        val user1=UserEntity("tohid haghighi",null,"09144967941")

        db.user().Insert(user1)
        val getdata=db.user().GetAll()
    }
}
