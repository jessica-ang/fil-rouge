package com.jang.assistales.model

import androidx.room.*

@Entity(
    tableName = "item",
/*    foreignKeys = [ForeignKey(
        entity = UniversBean::class,
        parentColumns = ["id_univers"],
        childColumns = ["universId"]
    )]*/
)
class ItemBean(
    val name: String,
    @PrimaryKey(autoGenerate = true)
    val id_item: Long = 0,
    val description: String? = null,
    val gender: String? = null,
    val weight: String? = null,
    val size: String? = null,
    val other: String? = null,
    val creationDate: String? = null,
    val origin: String? = null,
    val past: String? = null,
    val present: String? = null,
    val utility: String? = null,
    val capacity: String? = null,
/*    val universId: Long = 0*/

) {
    override fun toString(): String {
        return name
    }


    @Dao
    interface ItemDao {
        @Query("SELECT * FROM item ORDER BY name ASC")
        fun getAll(): List<ItemBean>

        @Insert
        fun insert(item: ItemBean): Long

        @Update
        fun update(item: ItemBean)

        @Delete
        fun delete(item: ItemBean)

        @Query("SELECT name FROM item ORDER BY name ASC")
        fun getName(): List<String>
    }
}