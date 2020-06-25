package com.example.mobiledevprojectcasper.ui.abilityselection

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobiledevprojectcasper.ui.buildoverview.BuildOverviewActivity.Companion.CHARACTERCLICKED
import com.example.mobiledevprojectcasper.CharacterSelection
import com.example.mobiledevprojectcasper.Database.*
import com.example.mobiledevprojectcasper.R
import com.example.mobiledevprojectcasper.model.BuildRepository
import kotlinx.android.synthetic.main.activity_abilityselection.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AbilitySelectionActivity : AppCompatActivity() {

    private var counter = 0
    private val abilities = arrayListOf<Ability>()
    private val abilitiesAdapter = AbilityAdapter(abilities)
    private lateinit var buildRepository : BuildRepository
    private val mainScope = CoroutineScope(Dispatchers.Main)
    private lateinit var abilitySelectionViewModel: AbilitySelectionViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abilityselection)
        buildRepository =
            BuildRepository(application)

        initViews()
    }



    private fun initViews() {
        var ibAbility = findViewById<ImageButton>(R.id.ibAbilityButton)
        var clickedCharacter = intent.extras?.getInt(CHARACTERCLICKED, 0)
        rvAbilities.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvAbilities.adapter = abilitiesAdapter
        println("het geclickte caracter " + clickedCharacter)

        btnDone.setOnClickListener{
            println("test")
            mainScope.launch {
                withContext(Dispatchers.IO){
                    buildRepository.insertBuild(Build(null, clickedCharacter,
                        tvAbility0.text.toString(), tvAbility0.text.toString(),
                        tvAbility0.text.toString(), tvAbility0.text.toString(),
                        tvAbility0.text.toString(), etBuildName.text.toString()))

                    mainScope.launch {
                        withContext(Dispatchers.Main){
                            finish()
                        }
                    }
                }

            }


        }

        when (clickedCharacter){
            CharacterSelection.RAIGON ->
                for (i in Build.ABILITY_RAIGON_NAME.indices){
                    abilities.add(
                        Ability(Build.ABILITY_RAIGON_NAME[i], Build.ABILITY_RAIGON[i],
                            Build.ABILITY_RAIGON_LOGO[i])
                    )

                }

            CharacterSelection.JADE ->
                for (i in Build.ABILITY_JADE_NAME.indices){
                    abilities.add(
                        Ability(Build.ABILITY_JADE_NAME[i], Build.ABILITY_JADE[i],
                            Build.ABILITY_JADE_LOGO[i])
                    )

                }

            CharacterSelection.ASHKA ->
                for (i in Build.ABILITY_ASHKA_NAME.indices){
                    abilities.add(
                        Ability(Build.ABILITY_ASHKA_NAME[i], Build.ABILITY_ASHKA[i],
                            Build.ABILITY_ASHKA_LOGO[i])
                    )

                }
        }
    }



//vind naam van image +_Logo to set to ibAbility




    private fun updateDatabase() {


    }

    private fun addToDatabase(){

    }
}

