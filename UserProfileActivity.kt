package com.example.crisisconnect

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.user_profile.*

class UserProfileActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_profile)

        goToConversations.setOnClickListener {
        startActivity(Intent(this,ConversationActivity::class.java))
    }
    }
}
