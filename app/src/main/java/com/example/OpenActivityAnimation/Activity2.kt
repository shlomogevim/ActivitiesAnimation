package com.example.OpenActivityAnimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_activity2.*
import maes.tech.intentanim.CustomIntent

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity2)
        buttonInActivity2.setOnClickListener {
            startActivity(Intent(this,Activity3::class.java))
            CustomIntent.customType(this,"fadein-to-fadeout")
          //  CustomIntent.customType(this,"rotateout-to-rotatein")
           // CustomIntent.customType(this,"bottom-to-up")


        }
    }

    override fun finish() {
        super.finish()
        CustomIntent.customType(this,"fadein-to-fadeout")
        //CustomIntent.customType(this,"rotateout-to-rotatein")
      //  CustomIntent.customType(this,"bottom-to-up")

    }
}
