package com.example.mobiledevprojectcasper

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.mobiledevprojectcasper.Database.Build
import com.example.mobiledevprojectcasper.Database.BuildAdapter
import kotlinx.android.synthetic.main.activity_abilityselection.*
import kotlinx.android.synthetic.main.item_ability.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AbilitySelectionActivity : AppCompatActivity() {

    private val abilities = arrayListOf<Build>()
    private var counter = 0
    private val buildAdapter =
        BuildAdapter(abilities)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abilityselection)
        initViews()
    }

    private fun initViews() {
        rvAbilities.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        rvAbilities.adapter = buildAdapter

        for (i in Build.BUILD_RAIGON.indices) {
            abilities.add(
                Build(
                    Build.BUILD_RAIGON[i],
                    null,
                    null,
                    null,
                    null,
                    null,
                    "New Build"
                )

            )



            ivAbility.setOnClickListener() {
                addToBuild(ivAbility.drawable)
                counter++
            }

        }
    }
//vind naam van image +_Logo to set to ibAbility
    private fun addToBuild(drawable: Drawable) {
        if (counter == 0){
            ibAbility0.setImageResource()
        }

        else if (counter == 1){
            ibAbility1.setImageResource()
        }

        else if (counter == 2){
            ibAbility2.setImageResource()
        }

        else if (counter == 3){
            ibAbility3.setImageResource()
        }

        else if (counter == 4){
            ibAbility4.setImageResource()
        }
    }



    private fun updateDatabase() {
        CoroutineScope(Dispatchers.Main).launch {
            val build = Build(

            )
        }
    }
}

