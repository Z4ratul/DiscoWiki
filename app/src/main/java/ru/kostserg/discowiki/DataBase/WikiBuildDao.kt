package ru.kostserg.discowiki.DataBase

import Build
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface WikiBuildDao {
    @Query("select * from build_table")
    fun getAllBuilds():List<Build>

    @Query("delete from build_table")
    fun deleteAllBuilds()

    @Insert
    fun insertBuild(build: Build)
}