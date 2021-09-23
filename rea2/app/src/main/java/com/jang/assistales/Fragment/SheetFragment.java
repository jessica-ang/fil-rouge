package com.jang.assistales.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
import com.jang.assistales.model.SheetBean;
import com.jang.assistales.model.UniversBean;

import java.util.ArrayList;


public class SheetFragment extends Fragment implements SheetAdapter.OnSheetAdapterListener {

    private FragmentSheetBinding binding;
    private RecyclerView recyclerView;
    private final ArrayList<SheetBean> projectBeans = new ArrayList<>();
    private final ArrayList<SheetBean> universBeans = new ArrayList<>();
    private final ArrayList<SheetBean> characterBeans = new ArrayList<>();
    private final ArrayList<SheetBean> deitiesBeans = new ArrayList<>();
    private final ArrayList<SheetBean> faunaBeans = new ArrayList<>();
    private final ArrayList<SheetBean> floraBeans = new ArrayList<>();
    private final ArrayList<SheetBean> itemBeans = new ArrayList<>();
    private final ArrayList<SheetBean> placeBeans = new ArrayList<>();
    private SheetAdapter adapter;


    public SheetFragment(int type) {
        if (type == 1) {
            adapter = new SheetAdapter(projectBeans);
        } else if (type == 2) {
            adapter = new SheetAdapter(universBeans);
        } else if (type == 3) {
            adapter = new SheetAdapter(characterBeans);
        } else if (type == 4) {
            adapter = new SheetAdapter(deitiesBeans);
        } else if (type == 5) {
            adapter = new SheetAdapter(placeBeans);
        } else if (type == 6) {
            adapter = new SheetAdapter(faunaBeans);
        } else if (type == 7) {
            adapter = new SheetAdapter(floraBeans);
        } else if (type == 8) {
            adapter = new SheetAdapter(itemBeans);
        }
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = FragmentSheetBinding.inflate(getLayoutInflater());

        FloraBean sheetBean1 = new FloraBean("Tulipe");
        FloraBean sheetBean2 = new FloraBean("Rose");
        FloraBean sheetBean3 = new FloraBean("MArguerite");
        ItemBean sheetBean4 = new ItemBean("Table");
        UniversBean sheetBean5 = new UniversBean("Andromède");
        CharacterBean sheetBean6 = new CharacterBean("Doe", "John");
        DeitiesBean sheetBean7 = new DeitiesBean("Indiens");
        FaunaBean sheetBean8 = new FaunaBean("chien");
        PlaceBean sheetBean9 = new PlaceBean("Paris");
        ProjectBean sheetBean10 = new ProjectBean("Livre1");

        floraBeans.add(sheetBean1);
        floraBeans.add(sheetBean2);
        floraBeans.add(sheetBean3);
        itemBeans.add(sheetBean4);
        universBeans.add(sheetBean5);
        characterBeans.add(sheetBean6);
        deitiesBeans.add(sheetBean7);
        faunaBeans.add(sheetBean8);
        placeBeans.add(sheetBean9);
        projectBeans.add(sheetBean10);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_sheet, container, false);
        recyclerView = view.findViewById(R.id.rv_array);
        recyclerView.setHasFixedSize(true);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 1));
        adapter.setRecepteur(this);
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onSheetClic(SheetBean sheetBean) {
        Intent intent = new Intent(getActivity(), FloraActivity.class);
        startActivity(intent);
    }
}