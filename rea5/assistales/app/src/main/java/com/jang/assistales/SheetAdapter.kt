package com.jang.assistales

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jang.assistales.databinding.RowSheetBinding

class SheetAdapter(val data: List<*>?, val recepteur: OnSheetAdapterListener?) :
    RecyclerView.Adapter<SheetAdapter.ViewHolder>() {

    class ViewHolder(val bind: RowSheetBinding) : RecyclerView.ViewHolder(bind.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(RowSheetBinding.inflate(LayoutInflater.from(parent.context)))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var datum: Object = data!!.get(position) as Object
        holder.bind.tvNameSheet.setText(datum.toString())
        holder.bind.rootSheet.setOnClickListener(View.OnClickListener() {
            fun onClick(view: View?) {
                if (recepteur != null) {
                    recepteur!!.onSheetAdapterClic(datum)
                }
            }
        })

    }

    override fun getItemCount(): Int {
        return data!!.size
    }


    //----------------------------Interface (emetteur)-------------------//
    interface OnSheetAdapterListener {
        fun onSheetAdapterClic(`object`: Any?)
    }
}
