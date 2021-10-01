package com.jang.assistales.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jang.assistales.model.*

@Database(
    entities = [ProjectBean::class, UniversBean::class, CharacterBean::class, DeitiesBean::class, PlaceBean::class, FaunaBean::class, FloraBean::class, ItemBean::class],
    version = 1,
    exportSchema = false
)
abstract class SheetDatabase : RoomDatabase() {
    abstract fun projectDao(): ProjectBean.ProjectDao
    abstract fun universDao(): UniversBean.UniversDao
    abstract fun characterDao(): CharacterBean.CharacterDao
    abstract fun deitiesDao(): DeitiesBean.DeitiesDao
    abstract fun placeDao(): PlaceBean.PlaceDao
    abstract fun faunaDao(): FaunaBean.FaunaDao
    abstract fun floraDao(): FloraBean.FloraDao
    abstract fun itemDao(): ItemBean.ItemDao

    companion object {
        private var INSTANCE: SheetDatabase? = null
        fun getDatabase(context: Context) =
            INSTANCE ?: Room.databaseBuilder(context, SheetDatabase::class.java, "sheet_database")
                .fallbackToDestructiveMigration().build().also { INSTANCE = it }
    }
}