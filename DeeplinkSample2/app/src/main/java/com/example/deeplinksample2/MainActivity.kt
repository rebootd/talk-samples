package com.example.deeplinksample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity
import android.content.Intent
import android.net.Uri


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data: Uri? = intent?.data

        if(data != null && data.isRoutable()) {
            val routeManager = RouteManager(data, this@MainActivity)
            this@MainActivity.startActivity(routeManager.getRoutingIntent())
        }

        findViewById<Button>(R.id.button1).setOnClickListener {
            val myIntent = Intent(this@MainActivity, Link1Activity::class.java)
            this@MainActivity.startActivity(myIntent)
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            val myIntent = Intent(this@MainActivity, Link2Activity::class.java)
            this@MainActivity.startActivity(myIntent)
        }
    }
}
