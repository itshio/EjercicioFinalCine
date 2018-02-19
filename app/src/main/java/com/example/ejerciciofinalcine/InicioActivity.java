package com.example.ejerciciofinalcine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }


    public void click_verserie (View view){

        Intent nueva_verserie = new Intent(getApplicationContext(),ListViewActivity.class);
        startActivity(nueva_verserie);



    }

    public void click_nuevaserie (View view){

        Intent nuevaserie = new Intent(getApplicationContext(),FormularioActivity.class);
        startActivity(nuevaserie);


    }
}
