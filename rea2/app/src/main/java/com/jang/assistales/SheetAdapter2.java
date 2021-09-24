package com.jang.assistales;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jang.assistales.Fragment.SheetFragment2;
import com.jang.assistales.databinding.RowSheetBinding;

import java.util.ArrayList;

public class SheetAdapter2 extends RecyclerView.Adapter<SheetAdapter2.ViewHolder> {


    private ArrayList<?> data;
    private OnSheetAdapterListener recepteur;


    public SheetAdapter2(ArrayList<?> data, OnSheetAdapterListener recepteur) {

        this.data = data;
        this.recepteur = recepteur;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        return new ViewHolder(RowSheetBinding.inflate(layoutInflater));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Object datum = data.get(position);
        holder.binding.tvNameSheet.setText(datum.toString());
        holder.binding.rootSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (recepteur != null) {
                    recepteur.onSheetAdapterClic(datum);
                }
            }
        });
    }


    @Override
    public int getItemCount() {

        return data.size();
    }

    public void setRecepteur(SheetFragment2 sheetFragment2) {
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

        void onSheetAdapterClic(Object object);


    }


}
