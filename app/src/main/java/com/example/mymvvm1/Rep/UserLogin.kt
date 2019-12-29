package com.example.mymvvm1.Rep

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mymvvm1.Rep.Data.Datamodel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserLogin {

    fun UserLoginRep(mobile:String,pass:String):LiveData<String>{
        val response_login=MutableLiveData<String>()
        Api_Service().UserLogin(mobile!!,pass!!).enqueue(object : Callback<Datamodel> {
            override fun onFailure(call: Call<Datamodel>, t: Throwable) {
                response_login.value=t.message
            }

            override fun onResponse(call: Call<Datamodel>, response: Response<Datamodel>) {
                if (response.isSuccessful){
                    response_login.value=response.body()!!.status
                }
            }

        })
        return response_login
    }
}