package com.example.mobiledevprojectcasper.Database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mobiledevprojectcasper.Database.Build

@Dao
interface BuildDao{

    @Query("SELECT * FROM buildOverviewTable")
    fun getBuild(): LiveData<Build?>

    @Insert
    suspend fun insertBuild(build: Build)

    @Update
    suspend fun updateBuild(build: Build)

    @Delete
    suspend fun deleteBuild(build: Build)
}