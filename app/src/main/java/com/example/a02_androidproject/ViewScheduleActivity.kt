package com.example.a02_androidproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_schedule_view.*

class ViewScheduleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule_view)

        btnAddToSchedule2.setOnClickListener {
            startActivity(Intent(this,AddToScheduleActivity::class.java))
        }

        btnDeleteFromSchedule2.setOnClickListener {
            startActivity(Intent(this,DeleteFromScheduleActivity::class.java))
        }

    }
}