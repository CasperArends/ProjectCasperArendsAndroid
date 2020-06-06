package com.example.mobiledevprojectcasper

import android.provider.ContactsContract
import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface BuildDao{
    suspend fun insertBuild(build: Build)

    @Query("SELECT * FROM buildOverviewTable")
    fun getBuild(): LiveData<List<Build>>

    @Update
    suspend fun updateBuild(build: Build)

    @Delete
    suspend fun deleteBuild(build: Build)
}