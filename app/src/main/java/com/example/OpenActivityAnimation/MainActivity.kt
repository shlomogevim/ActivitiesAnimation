package com.example.OpenActivityAnimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import maes.tech.intentanim.CustomIntent



//    https://github.com/hajiyevelnur92/intentanimation
//   rotate is not working

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonInMain.setOnClickListener {
            startActivity(Intent(this,Activity2::class.java))
            CustomIntent.customType(this,"fadein-to-fadeout")
           // CustomIntent.customType(this,"rotateout-to-rotatein")
           // CustomIntent.customType(this,"bottom-to-up")

        }
    }
}
