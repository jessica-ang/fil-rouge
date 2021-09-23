package com.jang.assistales;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.tabs.TabLayout;
import com.jang.assistales.Fragment.AbilityFloraFragment;
import com.jang.assistales.Fragment.GeneralSheetShowFragment;
import com.jang.assistales.databinding.ActivityFloraBinding;
import com.jang.assistales.model.FloraBean;

import java.util.ArrayList;

public class FloraActivity extends AppCompatActivity {
    private ActivityFloraBinding binding;
    private Fragment fragment = null;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private static ArrayList<FloraBean> floraBeans;
    public static FloraBean floraBean;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFloraBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        floraBeans = new ArrayList<>();


        // affichage fragment
        fragment = new GeneralSheetShowFragment();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fl, fragment);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.commit();
        binding.tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        fragment = new GeneralSheetShowFragment();
                        break;
                    case 1:
                        fragment = new AbilityFloraFragment();
                        break;

                }
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fl, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


}