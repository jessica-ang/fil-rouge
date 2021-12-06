package com.jang.assistales

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.tabs.TabLayout
import com.jang.assistales.databinding.ActivityMainBinding
import com.jang.assistales.fragment.HomeFragment
import com.jang.assistales.fragment.SheetFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var fragment: Fragment? = null
    var fragmentManager: FragmentManager? = null
    var fragmentTransaction: FragmentTransaction? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // affichage fragment
        fragment = HomeFragment()
        fragmentManager = supportFragmentManager
        fragmentTransaction = fragmentManager!!.beginTransaction()
        fragmentTransaction!!.replace(R.id.fl_main, fragment!!)
        fragmentTransaction!!.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        fragmentTransaction!!.commit()
        binding.tlMain.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                when (tab.position) {
                    0 -> {
                        fragment = HomeFragment()
                        binding!!.tvHead.setBackgroundResource(R.mipmap.ic_banner_home_foreground)
                    }
                    1 -> {
                        fragment = SheetFragment(1)
                        binding!!.tvHead.setBackgroundResource(R.mipmap.ic_banner_project_foreground)
                    }
                    2 -> {
                        fragment = SheetFragment(2)
                        binding!!.tvHead.setBackgroundResource(R.mipmap.ic_banner_univers_foreground)
                    }
                    3 -> {
                        fragment = SheetFragment(3)
                        binding!!.tvHead.setBackgroundResource(R.mipmap.ic_banner_character_foreground)
                    }
                    4 -> {
                        fragment = SheetFragment(4)
                        binding!!.tvHead.setBackgroundResource(R.mipmap.ic_banner_deities_foreground)
                    }
                    5 -> {
                        fragment = SheetFragment(5)
                        binding!!.tvHead.setBackgroundResource(R.mipmap.ic_banner_place_foreground)
                    }
                    6 -> {
                        fragment = SheetFragment(6)
                        binding!!.tvHead.setBackgroundResource(R.mipmap.ic_banner_fauna_foreground)
                    }
                    7 -> {
                        fragment = SheetFragment(7)
                        binding!!.tvHead.setBackgroundResource(R.mipmap.ic_banner_flora_foreground)
                    }
                    8 -> {
                        fragment = SheetFragment(8)
                        binding!!.tvHead.setBackgroundResource(R.mipmap.ic_banner_item_foreground)
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

}

