package com.blackangeldragon.carritosversionfinal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class dbHelper extends SQLiteOpenHelper
{
    public static final int db_Version = 1;
    public static final String db_Nombre = "Carros.db";

    public dbHelper(@Nullable Context context)
    {
        super(context, db_Nombre, null, db_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("CREATE TABLE ENT_PILOTO(ID_PILOTO TEXT PRIMARY KEY);");
        db.execSQL("CREATE TABLE ENT_CARRO(ID_CARRO INTEGER PRIMARY KEY, D_CARRO TEXT);");
        db.execSQL("CREATE TABLE ENT_CARRERA(ID_CARRERA INTEGER PRIMARY KEY, N_VUELTA INTEGER);");
        db.execSQL("CREATE TABLE REL_CARRERA_PILOTO_CARRO(ID_CARRERA INTEGER, ID_PILOTO TEXT, ID_CARRO INTEGER, T_VUELTA INTEGER," +
                "FOREIGN KEY(ID_CARRERA) REFERENCES ENT_CARRERA(ID_CARRERA)," +
                "FOREIGN KEY(ID_PILOTO) REFERENCES ENT_PILOTO(ID_PILOTO)," +
                "FOREIGN KEY(ID_CARRO) REFERENCES ENT_CARRO(ID_CARRO));");
        db.execSQL("CREATE TABLE CAT_ESTATUS(ID_ESTATUS INTEGER PRIMARY KEY, D_ESTATUS TEXT);");
        db.execSQL("CREATE TABLE REL_PILOTO_CARRO(ID_PILOTO TEXT, ID_CARRO INTEGER, ID_ESTATUS INTEGER," +
                "FOREIGN KEY(ID_PILOTO) REFERENCES ENT_PILOTO(ID_PILOTO)," +
                "FOREIGN KEY(ID_CARRO) REFERENCES ENT_CARRO(ID_CARRO)," +
                "FOREIGN KEY(ID_ESTATUS) REFERENCES CAT_ESTATUS(ID_ESTATUS)," +
                "UNIQUE(ID_CARRO));");
        db.execSQL("INSERT INTO CAT_ESTATUS VALUES(0, 'NOT READY');");
        db.execSQL("INSERT INTO CAT_ESTATUS VALUES(1, 'READY');");
        db.execSQL("INSERT INTO CAT_ESTATUS VALUES(2, 'RUNNING');");
        db.execSQL("INSERT INTO CAT_ESTATUS VALUES(3, 'BROKEN');");

        /* Inserciones de ayuda, eliminar despues*/
        db.execSQL("INSERT INTO ENT_PILOTO VALUES('Luis');");
        db.execSQL("INSERT INTO ENT_PILOTO VALUES('Chris');");
        db.execSQL("INSERT INTO ENT_CARRO VALUES(1, 'El Mamalón');");
        db.execSQL("INSERT INTO ENT_CARRO VALUES(2, 'Pajaro Nalgón');");
        db.execSQL("INSERT INTO ENT_CARRO VALUES(3, 'El Niño');");
        db.execSQL("INSERT INTO ENT_CARRERA VALUES(1, 10);");
        db.execSQL("INSERT INTO REL_PILOTO_CARRO VALUES('Luis', 1, 1);");
        db.execSQL("INSERT INTO REL_PILOTO_CARRO VALUES('Luis', 3, 0);");
        db.execSQL("INSERT INTO REL_PILOTO_CARRO VALUES('Chris', 2, 1);");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE REL_PILOTO_CARRO;");
        db.execSQL("DROP TABLE REL_CARRERA_PILOTO_CARRO;");
        db.execSQL("DROP TABLE ENT_CARRERA;");
        db.execSQL("DROP TABLE ENT_CARRO;");
        db.execSQL("DROP TABLE ENT_PILOTO;");
        db.execSQL("DROP TABLE CAT_ESTATUS;");
        onCreate(db);
    }
}
