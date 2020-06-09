package com.example.mobiledevprojectcasper.Database

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.mobiledevprojectcasper.Database.BuildDao

class BuildRepository (context: Context) {

    private val buildDao: BuildDao

    init {
        val database = BuildRoomDatabase.getDatabase(context)
        buildDao = database!!.buildDao()
    }

    suspend fun getAllBuilds(): LiveData<Build?> {
        return buildDao.getBuild()
    }

    suspend fun insertBuild(build: Build){
        buildDao.insertBuild(build)
    }

    suspend fun deleteBuild(build: Build) {
        buildDao.deleteBuild(build)
    }
}