package com.example.crisisconnect

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.mom_dad_conversation.*

class MomAndDadConversationActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mom_dad_conversation)

        GoToAddPolice.setOnClickListener {
            startActivity(Intent(this,AddPoliceActivity::class.java))
        }
    }
}
