package com.jang.assistales

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.jang.assistales.database.applicationInstance
import com.jang.assistales.databinding.ActivityCreationBinding
import com.jang.assistales.model.*
import kotlin.concurrent.thread

class CreationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCreationBinding
    var mType: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mType = intent.getIntExtra("type", 0)

        if (mType == 1) {
            binding.tvCreaTitle.setText("Projet")
            binding!!.tvHead.setBackgroundResource(R.mipmap.ic_banner_project_foreground)
        } else if (mType == 2) {
            binding.tvCreaTitle.setText("Univers")
            binding!!.tvHead.setBackgroundResource(R.mipmap.ic_banner_univers_foreground)
        } else if (mType == 3) {
            binding.llFirstname.visibility = View.VISIBLE
            binding.tvCreaTitle.setText("Personnage")
            binding!!.tvHead.setBackgroundResource(R.mipmap.ic_banner_character_foreground)
        } else if (mType == 4) {
            binding.tvCreaTitle.setText("Ethnie")
            binding!!.tvHead.setBackgroundResource(R.mipmap.ic_banner_deities_foreground)
        } else if (mType == 5) {
            binding.tvCreaTitle.setText("Lieu")
            binding!!.tvHead.setBackgroundResource(R.mipmap.ic_banner_place_foreground)
        } else if (mType == 6) {
            binding.tvCreaTitle.setText("Faune / Créature")
            binding!!.tvHead.setBackgroundResource(R.mipmap.ic_banner_fauna_foreground)
        } else if (mType == 7) {
            binding.tvCreaTitle.setText("Flore")
            binding!!.tvHead.setBackgroundResource(R.mipmap.ic_banner_flora_foreground)
        } else if (mType == 8) {
            binding.tvCreaTitle.setText("Objet")
            binding!!.tvHead.setBackgroundResource(R.mipmap.ic_banner_item_foreground)
        }

    }

    fun onBtAddClick(view: android.view.View) {
        thread {
            if (mType == 1) {
                applicationInstance.database.projectDao()
                    .insert(ProjectBean(binding.etNameCreation.text.toString()))
            } else if (mType == 2) {
                applicationInstance.database.universDao()
                    .insert(UniversBean(binding.etNameCreation.text.toString()))
            } else if (mType == 3) {
                applicationInstance.database.characterDao()
                    .insert(
                        CharacterBean(
                            binding.etNameCreation.text.toString(),
                            binding.etFirstnameCreation.text.toString()
                        )
                    )
            } else if (mType == 4) {
                applicationInstance.database.deitiesDao()
                    .insert(DeitiesBean(binding.etNameCreation.text.toString()))
            } else if (mType == 5) {
                applicationInstance.database.placeDao()
                    .insert(PlaceBean(binding.etNameCreation.text.toString()))
            } else if (mType == 6) {
                applicationInstance.database.faunaDao()
                    .insert(FaunaBean(binding.etNameCreation.text.toString()))
            } else if (mType == 7) {
                applicationInstance.database.floraDao()
                    .insert(FloraBean(binding.etNameCreation.text.toString()))
            } else if (mType == 8) {
                applicationInstance.database.itemDao()
                    .insert(ItemBean(binding.etNameCreation.text.toString()))
            }
        }
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("type", mType)
        startActivity(intent)

    }

    fun onBtCancelClick(view: android.view.View) {
        finish()
    }
}