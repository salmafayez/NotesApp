package com.example.notesapp.Database.Database.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Note")
data class Note (
    @PrimaryKey ( autoGenerate = true)
    val id: String,
    @ColumnInfo
    val title: String,
    @ColumnInfo
    val description: String,
    @ColumnInfo
    val date: String
)