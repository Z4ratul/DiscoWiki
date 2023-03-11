package ru.kostserg.discowiki.DataBase

import Build
import Item
import Thought
import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [Item::class, Thought::class, Build::class], version = 1)
abstract class WikiDB : RoomDatabase(){
    abstract  fun WikiItemDao(): WikiItemDao
    abstract  fun WikiThoughtDaoDao(): WikiThoughtDao
    abstract  fun WikiBuildDaoDao(): WikiBuildDao
}