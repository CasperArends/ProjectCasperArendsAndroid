package com.example.mobiledevprojectcasper.model

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.mobiledevprojectcasper.Database.Build

class BuildRepository (context: Context) {

    private val buildDao: BuildDao

    init {
        val buildRoomDatabase = BuildRoomDatabase.getDatabase(context)
        buildDao = buildRoomDatabase!!.buildDao()
    }

    fun getRaigonBuilds(): LiveData<List<Build>> {
        return buildDao.getRaigonSelected()
    }

    fun getJadeBuilds(): LiveData<List<Build>> {
        return buildDao.getJadeSelected()
    }

    fun getAshkaBuilds(): LiveData<List<Build>> {
        return buildDao.getAshkaSelected()
    }

    suspend fun insertBuild(build: Build){
        buildDao.insertBuild(build)
    }

    suspend fun deleteBuild(build: Build) {
        buildDao.deleteBuild(build)
    }
}