package com.jang.assistales.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.jang.assistales.CreationActivity
import com.jang.assistales.MainActivity
import com.jang.assistales.R

class HomeFragment : Fragment() {

    private lateinit var cv_project: CardView
    private lateinit var cv_univers: CardView
    private lateinit var cv_character: CardView
    private lateinit var cv_deities: CardView
    private lateinit var cv_place: CardView
    private lateinit var cv_fauna: CardView
    private lateinit var cv_flora: CardView
    private lateinit var cv_item: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view: View = inflater.inflate(R.layout.fragment_home, container, false)
        cv_project = view.findViewById(R.id.cv_project)
        cv_project.setOnClickListener { view ->
            val intent = Intent(activity, MainActivity::class.java)
            intent.putExtra("type", 1)
            startActivity(intent)
        }
        cv_univers = view.findViewById(R.id.cv_univers)
        cv_univers.setOnClickListener { view ->
            val intent = Intent(activity, MainActivity::class.java)
            intent.putExtra("type", 2)
            startActivity(intent)
        }
        cv_character = view.findViewById(R.id.cv_character)
        cv_character.setOnClickListener { view ->
            val intent = Intent(activity, MainActivity::class.java)
            intent.putExtra("type", 3)
            startActivity(intent)
        }
        cv_deities = view.findViewById(R.id.cv_deities)
        cv_deities.setOnClickListener { view ->
            val intent = Intent(activity, MainActivity::class.java)
            intent.putExtra("type", 4)
            startActivity(intent)
        }
        cv_place = view.findViewById(R.id.cv_place)
        cv_place.setOnClickListener { view ->
            val intent = Intent(activity, MainActivity::class.java)
            intent.putExtra("type", 5)
            startActivity(intent)
        }
        cv_fauna = view.findViewById(R.id.cv_fauna)
        cv_fauna.setOnClickListener { view ->
            val intent = Intent(activity, MainActivity::class.java)
            intent.putExtra("type", 6)
            startActivity(intent)
        }
        cv_flora = view.findViewById(R.id.cv_flora)
        cv_flora.setOnClickListener { view ->
            val intent = Intent(activity, MainActivity::class.java)
            intent.putExtra("type", 7)
            startActivity(intent)
        }
        cv_item = view.findViewById(R.id.cv_item)
        cv_item.setOnClickListener { view ->
            val intent = Intent(activity, MainActivity::class.java)
            intent.putExtra("type", 8)
            startActivity(intent)
        }
        return view
    }


}