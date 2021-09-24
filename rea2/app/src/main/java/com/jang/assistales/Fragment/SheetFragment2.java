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
import com.jang.assistales.SheetAdapter2;
import com.jang.assistales.databinding.FragmentSheetBinding;
import com.jang.assistales.model.CharacterBean;
import com.jang.assistales.model.DeitiesBean;
import com.jang.assistales.model.FaunaBean;
import com.jang.assistales.model.FloraBean;
import com.jang.assistales.model.ItemBean;
import com.jang.assistales.model.PlaceBean;
import com.jang.assistales.model.ProjectBean;
import com.jang.assistales.model.UniversBean;


public class SheetFragment2 extends Fragment implements SheetAdapter2.OnSheetAdapterListener {

    private RecyclerView recyclerView;
    private SheetAdapter2 adapter;

    public SheetFragment2(int pType) {

        if (pType == 1) {
            adapter = new SheetAdapter2(Common.projectBeans, this);
        } else if (pType == 2) {
            adapter = new SheetAdapter2(Common.universBeans, this);
        } else if (pType == 3) {
            adapter = new SheetAdapter2(Common.characterBeans, this);
        } else if (pType == 4) {
            adapter = new SheetAdapter2(Common.deitiesBeans, this);
        } else if (pType == 5) {
            adapter = new SheetAdapter2(Common.placeBeans, this);
        } else if (pType == 6) {
            adapter = new SheetAdapter2(Common.faunaBeans, this);
        } else if (pType == 7) {
            adapter = new SheetAdapter2(Common.floraBeans, this);
        } else if (pType == 8) {
            adapter = new SheetAdapter2(Common.itemBeans, this);
        }

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sheet, container, false);
        recyclerView = view.findViewById(R.id.rv_array);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 1));
        return view;
    }


    @Override
    public void onSheetAdapterClic(Object object) {
        if (object instanceof FloraBean) {
            FloraBean floraBean = (FloraBean) object;
            Intent intent = new Intent(getActivity(), FloraActivity.class);
            intent.putExtra("flora", floraBean);
            startActivity(intent);
        } else if (object instanceof CharacterBean) {
            CharacterBean characterBean = (CharacterBean) object;
        } else if (object instanceof PlaceBean) {
            PlaceBean placeBean = (PlaceBean) object;
        } else if (object instanceof ProjectBean) {
            ProjectBean projectBean = (ProjectBean) object;
        } else if (object instanceof UniversBean) {
            UniversBean universBean = (UniversBean) object;
        } else if (object instanceof DeitiesBean) {
            DeitiesBean deitiesBean = (DeitiesBean) object;
        } else if (object instanceof FaunaBean) {
            FaunaBean faunaBean = (FaunaBean) object;
        } else if (object instanceof ItemBean) {
            ItemBean itemBean = (ItemBean) object;
        }
    }
}
