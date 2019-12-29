package com.example.mymvvm1.RoomLayer.Entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "users")
class UserEntity (@PrimaryKey(autoGenerate = true) var id:Int,
                  @ColumnInfo(name = "user_name")var name:String,
                  @ColumnInfo(name="user_email")var email:String? = "",
                  @ColumnInfo(name="user_number")var number:String){

    constructor(name: String,email: String?,number: String): this(0,name,email,number)

}