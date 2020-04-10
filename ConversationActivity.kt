package com.example.crisisconnect

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.conversations.*

class ConversationActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.conversations)

        GoToMomAndDadConversation.setOnClickListener {
            startActivity(Intent(this,MomAndDadConversationActivity::class.java))
        }
        }
    }
