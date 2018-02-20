package com.example.ejerciciofinalcine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResumenActivity extends AppCompatActivity {

    TextView txt_nombre,txt_año,txt_genero,txt_temporadas,txt_episodios;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        txt_nombre=(TextView)findViewById(R.id.resu_txtnombre);
        txt_año=(TextView)findViewById(R.id.resu_txtaño);
        txt_genero=(TextView)findViewById(R.id.resu_txtgenero);
        txt_temporadas=(TextView)findViewById(R.id.resu_txttemporada);
        txt_episodios=(TextView)findViewById(R.id.resu_txtepisodio);

        Bundle bundlist = getIntent().getExtras();
        if (bundlist!=null){

            Serie seriado = bundlist.getParcelable(ListViewActivity.EXTRA_SERIE);
            txt_nombre.setText(seriado.getNombre());
            txt_año.setText(seriado.getAño()+"");
            txt_genero.setText(seriado.getGenero_superior());
            txt_temporadas.setText(seriado.getTemporadas()+"");
            txt_episodios.setText(seriado.getEpisodios()+"");
        }
    }
}
