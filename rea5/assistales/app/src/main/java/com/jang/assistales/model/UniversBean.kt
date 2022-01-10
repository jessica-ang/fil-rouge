package com.jang.assistales.model

import androidx.room.*

@Entity(tableName = "univers")
class UniversBean(
    val name: String,
    @PrimaryKey(autoGenerate = true)
    var id_univers: Long = 0
) {
    override fun toString(): String {
        return name
    }


    @Dao
    interface UniversDao {
        @Query("SELECT * FROM univers ORDER BY name ASC")
        fun getAll(): List<UniversBean>

        @Insert
        fun insert(univers: UniversBean): Long

        @Update
        fun update(univers: UniversBean)

        @Delete
        fun delete(univers: UniversBean)

        @Query("SELECT name FROM univers ORDER BY name ASC")
        fun getName(): List<String>
    }

}