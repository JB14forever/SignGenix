package com.example.signgenix.keyboard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.signgenix.R;

public class SignToTextActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_to_text);
    }

    public void setupKeyboard(View v) {
        startActivityForResult(new Intent("android.settings.INPUT_METHOD_SETTINGS"), 0);
    }

    public void selectKeyboard(View v) {
        InputMethodManager imeManager = (InputMethodManager) getApplicationContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imeManager != null) {
            imeManager.showInputMethodPicker();
        } else {
            Toast.makeText(this, "Cannot chose this keyboard", Toast.LENGTH_SHORT).show();
        }
    }
}
