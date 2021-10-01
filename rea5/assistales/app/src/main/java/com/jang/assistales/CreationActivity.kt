package com.jang.assistales

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jang.assistales.databinding.ActivityCreationBinding

class CreationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCreationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var mType: Int = intent.getIntExtra("type", 0)
        if (mType == 1) {
            binding.tvCreaTitle.setText("Projet")
        }


/*        thread {
            applicationInstance.database.projectDao()
                .insert(Project.ProjectBean("Toto"))
        }*/
    }
}