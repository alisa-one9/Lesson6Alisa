package com.example.lesson6alisa;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.ArrayList;

public class TextFragment extends Fragment {
    private RecyclerView recyclerView;
    IFragments iFragments;
    private ArrayList<Rec>list =new ArrayList<>();
    private MainAdapter adapter;

    public TextFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
           View view = inflater.inflate(R.layout.fragment_text, container, false);
           recyclerView =view.findViewById(R.id.recycler);
           RecyclerView recyclerView =view.findViewById(R.id.recycler);
           adapter = new MainAdapter(list,getContext());
           recyclerView.setAdapter(adapter);
           recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
           return view;
    }
    public void add(Rec rec){
        list.add(rec);
        adapter.notifyDataSetChanged();
    }
}