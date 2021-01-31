package com.example.lesson6alisa;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class ThirdFragment extends Fragment {
    private IFragments iFragments;
    private EditText etText;
    private Button btn;

    public void onAttach (Context context){
        super.onAttach(context);
        iFragments =(IFragments)context;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        etText =view.findViewById(R.id.et_text);
        btn = view.findViewById(R.id.btn_add);
        btn.setOnClickListener(v -> {
            String word = etText.getText().toString();
            iFragments.add(word);
        });
        return view;
    }
}