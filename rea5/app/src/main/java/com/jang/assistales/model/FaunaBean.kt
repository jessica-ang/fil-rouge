package com.jang.assistales.model

import androidx.room.*

@Entity(
    tableName = "faune",
    foreignKeys = [ForeignKey(
        entity = UniversBean::class,
        parentColumns = ["id_univers"],
        childColumns = ["universId"]
    )]
)
class FaunaBean(
    val name: String,
    @PrimaryKey(autoGenerate = true)
    val id_fauna: Long = 0,
    val description: String? = null,
    val race: String? = null,
    val aggressive: String? = null,
    val attack: String? = null,
    val defence: String? = null,
    val intelligence: String? = null,
    val ability: String? = null,
    val agility: String? = null,
    val group: Boolean = false,
    val power: String? = null,
    val weakness: String? = null,
    val rarity: Boolean = false,
    val ear: String? = null,
    val muzzle: String? = null,
    val tail: String? = null,
    val fur: String? = null,
    val color: String? = null,
    val particularity: String? = null,
    val universId: Long = 0

) {
    override fun toString(): String {
        return name
    }


    @Dao
    interface FaunaDao {
        @Query("SELECT * FROM faune ORDER BY name ASC")
        fun getAll(): List<FaunaBean>

        @Insert
        fun insert(fauna: FaunaBean): Long

        @Update
        fun update(fauna: FaunaBean)

        @Delete
        fun delete(fauna: FaunaBean)
    }

}