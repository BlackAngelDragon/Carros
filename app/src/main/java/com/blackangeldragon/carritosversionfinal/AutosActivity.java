package com.blackangeldragon.carritosversionfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AutosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autos);
    }
    public void goToAutosCrud(View view) { startActivity(new Intent(this, AutosCrudActivity.class)); }
}