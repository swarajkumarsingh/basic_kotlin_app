package com.example.peopleapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        val txt = findViewById<TextView>(R.id.textView)
        val ha = findViewById<TextView>(R.id.ha)



        txt.text = "0"
        var timesClicked = 0

        btn.setOnClickListener {
            println("Hello World by Button")
            timesClicked += 1
            txt.text = timesClicked.toString()
            btn.text = "MAHABHARATA"
            Toast.makeText(this, "Hey I am a toast", Toast.LENGTH_SHORT).show()

            if (timesClicked == 5) {
                ha.text = "You clicked me 5 times"
            }

        }

    }
}