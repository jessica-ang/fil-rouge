package com.jang.assistales

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.tabs.TabLayout
import com.jang.assistales.databinding.ActivityShowBinding

class ShowActivity : AppCompatActivity() {
    private lateinit var binding: ActivityShowBinding
    var fragment: Fragment? = null
    var fragmentManager: FragmentManager? = null
    var fragmentTransaction: FragmentTransaction? = null
    var mType: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mType = intent.getIntExtra("type", 0)
        fragmentManager = supportFragmentManager
        fragmentTransaction = fragmentManager!!.beginTransaction()
        fragmentTransaction!!.replace(R.id.fl_show, fragment!!)
        fragmentTransaction!!.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        fragmentTransaction!!.commit()

        //main menu
        binding.tlMain.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                when (tab.position) {
                    0 -> {
                        runMainActivity(0)
                    }
                    1 -> {
                        runMainActivity(1)
                    }
                    2 -> {
                        runMainActivity(2)
                    }
                    3 -> {
                        runMainActivity(3)
                    }
                    4 -> {
                        runMainActivity(4)
                    }
                    5 -> {
                        runMainActivity(5)
                    }
                    6 -> {
                        runMainActivity(6)
                    }
                    7 -> {
                        runMainActivity(7)
                    }
                    8 -> {
                        runMainActivity(8)
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }


    fun onBtDeleteClick(view: android.view.View) {}
    fun onBtUpdateClick(view: android.view.View) {}

    fun runMainActivity(pType: Int) {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("type", pType)
        startActivity(intent)
    }
}