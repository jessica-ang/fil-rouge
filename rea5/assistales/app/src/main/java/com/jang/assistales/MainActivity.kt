package com.jang.assistales

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout
import com.jang.assistales.databinding.ActivityMainBinding
import com.jang.assistales.fragment.HomeFragment
import com.jang.assistales.fragment.SheetFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var fragment: Fragment? = null
    var fragmentManager: FragmentManager? = null
    var fragmentTransaction: FragmentTransaction? = null
    var mType: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mType = intent.getIntExtra("type", 0)
        fragmentManager = supportFragmentManager
        fragmentTransaction = fragmentManager!!.beginTransaction()

        // show fragment
        if (mType == 0) {
            showFragmentHome()
        } else if (mType == 1) {
            showFragment(mType, R.mipmap.ic_banner_project_foreground)
        } else if (mType == 2) {
            showFragment(mType, R.mipmap.ic_banner_univers_foreground)
        } else if (mType == 3) {
            showFragment(mType, R.mipmap.ic_banner_character_foreground)
        } else if (mType == 4) {
            showFragment(mType, R.mipmap.ic_banner_deities_foreground)
        } else if (mType == 5) {
            showFragment(mType, R.mipmap.ic_banner_place_foreground)
        } else if (mType == 6) {
            showFragment(mType, R.mipmap.ic_banner_fauna_foreground)
        } else if (mType == 7) {
            showFragment(mType, R.mipmap.ic_banner_flora_foreground)
        } else if (mType == 8) {
            showFragment(mType, R.mipmap.ic_banner_item_foreground)
        }

        fragmentTransaction!!.replace(R.id.fl_main, fragment!!)
        fragmentTransaction!!.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        fragmentTransaction!!.commit()
        //show fragment - touch menu
        binding.tlMain.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                when (tab.position) {
                    0 -> {
                        showFragmentHome()
                    }
                    1 -> {
                        showFragment(1, R.mipmap.ic_banner_project_foreground)
                    }
                    2 -> {
                        showFragment(2, R.mipmap.ic_banner_univers_foreground)
                    }
                    3 -> {
                        showFragment(3, R.mipmap.ic_banner_character_foreground)
                    }
                    4 -> {
                        showFragment(4, R.mipmap.ic_banner_deities_foreground)
                    }
                    5 -> {
                        showFragment(5, R.mipmap.ic_banner_place_foreground)
                    }
                    6 -> {
                        showFragment(6, R.mipmap.ic_banner_fauna_foreground)
                    }
                    7 -> {
                        showFragment(7, R.mipmap.ic_banner_flora_foreground)
                    }
                    8 -> {
                        showFragment(8, R.mipmap.ic_banner_item_foreground)
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

    fun showFragment(pType: Int, pImg: Int) {
        fragment = SheetFragment(pType)
        binding.tlMain.selectTab(binding.tlMain.getTabAt(pType))
        binding!!.tvHead.setBackgroundResource(pImg)
    }

    fun showFragmentHome() {
        fragment = HomeFragment()
        binding!!.tvHead.setBackgroundResource(R.mipmap.ic_banner_home_foreground)
    }

}

