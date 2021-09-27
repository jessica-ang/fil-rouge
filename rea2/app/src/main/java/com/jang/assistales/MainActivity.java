package com.jang.assistales;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.tabs.TabLayout;
import com.jang.assistales.Fragment.HomeFragment;
import com.jang.assistales.Fragment.SheetFragment;
import com.jang.assistales.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Fragment fragment = null;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // affichage fragment
        fragment = new HomeFragment();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fl_main, fragment);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.commit();
        binding.tlMain.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        fragment = new HomeFragment();
                        binding.tvHead.setBackgroundResource(R.mipmap.ic_banner_foreground);
                        break;
                    case 1:
                        fragment = new SheetFragment(Common.TYPE_PROJECT);
                        break;
                    case 2:
                        fragment = new SheetFragment(Common.TYPE_UNIVERS);
                        break;
                    case 3:
                        fragment = new SheetFragment(Common.TYPE_CHARACTER);
                        break;
                    case 4:
                        fragment = new SheetFragment(Common.TYPE_DEITIES);
                        break;
                    case 5:
                        fragment = new SheetFragment(Common.TYPE_PLACE);
                        break;
                    case 6:
                        fragment = new SheetFragment(Common.TYPE_FAUNA);
                        break;
                    case 7:
                        fragment = new SheetFragment(Common.TYPE_FLORA);
                        binding.tvHead.setBackgroundResource(R.mipmap.ic_bannerflora_foreground);
                        break;
                    case 8:
                        fragment = new SheetFragment(Common.TYPE_ITEM);
                        break;


                }
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fl_main, fragment);
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