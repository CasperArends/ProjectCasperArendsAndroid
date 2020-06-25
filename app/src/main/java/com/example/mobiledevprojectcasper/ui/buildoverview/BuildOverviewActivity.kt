package com.example.mobiledevprojectcasper.ui.buildoverview

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.mobiledevprojectcasper.CharacterSelection
import com.example.mobiledevprojectcasper.Database.Build
import com.example.mobiledevprojectcasper.Database.BuildAdapter
import com.example.mobiledevprojectcasper.model.BuildRepository
import com.example.mobiledevprojectcasper.ui.main.MainActivity
import com.example.mobiledevprojectcasper.R
import com.example.mobiledevprojectcasper.ui.abilityselection.AbilitySelectionActivity
import kotlinx.android.synthetic.main.activity_buildoverview.*

class BuildOverviewActivity : AppCompatActivity() {
    companion object{
        val CHARACTERCLICKED = "characterSelection"
    }
    private lateinit var buildOverviewActivityViewModel: BuildOverviewActivityViewModel
    private var clickedCharacter: Int? = 0
    private val abilities = arrayListOf<Build>()
    private val buildAdapter = BuildAdapter(abilities)
    private lateinit var buildRepository : BuildRepository
    private val buildRaigon = arrayListOf<Build>()
    private val buildJade = arrayListOf<Build>()
    private val buildAshka = arrayListOf<Build>()

    override fun onCreate(savedInstanceState: Bundle?) {
        buildRepository =
            BuildRepository(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buildoverview)

        initViews()
        initViewModel()
    }

    private fun initViews(){
        clickedCharacter = intent.extras?.getInt(CHARACTERCLICKED, 0)
        println("buildoverview getal: " + clickedCharacter)

        ib_BackButton.setOnClickListener(){
            onBackClick()
        }

        ibAddBuild.setOnClickListener(){
            addBuildClick()

        }

        rvBuildOverview.layoutManager = StaggeredGridLayoutManager(1, LinearLayoutManager.VERTICAL)
        rvBuildOverview.adapter = buildAdapter

        //Raigon
        if (clickedCharacter == CharacterSelection.RAIGON) {

        }
        //Jade
        else if(clickedCharacter == CharacterSelection.JADE) {

        }
        //Ashka
        else if(clickedCharacter == CharacterSelection.ASHKA) {

        }
    }

    private fun initViewModel(){
        buildOverviewActivityViewModel = ViewModelProvider(this).get(BuildOverviewActivityViewModel::class.java)
        //Raigon
            buildOverviewActivityViewModel.buildRaigonBuild.observe(this, Observer{
                buildRaigon.clear()
                buildRaigon.addAll(it)
                buildAdapter.notifyDataSetChanged()
            })



    }

    private fun addBuildClick() {
        val intent = Intent(this, AbilitySelectionActivity::class.java)
        intent.putExtra(CHARACTERCLICKED, clickedCharacter)
        startActivity(intent)
    }

    private fun onBackClick(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}