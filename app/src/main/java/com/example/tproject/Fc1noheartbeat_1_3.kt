package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Fc1noheartbeat_1_3 : AppCompatActivity() {
    override fun onBackPressed() {
        startActivity(Intent(this, Fc1noheartbeat_1_2::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1noheartbeat_1_3)
        val fun1131 = findViewById<ImageButton>(R.id.Fc1_1_3_1)
        fun1131.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1::class.java)
            startActivity(intent)
            finish()
        }
        val fun113a = findViewById<ImageButton>(R.id.Fc1_1_3_a)
        fun113a.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_a::class.java)
            startActivity(intent)
            finish()
        }
        val fun113n = findViewById<ImageButton>(R.id.Fc1_1_3_n)
        fun113n.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1_4::class.java)
            startActivity(intent)
            finish()
        }
        val fun113p = findViewById<ImageButton>(R.id.Fc1_1_3_p)
        fun113p.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_1_2::class.java)
            startActivity(intent)
            finish()
        }
        val fun113h = findViewById<ImageButton>(R.id.Fc1_1_3_h)
        fun113h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
            finish()
        }
        val fun113w = findViewById<ImageButton>(R.id.Fc1_1_3_w)
        fun113w.setOnClickListener {
            val intent = Intent(this, Fc1noheartbeat_w::class.java)
            startActivity(intent)
            finish()
        }
    }
}