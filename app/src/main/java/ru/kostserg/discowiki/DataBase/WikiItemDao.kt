package ru.kostserg.discowiki.DataBase

import Item
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface WikiItemDao {
    @Query("select * from items_table")
    fun getAllItems():List<Item>

    @Query("delete from items_table")
    fun deleteAllItems()

    @Insert
    fun insertItems(item:Item)

}