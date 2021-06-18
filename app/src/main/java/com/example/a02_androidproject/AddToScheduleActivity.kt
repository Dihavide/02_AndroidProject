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

        //Sets the view of the activity to the correct .xml layout file
        setContentView(R.layout.activity_schedule_to_add)

    }
}