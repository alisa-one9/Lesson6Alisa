package com.example.lesson6alisa;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class ChangeFragment extends Fragment {


    Button btnShow;
    Button btnHide;
    private IFragments iFragments;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_change, container, false);

        btnShow = view.findViewById(R.id.btn_show);
        btnHide = view.findViewById(R.id.btn_hide);

        btnHide.setOnClickListener(v -> {
            iFragments.hide();
        });
        btnShow.setOnClickListener(v -> {
            iFragments.show();
        });
        return view;
    }




}