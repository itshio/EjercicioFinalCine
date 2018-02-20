package com.example.ejerciciofinalcine;

import android.content.Intent;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    static final String EXTRA_SERIE = "FORMULARIO";



    ListView lv_principal;
    ArrayList<Serie> lista_series = new ArrayList<Serie>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lv_principal=(ListView)findViewById(R.id.List_listview);
        Adaptador adaptador_serie= new Adaptador(this,lista_series);
        lv_principal.setAdapter(adaptador_serie);




        Bundle bundformulario= getIntent().getExtras();
        if (bundformulario!=null){

            Serie serie_formulario= bundformulario.getParcelable(FormularioActivity.EXTRA_FORMULARIO);
            lista_series.add(serie_formulario);


        }

        cargarserie();

        lv_principal.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {


                Serie c = ((Serie)parent.getItemAtPosition(position));

                Intent form_serie = new Intent(getApplicationContext(),ResumenActivity.class);
                form_serie.putExtra(EXTRA_SERIE,c);

                startActivity(form_serie);






                return true;
            }
        });


    }


    private void cargarserie (){

        lista_series.add(new Serie("Dark","terror",2018,5,7,"terror"));
        lista_series.add(new Serie("Taboo","terror",2017,2,4,"terror"));
        lista_series.add(new Serie("Arrow","aventura",2012,3,12,"Aventura"));
        lista_series.add(new Serie("Hawai 5.0","accion",2015,5,2,"accion"));
        lista_series.add(new Serie("mum","comedia",2018,8,22,"comedia"));

    }



}
