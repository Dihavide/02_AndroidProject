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
            val intent = Intent(this,ViewScheduleActivity::class.java)
            startActivity(intent)
        }

    }
}