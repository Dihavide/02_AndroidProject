package com.example.a02_androidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Sets the view of the activity to the correct .xml layout file
        setContentView(R.layout.activity_main)

        /**
         *This allows the button with an id of 'btnCheckSchedule' to perform a function upon clicking
         *Upon click, the main activity will switch to the view schedule activity where you can see the entire schedule
         **/
        btnCheckSchedule.setOnClickListener {
            startActivity(Intent(this,ViewScheduleActivity::class.java))
        }

        /**
         *This allows the button with an id of 'btnAddToSchedule' to perform a function upon clicking
         *Upon click, the main activity will switch to the view schedule activity where you can see the entire schedule and add to the schedule
         **/
        btnAddToSchedule.setOnClickListener {
            startActivity(Intent(this,ViewScheduleActivity::class.java))
        }

        /**
         *This allows the button with an id of 'btnDeleteFromSchedule' to perform a function upon clicking
         *Upon click, the main activity will switch to the delete from schedule activity where you can see the entire schedule and click another button to delete from the schedule
         **/
        btnDeleteFromSchedule.setOnClickListener {
            startActivity(Intent(this,DeleteFromScheduleActivity::class.java))
        }

    }
}