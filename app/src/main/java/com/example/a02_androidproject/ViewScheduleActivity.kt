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

        //Sets the view of the activity to the correct .xml layout file
        setContentView(R.layout.activity_schedule_view)



        //Sends an empty array into ScheduleAdapter and sets it to a variable
        scheduleAdapter = ScheduleAdapter(mutableListOf())

        //Uses the ScheduleAdapter class that was passed an empty or populated array and adapts it to the recyclerview layout for a visual list of that array
        rvScheduleList.adapter = scheduleAdapter
        //Makes it so that the visual orientation of the recyclerview is that of a linear one
        rvScheduleList.layoutManager = LinearLayoutManager(this)

        /**
         *This allows the button with an id of 'btnAddTextToSchedule' to perform a function upon clicking
         *Upon click, the text inside the edit text space will be converted to a string, and added to the recyclerview as an item of the list
         **/
        btnAddTextToSchedule.setOnClickListener {

            //Sets the user input inside the etAddToSchedule space to a string and stores it into a  variable
            val scheduleContent = etAddToSchedule.text.toString()

            //If user input was given upon the click of the button
            if(scheduleContent.isNotEmpty())
            {
                val displaySchedule = "    -  " + scheduleContent
                //Take the user input, run it through the data class,then uses the addSchedule function found in the adapter to add that user input into the array at the last index
                scheduleAdapter.addSchedule(Schedule(displaySchedule))
                //Clears any user input that is already inside the etAddToSchedule box
                etAddToSchedule.text.clear()
                //Creates a message saying that the input has been added to the schedule
                Toast.makeText(this, "Added to schedule", Toast.LENGTH_SHORT).show()
            }

            //If user input was not given upon the click of the button
            else
            {
                //Creates a message indicating that no input was given
                Toast.makeText(this, "You have not inputted any parameters", Toast.LENGTH_SHORT).show()
            }
        }

        /**
         *This allows the button with an id of 'btnDeleteFromSchedule2' to perform a function upon clicking
         *Upon click, activity will switch the current activity to the DeleteFromScheduleActivity activity
         **/
        btnDeleteFromSchedule2.setOnClickListener {
            startActivity(Intent(this,DeleteFromScheduleActivity::class.java))
        }

    }
}