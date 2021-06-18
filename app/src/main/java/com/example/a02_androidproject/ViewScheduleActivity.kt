package com.example.a02_androidproject

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_schedule_view.*

class ViewScheduleActivity : AppCompatActivity() {

    private lateinit var scheduleAdapter : ScheduleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule_view)
        

        scheduleAdapter = ScheduleAdapter(mutableListOf())

        rvScheduleList.adapter = scheduleAdapter
        rvScheduleList.layoutManager = LinearLayoutManager(this)

        btnAddTextToSchedule.setOnClickListener {
            val scheduleContent = "    -  " + etAddToSchedule.text.toString()
            if(scheduleContent.isNotEmpty())
            {
                scheduleAdapter.addSchedule(Schedule(scheduleContent))
                etAddToSchedule.text.clear()
                Toast.makeText(this, "Added to schedule", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this, "You have not inputted any parameters", Toast.LENGTH_SHORT).show()
            }
        }

        btnDeleteFromSchedule2.setOnClickListener {
            startActivity(Intent(this,DeleteFromScheduleActivity::class.java))
        }

    }
}