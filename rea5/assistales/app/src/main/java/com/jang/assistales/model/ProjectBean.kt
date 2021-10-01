package com.jang.assistales.model

import androidx.room.*

@Entity(
    tableName = "project"
)
class ProjectBean (
    val name: String,
    @PrimaryKey(autoGenerate = true)
    val id_project: Long = 0,
    val description: String? = null,
    val storyline: String? = null

) {
    override fun toString(): String {
        return name
    }


    @Dao
    interface ProjectDao {
        @Query("SELECT * FROM project ORDER BY name ASC")
        fun getAll(): List<ProjectBean>

        @Insert
        fun insert(project: ProjectBean): Long

        @Update
        fun update(project: ProjectBean)

        @Delete
        fun delete(project: ProjectBean)
    }
}