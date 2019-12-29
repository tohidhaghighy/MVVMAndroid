package com.example.mymvvm1.Rep

import com.example.mymvvm1.Rep.Data.Datamodel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api_Service {

    @FormUrlEncoded
    @POST("login.php")
    fun UserLogin(@Field("mobile")mobile:String,@Field("pass")pass:String): Call<Datamodel>


    companion object{
        operator fun invoke():Api_Service{
            return Retrofit.Builder().baseUrl("http:192.169.1.102")
                .addConverterFactory(GsonConverterFactory.create()).build().create(Api_Service::class.java)
        }
    }
}