package com.example.firebase_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.Firebase
import com.google.firebase.database.database

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val  button = findViewById<Button>(R.id.button)
        val database = Firebase.database
        val myRef = database.getReference("message")

        button.setOnClickListener {
            myRef.setValue("Faysal vugi chugi")
        }
    }
}