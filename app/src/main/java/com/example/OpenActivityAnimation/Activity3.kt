package com.example.OpenActivityAnimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import maes.tech.intentanim.CustomIntent

class Activity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

    }

    override fun finish() {
        super.finish()
        CustomIntent.customType(this,"fadein-to-fadeout")
      //  CustomIntent.customType(this,"rotateout-to-rotatein")
     //   CustomIntent.customType(this,"bottom-to-up")

    }
}
