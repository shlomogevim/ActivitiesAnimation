package com.example.OpenActivityAnimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonInMain.setOnClickListener {
            startActivity(Intent(this,Activity2::class.java))
           // overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left)
        }
    }
}
