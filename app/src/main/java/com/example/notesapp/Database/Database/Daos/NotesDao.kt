package com.example.notesapp.Database.Database.Daos

import androidx.room.*
import com.example.notesapp.Database.Database.Model.Note

@Dao
interface NotesDao {

    @Query("select * from Note")
    fun getAllNotes():List<Note>

    @Insert
    fun inseetNewNote ( note: Note)

    @Delete
    fun deleteNote ( note: Note)

    @Update
    fun updateNote ( note: Note)

    @Query(" select * from Note Where description Like :word")
    fun searchForNote ( word:String):List<Note>
}