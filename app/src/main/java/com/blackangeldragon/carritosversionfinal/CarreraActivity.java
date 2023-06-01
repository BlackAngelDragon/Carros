package com.blackangeldragon.carritosversionfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CarreraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrera);
    }

    public void goToCarreraIniciada(View view) { startActivity(new Intent(this, CarreraIniciadaActivity.class)); }
}