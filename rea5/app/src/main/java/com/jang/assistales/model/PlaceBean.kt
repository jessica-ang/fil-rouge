package com.jang.assistales.model

import androidx.room.*

@Entity(
    tableName = "place",
    foreignKeys = [ForeignKey(
        entity = UniversBean::class,
        parentColumns = ["id_univers"],
        childColumns = ["universId"]
    )]
)
class PlaceBean(
    val name: String,
    @PrimaryKey(autoGenerate = true)
    var id_place: Long = 0,
    val description: String? = null,
    val gender: String? = null,
    val deserted: Boolean = false,
    val landscape: String? = null,
    val smell: String? = null,
    val sound: String? = null,
    val culture: String? = null,
    val location: String? = null,
    val climate: String? = null,
    val landmark: String? = null,
    val universId: Long? = 0

) {
    override fun toString(): String {
        return name
    }


    @Dao
    interface PlaceDao {
        @Query("SELECT * FROM place ORDER BY name ASC")
        fun getAll(): List<PlaceBean>

        @Insert
        fun insert(place: PlaceBean): Long

        @Update
        fun update(place: PlaceBean)

        @Delete
        fun delete(place: PlaceBean)
    }

}