package com.edmitryv.lrs

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.edmitryv.lrs.LR13.ActivityLR13


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnLR4 = findViewById<Button>(R.id.btn_lr4)
        btnLR4.setOnClickListener {
            startActivity(Intent(this, ActivityLR4::class.java))
        }
        val btnLR8 = findViewById<Button>(R.id.btn_lr8)
        btnLR8.setOnClickListener {
            startActivity(Intent(this, ActivityLR8::class.java))
        }
        val btnLR13 = findViewById<Button>(R.id.btn_lr13)
        btnLR13.setOnClickListener {
            startActivity(Intent(this, ActivityLR13::class.java))
        }
    }
}