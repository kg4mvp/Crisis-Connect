package com.example.crisisconnect

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.add_911.*

class AddPoliceActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_911)

        GoToAlertReceived911.setOnClickListener {
            startActivity(Intent(this,AlertReceived911::class.java))
        }
    }
}
