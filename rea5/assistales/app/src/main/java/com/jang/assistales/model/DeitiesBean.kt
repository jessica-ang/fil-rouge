package com.jang.assistales.model

import androidx.room.*

@Entity(
    tableName = "deities",
    /*foreignKeys = [ForeignKey(
        entity = UniversBean::class,
        parentColumns = ["id_univers"],
        childColumns = ["universId"]
    )]*/
)
class DeitiesBean(
    val name: String,
    @PrimaryKey(autoGenerate = true)
    val id_deities: Long = 0,
    val otherName: String? = null,
    val description: String? = null,
    val age: String? = null,
    val talent: String? = null,
    val weakness: String? = null,
    val iq: String? = null,
    val power: String? = null,
    val agility: String? = null,
    val Group: Boolean = false,
    val tradition: String? = null,
    val skin: String? = null,
    val hair: String? = null,
    val eyes: String? = null,
    val ear: String? = null,
    val noze: String? = null,
    val height: String? = null,
    val weight: String? = null,
    val particularity: String? = null
    /*val universId: Long = 0*/

) {
    override fun toString(): String {
        return name
    }

    @Dao
    interface DeitiesDao {
        @Query("SELECT * FROM deities ORDER BY name ASC")
        fun getAll(): List<DeitiesBean>

        @Insert
        fun insert(deities: DeitiesBean): Long

        @Update
        fun update(deities: DeitiesBean)

        @Delete
        fun delete(deities: DeitiesBean)
    }
}