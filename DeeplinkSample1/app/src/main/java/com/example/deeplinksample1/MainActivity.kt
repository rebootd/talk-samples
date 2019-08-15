package com.example.deeplinksample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
