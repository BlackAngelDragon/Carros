package com.blackangeldragon.carritosversionfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PistasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pistas);
    }

    public void goToPistasCrud(View view) { startActivity(new Intent(this, PistasCrudActivity.class)); }
}

