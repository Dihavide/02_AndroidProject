package com.example.a02_androidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splasg_screen.*
/**
 * This class implenents the code for the loading screen
 * Uses the animation features to set a fade effect
 * */
class SplasgScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splasg_screen)

        //Init time for timer is 0
        timerIcon.alpha = 0f

        //set duration for 1500ms, always override the current method
        //fade in then fade out into the app homepage
        timerIcon.animate().setDuration(1500).alpha(1f).withEndAction {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }




    }
}