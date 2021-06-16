package com.example.a02_androidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_schedule_to_add.*
import kotlinx.android.synthetic.main.activity_schedule_view.*

class MainActivity : AppCompatActivity() {

    private lateinit var scheduleAdapter: ScheduleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        scheduleAdapter = ScheduleAdapter(mutableListOf())
//        rvScheduleList.adapter = scheduleAdapter
//        rvScheduleList.layoutManager = LinearLayoutManager(this)

/**
 *This allows the 'btnCheckSchedule' to perform a function upon clicking
 **/
        btnCheckSchedule.setOnClickListener {
            startActivity(Intent(this,ViewScheduleActivity::class.java))
        }

        btnAddToSchedule.setOnClickListener {
            startActivity(Intent(this,AddToScheduleActivity::class.java))
        }

        btnDeleteFromSchedule.setOnClickListener {
            startActivity(Intent(this,DeleteFromScheduleActivity::class.java))
        }

//        btnAddTextToSchedule.setOnClickListener {
//            val scheduleContent = etAddToSchedule.text.toString()
//            if(scheduleContent.isNotEmpty())
//            {
//                val scheduleTwo = Schedule(scheduleContent)
//                scheduleAdapter.addSchedule(scheduleTwo)
//            }
//            else
//            {
//                Toast.makeText(this, "You have not inputted any parameters", Toast.LENGTH_SHORT).show()
//
//            }
//        }





    }
}