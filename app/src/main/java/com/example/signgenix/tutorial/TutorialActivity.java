package com.example.signgenix.tutorial;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.signgenix.R;
import com.example.signgenix.tutorial.CustomSwipeAdapter;

public class TutorialActivity extends AppCompatActivity {


    ViewPager viewPager;
    CustomSwipeAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial_background);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        adapter = new CustomSwipeAdapter(this);
        viewPager.setAdapter(adapter);

    }
}
