package com.example.tproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fc1nobreath_s_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fc1nobreath_s_3)
        val fun14s3a = findViewById<Button>(R.id.Fc1_4_s3_a)
        fun14s3a.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_a_1::class.java)
            startActivity(intent)
        }
        val fun14s3s = findViewById<Button>(R.id.Fc1_4_s3_s)
        fun14s3s.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_1::class.java)
            startActivity(intent)
        }
        val fun14s3n = findViewById<Button>(R.id.Fc1_4_s3_n)
        fun14s3n.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_4::class.java)
            startActivity(intent)
        }
        val fun14s3h = findViewById<Button>(R.id.Fc1_4_s3_h)
        fun14s3h.setOnClickListener {
            val intent = Intent(this, Fc1main::class.java)
            startActivity(intent)
        }
        val fun14s3w = findViewById<Button>(R.id.Fc1_4_s3_w)
        fun14s3w.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_w::class.java)
            startActivity(intent)
        }
        val fun14s3p = findViewById<Button>(R.id.Fc1_4_s3_p)
        fun14s3p.setOnClickListener {
            val intent = Intent(this, Fc1nobreath_s_2::class.java)
            startActivity(intent)
        }
    }
}