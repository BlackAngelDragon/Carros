package com.blackangeldragon.carritosversionfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    dbHelper dbh = new dbHelper(MainActivity.this);
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = dbh.getWritableDatabase();
    }

    public void goToDispositivos(View view) { startActivity(new Intent(this, DispositivosActivity.class)); }
    public void goToCarrera(View view) {
        startActivity(new Intent(this, CarreraActivity.class));
    }
    public void goToPilotos(View view) {
        startActivity(new Intent(this, PilotosActivity.class));
    }
    public void goToAutos(View view) { startActivity(new Intent(this, AutosActivity.class)); }
    public void goToPistas(View view) { startActivity(new Intent(this, PistasActivity.class)); }
    public void goToHistorial(View view) { startActivity(new Intent(this, HistorialActivity.class)); }


}