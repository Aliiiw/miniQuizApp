package com.alirahimi.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btnStart)
        val userName = findViewById<TextView>(R.id.etName)

        btnStart.setOnClickListener {
            if (userName.text.isEmpty()) {
                Toast.makeText(this, "Name can't be Empty!!", Toast.LENGTH_LONG).show()
            } else {
                Intent(this, QuizQuestionActivity::class.java).also {
                    startActivity(it)
                    finish()
                }

            }
        }

    }
}