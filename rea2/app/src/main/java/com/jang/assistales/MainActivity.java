package com.jang.assistales;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.jang.assistales.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainAdapter adapter = new MainAdapter();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.rvMain.setAdapter(adapter);
    }

    public void onBtHomeClick(View view) {
    }

    public void onBtProjectClick(View view) {
    }

    public void onBtUniversClick(View view) {
    }

    public void onBtCharacterClick(View view) {
    }

    public void onBtDeitiesClick(View view) {
    }

    public void onBtPlaceClick(View view) {
    }

    public void onBtFaunaClick(View view) {
    }

    public void onBtFloraClick(View view) {
    }

    public void onBtItemClick(View view) {
    }
}