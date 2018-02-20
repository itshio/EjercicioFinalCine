package com.example.ejerciciofinalcine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity {

    static final String EXTRA_FORMULARIO = "FORMULARIO";


    EditText et_nombre, et_temporadas, et_episodios, et_año, et_sinopsis;
    RadioGroup rg_genero_superior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        et_nombre=(EditText)findViewById(R.id.formu_et_nombre);
        et_temporadas=(EditText)findViewById(R.id.formu_et_temporadas);
        et_episodios=(EditText)findViewById(R.id.formu_et_episodios);
        et_año=(EditText)findViewById(R.id.formu_et_año);
        et_sinopsis=(EditText)findViewById(R.id.formu_et_sinopsis);

        rg_genero_superior=(RadioGroup)findViewById(R.id.formu_rg_superior);


    }



    public void Guardar (View view){

        String nombre = et_nombre.getText().toString();
        String temporadas = et_temporadas.getText().toString();
        String episodios = et_episodios.getText().toString();
        String años = et_año.getText().toString();
        String sinopsis = et_sinopsis.getText().toString();

        int idradiosuperior = rg_genero_superior.getCheckedRadioButtonId();


        if(nombre.equals("")||temporadas.equals("")|| episodios.equals("")||años.equals("")||
                (idradiosuperior == -1)){

            Toast.makeText(this,"Debes rellenar todos los campos",Toast.LENGTH_LONG).show();




        }else{

            int temporada =Integer.parseInt(temporadas);
            int episodio = Integer.parseInt(episodios);
            int año = Integer.parseInt(años);

            RadioButton radiogroup = (RadioButton)findViewById(idradiosuperior);
            String txt_radiobutton =radiogroup.getText().toString()+"";

            Serie nueva_serie= new Serie(nombre,"",temporada,episodio,año,txt_radiobutton);

            Intent form_serie= new Intent(getApplicationContext(),ListViewActivity.class);
            form_serie.putExtra(EXTRA_FORMULARIO,nueva_serie);

            startActivity(form_serie);








        }


    }

    public void borrar ( View view){

        et_nombre.setText("");
        et_temporadas.setText("");
        et_episodios.setText("");
        et_año.setText("");
        et_sinopsis.setText("");
        rg_genero_superior.clearCheck();

    }



}
