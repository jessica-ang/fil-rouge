package com.jang.assistales

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.tabs.TabLayout
import com.jang.assistales.database.applicationInstance
import com.jang.assistales.databinding.ActivityMainBinding
import com.jang.assistales.fragment.HomeFragment
import com.jang.assistales.fragment.SheetFragment
import com.jang.assistales.model.ProjectBean
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding? = null
    var fragment: Fragment? = null
    var fragmentManager: FragmentManager? = null
    var fragmentTransaction: FragmentTransaction? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)


        // affichage fragment
        fragment = HomeFragment()
        fragmentManager = supportFragmentManager
        fragmentTransaction = fragmentManager!!.beginTransaction()
        fragmentTransaction!!.replace(R.id.fl_main, fragment!!)
        fragmentTransaction!!.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        fragmentTransaction!!.commit()
        binding!!.tlMain.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                when (tab.position) {
                    0 -> {
                        fragment = HomeFragment()
                        binding!!.tvHead.setBackgroundResource(R.mipmap.ic_banner_home_foreground)
                    }
                    1 -> {
                        fragment = SheetFragment(1)
                        //binding!!.fabAdd.setOnClickListener { v: View? ->

                        /*thread {
                            applicationInstance.database.projectDao()
                                .insert(ProjectBean("Toto"))
                        }*/
                        //}
                    }
                    2 -> {
                        fragment = SheetFragment(2)
                    }
                    3 -> {
                        fragment = SheetFragment(3)
                    }
                    4 -> {
                        fragment = SheetFragment(4)
                    }
                    5 -> {
                        fragment = SheetFragment(5)
                    }
                    6 -> {
                        fragment = SheetFragment(6)
                    }
                    7 -> {
                        fragment = SheetFragment(7)
                        binding!!.tvHead.setBackgroundResource(R.mipmap.ic_banner_flora_foreground)
                    }
                    8 -> {
                        fragment = SheetFragment(8)
                    }
                }
                val fm = supportFragmentManager
                val ft = fm.beginTransaction()
                ft.replace(R.id.fl_main, fragment!!)
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                ft.commit()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }

/*    fun onCreationClic() {
        startActivity(Intent(this, CreationActivity::class.java))
    }*/


}

