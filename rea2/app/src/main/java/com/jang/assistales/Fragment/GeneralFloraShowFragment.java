package com.jang.assistales.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.jang.assistales.R;
import com.jang.assistales.databinding.FragmentGeneralFloraShowBinding;
import com.jang.assistales.model.FloraBean;


public class GeneralFloraShowFragment extends Fragment {

    private TextView tv_name;
    private TextView tv_story;
    private TextView tv_looks;
    private TextView tv_rarity;


    public GeneralFloraShowFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_general_flora_show, container, false);
        tv_name = view.findViewById(R.id.tv_name);
        tv_story = view.findViewById(R.id.tv_story);
        tv_looks = view.findViewById(R.id.tv_looks);
        tv_rarity = view.findViewById(R.id.tv_rarity);
        showFloraBean((FloraBean) getActivity().getIntent().getSerializableExtra("flora"));
        // Inflate the layout for this fragment
        return view;
    }

    private void showFloraBean(FloraBean floradata) {

        tv_name.setText(floradata.getName());
        tv_story.setText(floradata.getStory());
        tv_looks.setText(floradata.getLooks());
        if (floradata.isRarity()) {
            tv_rarity.setText("oui");
        } else {
            tv_rarity.setText("non");
        }
    }
}