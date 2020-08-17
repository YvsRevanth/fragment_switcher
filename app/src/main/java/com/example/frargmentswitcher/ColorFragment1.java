package com.example.frargmentswitcher;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;


public class ColorFragment1 extends Fragment {
    View view;
    ColorOne colorOne;
    FrameLayout frag_one;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_color1, container, false);
        return view;
    }
    public void setColorOne(ColorOne colorOne){
        this.colorOne= colorOne;
    }
    @Override
    public void onResume() {
        super.onResume();
        Button color = view.findViewById(R.id.color);
        frag_one = view.findViewById(R.id.frag_one);
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                colorOne.colorRed();
            }
        });
    }
    public void coloringTheRed(){
        frag_one.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.regular_coloring));
    }

    public interface ColorOne{
        void colorRed();
    }
}
