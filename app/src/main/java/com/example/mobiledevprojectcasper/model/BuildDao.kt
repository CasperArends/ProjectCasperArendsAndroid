package com.example.mobiledevprojectcasper.model

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mobiledevprojectcasper.Database.Build

@Dao
interface BuildDao{

    //get Raigon
    @Query("SELECT characterSelected FROM buildOverviewTable WHERE characterSelected == 1")
    fun getRaigonSelected(): LiveData<List<Build>>

    //get Jade
    @Query("SELECT characterSelected FROM buildOverviewTable Where characterSelected == 2")
    fun getJadeSelected(): LiveData<List<Build>>

    //get Ashka
    @Query("SELECT characterSelected FROM buildOverviewTable Where characterSelected == 3")
    fun getAshkaSelected(): LiveData<List<Build>>

    @Insert
    suspend fun insertBuild(build: Build)

    @Update
    suspend fun updateBuild(build: Build)

    @Delete
    suspend fun deleteBuild(build: Build)
}