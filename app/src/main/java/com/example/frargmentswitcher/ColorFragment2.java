package com.example.frargmentswitcher;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;


public class ColorFragment2 extends Fragment {
    View view;
    ColorTwo colorTwo;
    FrameLayout frag_two;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_color2, container, false);
        return view;
    }
    public void setColorTwo(ColorTwo colorTwo){
        this.colorTwo= colorTwo;
    }
    @Override
    public void onResume() {
        super.onResume();
        Button colors = view.findViewById(R.id.colors);
        frag_two = view.findViewById(R.id.frag_two);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                colorTwo.colorBlue();
            }
        });
    }
    public void coloringTheBlue(){
        frag_two.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.colorAccent));
    }

    public interface ColorTwo {
        void colorBlue();
    }
}