package com.jang.assistales.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.jang.assistales.R;
import com.jang.assistales.model.FloraBean;


public class AbilityFloraShowFragment extends Fragment {

    private TextView tv_benefic;
    private TextView tv_danger;
    private TextView tv_specific;


    public AbilityFloraShowFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ability_flora_show, container, false);
        tv_benefic = view.findViewById((R.id.tv_benefic));
        tv_danger = view.findViewById(R.id.tv_danger);
        tv_specific = view.findViewById(R.id.tv_specific);
        showFloraBean((FloraBean) getActivity().getIntent().getSerializableExtra("flora"));
        return view;
    }

    public void showFloraBean(FloraBean floraBean) {
        tv_benefic.setText(floraBean.getBenefit());
        tv_danger.setText(floraBean.getDanger());
        tv_specific.setText(floraBean.getSpecific());
    }
}