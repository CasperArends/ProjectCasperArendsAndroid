package com.example.mobiledevprojectcasper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_abilityselection.*

class AbilitySelectionActivity : AppCompatActivity() {

    private val abilities = arrayListOf<Build>()

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abilityselection)
        initViews()
    }

    private fun initViews(){
        rvAbilities.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)

        for (){

        }
    }

}