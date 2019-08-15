package com.example.deeplinksample2

import android.app.Activity
import android.content.Intent
import android.net.Uri

fun Uri.isRoutable(): Boolean = when (this.toString()) {
    "computeristsolutions://first",
    "computeristsolutions://second" -> true
    else -> false
}

class RouteManager(private val data: Uri, private val currentActivity: Activity) {
    fun getRoutingIntent(): Intent {

        val intent = if (data.toString().contentEquals("computeristsolutions://first")) {
            Intent(currentActivity, Link1Activity::class.java)
        } else {
            Intent(currentActivity, Link2Activity::class.java)
        }

        return intent
    }
}