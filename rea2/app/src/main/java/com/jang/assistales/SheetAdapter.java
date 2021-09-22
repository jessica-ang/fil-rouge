package com.jang.assistales;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jang.assistales.databinding.RowSheetBinding;
import com.jang.assistales.model.SheetBean;

import java.util.ArrayList;

public class SheetAdapter extends RecyclerView.Adapter<SheetAdapter.ViewHolder> {

    private ArrayList<SheetBean> mdata;


    public SheetAdapter(ArrayList<SheetBean> pdata) {
        this.mdata = pdata;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new ViewHolder(RowSheetBinding.inflate(layoutInflater));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        SheetBean datum = mdata.get(position);

        holder.binding.tvNameSheet.setText(datum.getTitle());
        holder.binding.rootSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (recepteur != null) {
                    recepteur.onSheetClic(datum);
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        RowSheetBinding binding;

        public ViewHolder(RowSheetBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }


    //----------------------------Interface (emetteur)-------------------//

    public interface OnSheetAdapterListener {
        void onSheetClic(SheetBean sheetBean);
    }

    //stock reference
    private OnSheetAdapterListener recepteur;

    public void setRecepteur(OnSheetAdapterListener recepteur) {
        this.recepteur = recepteur;

    }


}
