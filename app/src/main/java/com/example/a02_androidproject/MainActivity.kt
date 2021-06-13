package com.example.a02_androidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCheckSchedule.setOnClickListener {
            startActivity(Intent(this,ViewScheduleActivity::class.java))
        }

        btnAddToSchedule.setOnClickListener {
            startActivity(Intent(this,AddToScheduleActivity::class.java))
        }

        btnDeleteFromSchedule.setOnClickListener {
            startActivity(Intent(this,DeleteFromScheduleActivity::class.java))
        }

    }
}