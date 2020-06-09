package com.example.mobiledevprojectcasper.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Build::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)

abstract class BuildRoomDatabase : RoomDatabase(){

    abstract fun buildDao(): BuildDao

    companion object{
        private const val DATABASE_NAME = "BUILD_DATABASE"

    @Volatile
    private var buildRoomDatabaseInstance:
            BuildRoomDatabase? = null

        fun getDatabase(context: Context): BuildRoomDatabase?{
            if (buildRoomDatabaseInstance == null){
                synchronized(BuildRoomDatabase::class.java){
                    if (buildRoomDatabaseInstance == null){
                        buildRoomDatabaseInstance = Room.databaseBuilder(context.applicationContext, BuildRoomDatabase::class.java, DATABASE_NAME).fallbackToDestructiveMigration().build()
                    }
                }
            }
            return buildRoomDatabaseInstance
        }

    }
}