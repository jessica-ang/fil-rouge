package com.jang.assistales.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.jang.assistales.Common;
import com.jang.assistales.R;
import com.jang.assistales.model.CharacterBean;
import com.jang.assistales.model.DeitiesBean;
import com.jang.assistales.model.FaunaBean;
import com.jang.assistales.model.FloraBean;
import com.jang.assistales.model.ItemBean;
import com.jang.assistales.model.PlaceBean;
import com.jang.assistales.model.ProjectBean;
import com.jang.assistales.model.UniversBean;


public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

        Common.floraBeans.add(sheetBean1);
        Common.floraBeans.add(sheetBean2);
        Common.floraBeans.add(sheetBean3);
        Common.itemBeans.add(sheetBean4);
        Common.universBeans.add(sheetBean5);
        Common.characterBeans.add(sheetBean6);
        Common.deitiesBeans.add(sheetBean7);
        Common.faunaBeans.add(sheetBean8);
        Common.placeBeans.add(sheetBean9);
        Common.projectBeans.add(sheetBean10);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}