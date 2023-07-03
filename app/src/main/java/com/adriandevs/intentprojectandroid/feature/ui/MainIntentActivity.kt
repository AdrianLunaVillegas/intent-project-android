package com.adriandevs.intentprojectandroid.feature.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adriandevs.intentprojectandroid.core.utils.IntentUtils
import com.adriandevs.intentprojectandroid.databinding.ActivityIntentBinding


class MainIntentActivity : AppCompatActivity() {

    private lateinit var binding : ActivityIntentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialize()
    }

    private fun initialize() {
        configGoogleButton()
        configEmailButton()
    }

    private fun configEmailButton() {
        binding.apply {
            emailButton.setOnClickListener {

            }
        }
    }

    private fun configGoogleButton() {
        binding.apply {
            googleButton.setOnClickListener {
                IntentUtils.openGoogleUrl(this@MainIntentActivity)
            }
        }

    }

}