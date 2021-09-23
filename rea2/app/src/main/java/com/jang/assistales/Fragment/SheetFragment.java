package com.jang.assistales.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jang.assistales.Common;
import com.jang.assistales.FloraActivity;
import com.jang.assistales.R;
import com.jang.assistales.SheetAdapter;
import com.jang.assistales.databinding.FragmentSheetBinding;
import com.jang.assistales.model.CharacterBean;
import com.jang.assistales.model.DeitiesBean;
import com.jang.assistales.model.FaunaBean;
import com.jang.assistales.model.FloraBean;
import com.jang.assistales.model.ItemBean;
import com.jang.assistales.model.PlaceBean;
import com.jang.assistales.model.ProjectBean;
import com.jang.assistales.model.UniversBean;

import java.io.Serializable;


public class SheetFragment extends Fragment implements SheetAdapter.OnSheetAdapterListener {

    private FragmentSheetBinding binding;
    private RecyclerView recyclerView;
    private SheetAdapter adapter;
    private int mType;


    public SheetFragment(int pType) {
        mType = pType;
        if (pType == 1) {
            adapter = new SheetAdapter(Common.TYPE_PROJECT);
        } else if (pType == 2) {
            adapter = new SheetAdapter(Common.TYPE_UNIVERS);
        } else if (pType == 3) {
            adapter = new SheetAdapter(Common.TYPE_CHARACTER);
        } else if (pType == 4) {
            adapter = new SheetAdapter(Common.TYPE_DEITIES);
        } else if (pType == 5) {
            adapter = new SheetAdapter(Common.TYPE_PLACE);
        } else if (pType == 6) {
            adapter = new SheetAdapter(Common.TYPE_FAUNA);
        } else if (pType == 7) {
            adapter = new SheetAdapter(Common.TYPE_FLORA);
        } else if (pType == 8) {
            adapter = new SheetAdapter(Common.TYPE_ITEM);
        }

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = FragmentSheetBinding.inflate(getLayoutInflater());


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sheet, container, false);
        recyclerView = view.findViewById(R.id.rv_array);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 1));
        adapter.setRecepteur(this);
        return view;
    }

    @Override
    public void onProjectClic(ProjectBean projectdata) {
        Intent intent = new Intent(getActivity(), FloraActivity.class);
        //intent.putExtra("project", projectdata);
        startActivity(intent);
    }

    @Override
    public void onUniversClic(UniversBean universdata) {
        Intent intent = new Intent(getActivity(), FloraActivity.class);
        //intent.putExtra("univers", universdata);
        startActivity(intent);
    }

    @Override
    public void onCharacterClic(CharacterBean characterdata) {
        Intent intent = new Intent(getActivity(), FloraActivity.class);
        //intent.putExtra("character", characterdata);
        startActivity(intent);
    }

    @Override
    public void onDeitiesClic(DeitiesBean deitiesdata) {
        Intent intent = new Intent(getActivity(), FloraActivity.class);
        //intent.putExtra("deities", deitiesdata);
        startActivity(intent);
    }

    @Override
    public void onPlaceClic(PlaceBean placedata) {
        Intent intent = new Intent(getActivity(), FloraActivity.class);
        //intent.putExtra("place", placedata);
        startActivity(intent);
    }

    @Override
    public void onFaunaClic(FaunaBean faunadata) {
        Intent intent = new Intent(getActivity(), FloraActivity.class);
        //intent.putExtra("fauna", faunadata);
        startActivity(intent);
    }

    @Override
    public void onFloraClic(FloraBean floradata) {
        Intent intent = new Intent(getActivity(), FloraActivity.class);
        intent.putExtra("flora", floradata);
        Log.w("TAG", "onFloraClic: " + floradata.toString());
        startActivity(intent);
    }

    @Override
    public void onItemClic(ItemBean itemdata) {
        Intent intent = new Intent(getActivity(), FloraActivity.class);
        //intent.putExtra("item", itemdata);
        startActivity(intent);
    }

}
