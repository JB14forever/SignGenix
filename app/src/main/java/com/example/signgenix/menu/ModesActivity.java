package com.example.signgenix.menu;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.signgenix.R;
//import com.example.signgenix.messenger.RegisterActivity;


public class ModesActivity extends AppCompatActivity {

    Button normalMode_button, communicationMode_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modes);

        //Intent main_to_modes = this.getIntent();

        normalMode_button = (Button) findViewById(R.id.normalMode_button);
        communicationMode_button = (Button) findViewById(R.id.communicationMode_button);

        normalMode_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent modes_to_select = new Intent(ModesActivity.this, OrdinaryMenuActivity.class);
                startActivity(modes_to_select);
            }
        });
        /*
        communicationMode_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent modes_to_select = new Intent(ModesActivity.this, RegisterActivity.class);
                startActivity(modes_to_select);
            }
        });*/
    }
}