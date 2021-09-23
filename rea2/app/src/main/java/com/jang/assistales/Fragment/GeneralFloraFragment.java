package com.jang.assistales.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jang.assistales.FloraActivity;
import com.jang.assistales.R;
import com.jang.assistales.databinding.FragmentGeneralFloraBinding;
import com.jang.assistales.model.FloraBean;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GeneralFloraFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GeneralFloraFragment extends Fragment {

    private FragmentGeneralFloraBinding binding;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_NAME = "Nom";
    private static final String ARG_STORY = "Histoire";

    // TODO: Rename and change types of parameters
    private String mName;
    private String mStory;

    public GeneralFloraFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GeneralFloraFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GeneralFloraFragment newInstance(String param1, String param2) {
        GeneralFloraFragment fragment = new GeneralFloraFragment();
        Bundle args = new Bundle();
        args.putString(ARG_NAME, param1);
        args.putString(ARG_STORY, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mName = getArguments().getString(ARG_NAME);
            mStory = getArguments().getString(ARG_STORY);

        }
        binding = FragmentGeneralFloraBinding.inflate(getLayoutInflater());
        FloraActivity.floraBean = new FloraBean("Tulipe");
        FloraActivity.floraBean.setStory(binding.etStory.getText().toString());
        FloraActivity.floraBean.setLooks(binding.etLooks.getText().toString());



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_general_flora, container, false);
    }
}