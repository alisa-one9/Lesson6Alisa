package com.example.lesson6alisa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements IFragments{
    FragmentManager fragMen;
    FragmentTransaction fragmTran;
    ChangeFragment changeFragment;
    TextFragment textFragment;
    ThirdFragment thirdFragment;
    private ArrayList<Rec>list=new ArrayList<>();
    private ConstraintLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        changeFragment= new ChangeFragment();
        textFragment = new TextFragment();
        thirdFragment = new ThirdFragment();
        fragmTran = getSupportFragmentManager().beginTransaction();
        fragmTran.add(R.id.fragment_first,changeFragment);
        fragmTran.add(R.id.fragment_second,textFragment);
        fragmTran.add(R.id.fragment_container,thirdFragment);
        fragmTran.commit();
    }

        @Override
    public void hide() {
        layout=findViewById(R.id.parent);
        fragmTran=getSupportFragmentManager().beginTransaction();
        fragmTran.show(textFragment);
        layout.setVisibility(View.VISIBLE);

    }

    @Override
    public void show() {

    }

    @Override
    public void add(String word) {
        textFragment.add(new Rec(word));

    }
}