package com.example.mobiledevprojectcasper.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobiledevprojectcasper.R
import com.example.mobiledevprojectcasper.ui.buildoverview.BuildOverviewActivity
import com.example.mobiledevprojectcasper.ui.buildoverview.BuildOverviewActivity.Companion.CHARACTERCLICKED
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    companion object{
//        val CHARACTERCLICKED = "characterSelection"
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews(){
        ivRaigon.setOnClickListener(){
            raigonClick()
        }

        ivJade.setOnClickListener(){
            jadeClick()
        }

        ivAshka.setOnClickListener(){
            ashkaClick()

        }

    }

    private fun raigonClick(){
        val intent = Intent(this, BuildOverviewActivity::class.java)
        intent.putExtra(CHARACTERCLICKED, 1)
        startActivity(intent)
    }

    private fun jadeClick(){
        val intent = Intent(this, BuildOverviewActivity::class.java)
        intent.putExtra(CHARACTERCLICKED, 2)
        startActivity(intent)
    }

    private fun ashkaClick(){
        val intent = Intent(this, BuildOverviewActivity::class.java)
        intent.putExtra(CHARACTERCLICKED, 3)
        startActivity(intent)
    }

}
