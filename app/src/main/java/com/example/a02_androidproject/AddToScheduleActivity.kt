package com.example.a02_androidproject

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_schedule_to_add.*
import kotlinx.android.synthetic.main.activity_schedule_view.*


class AddToScheduleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule_to_add)

//        rvScheduleList.adapter = ScheduleAdapter(mutableListOf())
//        rvScheduleList.layoutManager = LinearLayoutManager(this)

        btnAddTextToSchedule.setOnClickListener {
            Toast.makeText(this, etAddToSchedule.text.toString(), Toast.LENGTH_SHORT).show()
        }

//        btnAddTextToSchedule.setOnClickListener {
//            val scheduleContent = etAddToSchedule.text.toString()
//            if(scheduleContent.isNotEmpty())
//            {
//                ScheduleAdapter(mutableListOf()).addSchedule(Schedule(scheduleContent))
//                etAddToSchedule.text.clear()
//            }
//            else
//            {
//                Toast.makeText(this, "You have not inputted any parameters", Toast.LENGTH_SHORT).show()
//            }
//        }

    }
}