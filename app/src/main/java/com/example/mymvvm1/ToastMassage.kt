package com.example.mymvvm1

import android.content.Context
import android.widget.Toast

fun Context.ToastMassage(msg:String) {
    Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
}