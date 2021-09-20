package com.jang.assistales;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.jang.assistales.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void onBtHomeClick(View view) {
        Toast.makeText(this, "bt marche", Toast.LENGTH_SHORT).show();
    }

    public void onBtProjectClick(View view) {
        Toast.makeText(this, "bt marche", Toast.LENGTH_SHORT).show();
    }

    public void onBtUniversClick(View view) {
        Toast.makeText(this, "bt marche", Toast.LENGTH_SHORT).show();
    }

    public void onBtCharacterClick(View view) {
        Toast.makeText(this, "bt marche", Toast.LENGTH_SHORT).show();
    }

    public void onBtDeitiesClick(View view) {
        Toast.makeText(this, "bt marche", Toast.LENGTH_SHORT).show();
    }

    public void onBtPlaceClick(View view) {
        Toast.makeText(this, "bt marche", Toast.LENGTH_SHORT).show();
    }

    public void onBtFaunaClick(View view) {
        Toast.makeText(this, "bt marche", Toast.LENGTH_SHORT).show();
    }

    public void onBtFloraClick(View view) {
        Toast.makeText(this, "bt marche", Toast.LENGTH_SHORT).show();
    }

    public void onBtItemClick(View view) {
        Toast.makeText(this, "bt marche", Toast.LENGTH_SHORT).show();
    }
}