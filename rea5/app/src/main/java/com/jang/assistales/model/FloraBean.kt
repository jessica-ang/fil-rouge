package com.jang.assistales.model

import androidx.room.*


@Entity(
    tableName = "flora",
    foreignKeys = [ForeignKey(
        entity = UniversBean::class,
        parentColumns = ["id_univers"],
        childColumns = ["universId"]
    )]
)
class FloraBean(
    val name: String,
    @PrimaryKey(autoGenerate = true)
    val id_flora: Long = 0,
    val story: String? = null,
    val looks: String? = null,
    val Rarity: Boolean = false,
    val benefit: String? = null,
    val danger: String? = null,
    val specific: String? = null,
    val universId: Long = 0,

    ) {
    override fun toString(): String {
        return name
    }


    @Dao
    interface FloraDao {
        @Query("SELECT * FROM flora ORDER BY name ASC")
        fun getAll(): List<FloraBean>

        @Insert
        fun insert(flora: FloraBean): Long

        @Update
        fun update(flora: FloraBean)

        @Delete
        fun delete(flora: FloraBean)
    }


}