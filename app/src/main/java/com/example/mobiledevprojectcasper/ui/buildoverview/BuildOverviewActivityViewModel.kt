package com.example.mobiledevprojectcasper.ui.buildoverview

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.mobiledevprojectcasper.model.BuildRepository
import kotlinx.coroutines.*

class BuildOverviewActivityViewModel(application: Application) : AndroidViewModel(application){

    private val buildRepository =
        BuildRepository(application.applicationContext)
    private val mainScope = CoroutineScope(Dispatchers.Main)

    val buildRaigonBuild = buildRepository.getRaigonBuilds()
    val buildJadeBuild = buildRepository.getJadeBuilds()
    val buildAshkaBuild = buildRepository.getAshkaBuilds()

    fun getRaigonBuild(){
        mainScope.launch { withContext(Dispatchers.IO){
            val buildRaigon = buildRaigonBuild
        } }
    }

    fun getJadeBuild(){
        mainScope.launch { withContext(Dispatchers.IO){
            val buildRaigon = buildJadeBuild
        } }
    }

    fun getAshkaBuild(){
        mainScope.launch { withContext(Dispatchers.IO){
            val buildRaigon = buildAshkaBuild
        } }
    }





}