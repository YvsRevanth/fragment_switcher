package com.example.frargmentswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements ColorFragment1.ColorOne, ColorFragment2.ColorTwo {
    ColorFragment1 colorFragment1 = new ColorFragment1();
    ColorFragment2 colorFragment2 = new ColorFragment2();
    Button Colors;
    Button Color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Color = findViewById(R.id.color);
        Colors = findViewById(R.id.colors);
        getSupportFragmentManager().beginTransaction().add(R.id.container, colorFragment1).commit();
        colorFragment1.setColorOne(this);
        getSupportFragmentManager().beginTransaction().add(R.id.rampage, colorFragment2).commit();
        colorFragment2.setColorTwo(this);

    }

    @Override
    public void colorRed() {
        colorFragment2.coloringTheBlue();
    }


    @Override
    public void colorBlue() {
        colorFragment1.coloringTheRed();

    }
}