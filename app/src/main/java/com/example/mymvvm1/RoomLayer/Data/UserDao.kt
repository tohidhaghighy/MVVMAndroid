package com.example.mymvvm1.RoomLayer.Data

import androidx.room.*
import com.example.mymvvm1.RoomLayer.Entities.UserEntity

@Dao
interface UserDao {

    @Query(value = "select * from users")
    fun GetAll():List<UserEntity>

    @Insert
    fun Insert(user:UserEntity)

    @Update
    fun Update(user:UserEntity)

    @Delete
    fun Delete(user: UserEntity)

    @Query(value = "delete from users")
    fun DeleteAll()

    @Query(value = "select * from users where id = :id")
    fun GetsingleUser(id:Int)
}