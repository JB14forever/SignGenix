package com.example.signgenix.menu;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.signgenix.R;


public class OptionSelectActivity extends AppCompatActivity {

    Button ordinarySelect_button, extraOrdinarySelect_button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_select);

        //Intent modes_to_select = this.getIntent();

        ordinarySelect_button = (Button) findViewById(R.id.ordinarySelect_button);
        extraOrdinarySelect_button = (Button) findViewById(R.id.extraOrdinarySelect_button);

        ordinarySelect_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent option_to_menu = new Intent(OptionSelectActivity.this, OrdinaryMenuActivity.class);
                startActivity(option_to_menu);
            }
        });
    }
}
