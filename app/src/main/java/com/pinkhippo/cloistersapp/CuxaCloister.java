package com.pinkhippo.cloistersapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CuxaCloister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuxa_cloister);
    }

    // Zoom out function -> go back to main floor/ ground floor
    public void launchFirstFloor (View v) {
        Intent i = new Intent(this,MainActivity.class );
        startActivity(i);
    }
}