package com.adriandevs.intentprojectandroid.core.utils

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import com.adriandevs.intentprojectandroid.core.constants.Constants

object IntentUtils {
    fun openGoogleUrl(activity: AppCompatActivity) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(Constants.GoogleUrl))
        activity.startActivity(browserIntent)
    }
}