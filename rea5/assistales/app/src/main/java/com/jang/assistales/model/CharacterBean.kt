package com.jang.assistales.model

import androidx.room.*

@Entity(
    tableName = "character"
)
class CharacterBean(
    val name: String,
    val firstname: String,
    @PrimaryKey(autoGenerate = true)
    val id_character: Long = 0,
    val nickname: String? = null,
    val gender: String? = null,
    val age: String? = null,
    val job: String? = null,
    val oldJob: String? = null,
    val softskill: String? = null,
    val fault: String? = null,
    val talent: String? = null,
    val weakness: String? = null,
    val clash: String? = null,
    val skills: String? = null,
    val language: String? = null,
    val interest: String? = null,
    val childhood: String? = null,
    val bestMemory: String? = null,
    val worstMemory: String? = null,
    val trophy: String? = null,
    val failure: String? = null,
    val secret: String? = null,
    val objective: String? = null,
    val anedocte: String? = null,
    val height: String? = null,
    val weight: String? = null,
    val skin: String? = null,
    val hair: String? = null,
    val eyes: String? = null,
    val ear: String? = null,
    val scar: String? = null,
    val tatoo: String? = null,
    val look: String? = null,
    val particularity: String? = null,
    val other: String? = null


) {
    override fun toString(): String {
        return name + " " + firstname
    }


    @Dao
    interface CharacterDao {
        @Query("SELECT * FROM character ORDER BY name ASC")
        fun getAll(): List<CharacterBean>

        @Insert
        fun insert(character: CharacterBean): Long

        @Update
        fun update(character: CharacterBean)

        @Delete
        fun delete(character: CharacterBean)

        @Query("SELECT name FROM character ORDER BY name ASC")
        fun getName(): List<String>

        @Query("SELECT firstname FROM character ORDER BY firstname ASC")
        fun getFirstname(): List<String>
    }
}