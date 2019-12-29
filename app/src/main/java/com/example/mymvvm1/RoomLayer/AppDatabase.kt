package com.example.mymvvm1.RoomLayer

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mymvvm1.RoomLayer.Data.UserDao
import com.example.mymvvm1.RoomLayer.Entities.UserEntity

@Database(entities = arrayOf(UserEntity::class),version = 1)
abstract class AppDatabase:RoomDatabase() {

    abstract fun user():UserDao

    companion object{
        private var istanse :AppDatabase? =null

        public val DB_NAME="basic_room"

        fun getInstanse(context:Context):AppDatabase{
            if (istanse==null){
                istanse=Room.databaseBuilder(context,AppDatabase::class.java, DB_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }

            return istanse!!
        }
    }
}