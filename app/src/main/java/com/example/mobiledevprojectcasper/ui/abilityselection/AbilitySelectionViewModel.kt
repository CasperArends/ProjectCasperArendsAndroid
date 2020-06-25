package com.example.mobiledevprojectcasper.ui.abilityselection

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.mobiledevprojectcasper.Database.Build
import com.example.mobiledevprojectcasper.model.BuildRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AbilitySelectionViewModel(application: Application) : AndroidViewModel(application) {

    private val buildRepository =
        BuildRepository(application.applicationContext)
    private val mainScope = CoroutineScope(Dispatchers.Main)

    val buildRaigonBuild = buildRepository.getRaigonBuilds()

    fun deleteBuild(build: Build){
        mainScope.launch {
            withContext(Dispatchers.IO){
                buildRepository.deleteBuild(build)
            }

        }
    }

    fun addBuild(build: Build){
        mainScope.launch {
            withContext(Dispatchers.IO){
                buildRepository.insertBuild(build)
            }
        }

    }
}