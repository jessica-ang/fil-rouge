package com.jang.assistales.fragment

import android.R.attr
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.jang.assistales.R
import com.jang.assistales.SheetAdapter
import com.jang.assistales.database.applicationInstance
import com.jang.assistales.model.*
import kotlin.concurrent.thread
import android.R.attr.button
import android.widget.Toast
import com.jang.assistales.CreationActivity


class SheetFragment : Fragment, SheetAdapter.OnSheetAdapterListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var tvTitle: TextView
    private lateinit var fabAdd: FloatingActionButton
    private var data = ArrayList<Any>()
    private var adapter = SheetAdapter(data, this)
    private var title: String? = null
    private var mType: Int = 0

    constructor(pType: Int) : super() {
        mType = pType
        thread {
            if (pType == 1) {
                data.addAll(applicationInstance.database.projectDao().getAll())
                title = "Projet"
            } else if (pType == 2) {
                data.addAll(applicationInstance.database.universDao().getAll())
                title = "Univers"
            } else if (pType == 3) {
                data.addAll(applicationInstance.database.characterDao().getAll())
                title = "Personnage"
            } else if (pType == 4) {
                data.addAll(applicationInstance.database.deitiesDao().getAll())
                title = "Ethnie"
            } else if (pType == 5) {
                data.addAll(applicationInstance.database.placeDao().getAll())
                title = "Lieu"
            } else if (pType == 6) {
                data.addAll(applicationInstance.database.faunaDao().getAll())
                title = "Faune / Créature"
            } else if (pType == 7) {
                data.addAll(applicationInstance.database.floraDao().getAll())
                title = "Flore"
            } else if (pType == 8) {
                data.addAll(applicationInstance.database.itemDao().getAll())
                title = "Objet"
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.fragment_sheet, container, false)
        tvTitle = view.findViewById(R.id.tv_title)
        tvTitle.setText(title)
        fabAdd = view.findViewById(R.id.fab_add)
        fabAdd.setOnClickListener { view ->
            val intent = Intent(activity, CreationActivity::class.java)
            intent.putExtra("type", mType)
            startActivity(intent)
        }
        recyclerView = view.findViewById(R.id.rv_array)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(view.context, 1)

        return view
    }

    override fun onSheetAdapterClic(`object`: Any?) {
        if (`object` is FloraBean) {
            val floraBean: FloraBean? = `object` as FloraBean?
            /*val intent = Intent(activity, FloraActivity::class.java)
            intent.putExtra("flora", floraBean)
            startActivity(intent)*/
        } else if (`object` is CharacterBean) {
            val characterBean: CharacterBean? = `object` as CharacterBean?
        } else if (`object` is PlaceBean) {
            val placeBean: PlaceBean? = `object` as PlaceBean?
        } else if (`object` is ProjectBean) {
            val projectBean: ProjectBean? = `object` as ProjectBean?
        } else if (`object` is UniversBean) {
            val universBean: UniversBean? = `object` as UniversBean?
        } else if (`object` is DeitiesBean) {
            val deitiesBean: DeitiesBean? = `object` as DeitiesBean?
        } else if (`object` is FaunaBean) {
            val faunaBean: FaunaBean? = `object` as FaunaBean?
        } else if (`object` is ItemBean) {
            val itemBean: ItemBean? = `object` as ItemBean?
        }
    }

    /*    fun onCreationClic() {
        startActivity(Intent(this, CreationActivity::class.java))
    }*/


}