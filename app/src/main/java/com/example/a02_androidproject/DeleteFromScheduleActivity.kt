package com.example.a02_androidproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class DeleteFromScheduleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         *Sets the view of the activity to the correct .xml layout file
         **/
        setContentView(R.layout.activity_schedule_from_delete)

    }
}