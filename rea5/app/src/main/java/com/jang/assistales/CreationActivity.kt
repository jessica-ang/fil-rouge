package com.jang.assistales

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CreationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creation)

/*        thread {
            applicationInstance.database.projectDao()
                .insert(Project.ProjectBean("Toto"))
        }*/
    }
}