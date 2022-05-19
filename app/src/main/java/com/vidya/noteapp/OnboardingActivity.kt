package com.vidya.noteapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_onboarding.*

class OnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        btn_started.setOnClickListener {

            val intent= Intent (this@OnboardingActivity,
                LoginActivity::class.java)
            startActivity(intent)
        }

    }
}