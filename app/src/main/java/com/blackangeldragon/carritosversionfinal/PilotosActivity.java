package com.blackangeldragon.carritosversionfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PilotosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilotos);
    }
    public void goToCrudPilotos(View view) {
        startActivity(new Intent(this, PilotosCrudActivity.class));
    }

}