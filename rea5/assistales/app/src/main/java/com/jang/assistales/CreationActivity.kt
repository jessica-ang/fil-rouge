package com.jang.assistales

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
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

        //show header + title
        if (mType == 1) {
            showHeader("Projets", R.mipmap.ic_banner_project_foreground)
        } else if (mType == 2) {
            showHeader("Univers", R.mipmap.ic_banner_univers_foreground)
        } else if (mType == 3) {
            showHeader("Personnages", R.mipmap.ic_banner_character_foreground)
            binding.llFirstname.visibility = View.VISIBLE
        } else if (mType == 4) {
            showHeader("Ethnies", R.mipmap.ic_banner_deities_foreground)
        } else if (mType == 5) {
            showHeader("Lieux", R.mipmap.ic_banner_place_foreground)
        } else if (mType == 6) {
            showHeader("Faunes / Créatures", R.mipmap.ic_banner_fauna_foreground)
        } else if (mType == 7) {
            showHeader("Flore", R.mipmap.ic_banner_flora_foreground)
        } else if (mType == 8) {
            showHeader("Objets", R.mipmap.ic_banner_item_foreground)
        }

    }

    fun onBtAddClick(view: android.view.View) {
        var listName: List<String>
        //check name not null or Empty
        if (binding.etNameCreation.text.toString().isNullOrEmpty()) {
            binding.tvError.visibility = View.VISIBLE
            binding.tvError.setText("nom obligatoire")
        } else {
            thread {
                // check type bean
                if (mType == 1) {
                    listName = applicationInstance.database.projectDao().getName()
                    var exist: Boolean = false;
                    exist = checkData(listName)
                    if (!exist) {
                        applicationInstance.database.projectDao()
                            .insert(ProjectBean(binding.etNameCreation.text.toString()))
                        runActivity()
                    }
                } else if (mType == 2) {
                    listName = applicationInstance.database.universDao().getName()
                    var exist: Boolean = false;
                    exist = checkData(listName)
                    if (!exist) {
                        applicationInstance.database.universDao()
                            .insert(UniversBean(binding.etNameCreation.text.toString()))
                        runActivity()
                    }
                } else if (mType == 3) {
                    listName = applicationInstance.database.characterDao().getName()
                    var listFirstName: List<String> =
                        applicationInstance.database.characterDao().getFirstname()
                    var exist: Boolean = false;
                    exist = checkDataFirstName(listFirstName)
                    if (exist) {
                        exist = checkData(listName)
                    }
                    if (!exist) {
                        applicationInstance.database.characterDao()
                            .insert(
                                CharacterBean(
                                    binding.etNameCreation.text.toString(),
                                    binding.etFirstnameCreation.text.toString()
                                )
                            )
                        runActivity()
                    }
                } else if (mType == 4) {
                    listName = applicationInstance.database.deitiesDao().getName()
                    var exist: Boolean = false;
                    exist = checkData(listName)
                    if (!exist) {
                        applicationInstance.database.deitiesDao()
                            .insert(DeitiesBean(binding.etNameCreation.text.toString()))
                        runActivity()
                    }
                } else if (mType == 5) {
                    listName = applicationInstance.database.placeDao().getName()
                    var exist: Boolean = false;
                    exist = checkData(listName)
                    if (!exist) {
                        applicationInstance.database.placeDao()
                            .insert(PlaceBean(binding.etNameCreation.text.toString()))
                        runActivity()
                    }
                } else if (mType == 6) {
                    listName = applicationInstance.database.faunaDao().getName()
                    var exist: Boolean = false;
                    exist = checkData(listName)
                    if (!exist) {
                        applicationInstance.database.faunaDao()
                            .insert(FaunaBean(binding.etNameCreation.text.toString()))
                        runActivity()
                    }
                } else if (mType == 7) {
                    listName = applicationInstance.database.floraDao().getName()
                    var exist: Boolean = false;
                    exist = checkData(listName)
                    if (!exist) {
                        applicationInstance.database.floraDao()
                            .insert(FloraBean(binding.etNameCreation.text.toString()))
                        runActivity()
                    }
                } else if (mType == 8) {
                    listName = applicationInstance.database.itemDao().getName()
                    var exist: Boolean = false;
                    exist = checkData(listName)
                    if (!exist) {
                        applicationInstance.database.itemDao()
                            .insert(ItemBean(binding.etNameCreation.text.toString()))
                        runActivity()
                    }
                }
            }
        }

    }

    fun onBtCancelClick(view: android.view.View) {
        finish()
    }

    fun showHeader(pTitre: String, pImg: Int) {
        binding.tvCreaTitle.setText(pTitre)
        binding!!.tvHead.setBackgroundResource(pImg)
    }

    fun checkData(listName: List<String>): Boolean {
        for (i in listName) {
            if (binding.etNameCreation.text.toString().equals(i)) {
                this.runOnUiThread {
                    binding.tvError.visibility = View.VISIBLE
                    binding.tvError.setText("Nom existant")
                }
                return true

            }
        }
        return false
    }

    fun checkDataFirstName(listName: List<String>): Boolean {
        for (i in listName) {
            if (binding.etFirstnameCreation.text.toString().equals(i)) {
                return true
            }
        }
        return false
    }

    fun runActivity() {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("type", mType)
        startActivity(intent)
    }
}