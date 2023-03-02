package ru.kostserg.discowiki.DataBase

import Item
import Thought
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface WikiThoughtDao {
    @Query("select * from thought_table")
    fun getAllThoughts():List<Thought>

    @Query("delete from thought_table")
    fun deleteAllThoughts()

    @Insert
    fun insertThought(thought: Thought)

}