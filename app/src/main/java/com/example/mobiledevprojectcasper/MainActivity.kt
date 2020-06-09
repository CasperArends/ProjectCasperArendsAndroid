package com.example.mobiledevprojectcasper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews(){
        ivRaigon.setOnClickListener(){
            raigonClick()
        }

    }

    private fun raigonClick(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }



}
