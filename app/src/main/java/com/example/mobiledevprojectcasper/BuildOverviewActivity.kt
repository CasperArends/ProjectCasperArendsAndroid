package com.example.mobiledevprojectcasper

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_buildoverview.*

class BuildOverviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buildoverview)
        initViews()
    }

    private fun initViews(){
        ib_BackButton.setOnClickListener(){
            onBackClick()
        }

        rvBuildOverview.layoutManager = StaggeredGridLayoutManager(1, LinearLayoutManager.VERTICAL)
    }



    private fun onBackClick(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}