package com.example.notesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notesapp.Database.Database.MyDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      MyDatabase.getInstance(applicationContext)?.nottesDao()?.getAllNotes()
    }
}