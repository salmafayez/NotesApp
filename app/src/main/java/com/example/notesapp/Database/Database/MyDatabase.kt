package com.example.notesapp.Database.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase
import com.example.notesapp.Database.Database.Daos.NotesDao
import com.example.notesapp.Database.Database.Model.Note

@Database( entities = arrayOf(Note::class), exportSchema = false , version = 1)
abstract class MyDatabase :RoomDatabase(){
    abstract fun nottesDao():NotesDao
    companion object{
        private var myDatabase:MyDatabase?=null
        fun getInstance (context :Context):MyDatabase?{
            if ( myDatabase==null){
                myDatabase= Room.databaseBuilder(context,MyDatabase::class.java,"NotesDatabase")
                    .fallbackToDestructiveMigration().allowMainThreadQueries()
                    .build()
            }
            return myDatabase
        }

    }
}