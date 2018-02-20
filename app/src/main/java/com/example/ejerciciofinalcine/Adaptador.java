package com.example.ejerciciofinalcine;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DIDACT on 20/02/2018.
 */

public class Adaptador extends ArrayAdapter<Serie> {

    ArrayList<Serie> clasereserva;
    Context c;

    public Adaptador (Context c, ArrayList<Serie> series){

        super(c, R.layout.item_series, series);
        this.c =c;
        this.clasereserva = series;



    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater= LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_series,null);


        TextView tv_ano=(TextView)item.findViewById(R.id.item_año);
        tv_ano.setText(clasereserva.get(position).getAño()+"");


        TextView tv_hora=(TextView)item.findViewById(R.id.item_genero);
        tv_hora.setText(clasereserva.get(position).getGenero_superior());

        TextView tv_nombre=(TextView)item.findViewById(R.id.item_nombre);
        tv_nombre.setText(clasereserva.get(position).getNombre());

        String imagen = clasereserva.get(position).getImagen();

        int idimagen = c.getResources().getIdentifier(imagen,"drawable",c.getPackageName());

        ImageView iv_imagen = (ImageView)item.findViewById(R.id.item_imagen);

        iv_imagen.setImageResource(idimagen);

        if (clasereserva.get(position).getGenero_superior().equals("Familiar")){
            ImageView iv_genero = (ImageView)item.findViewById(R.id.item_imagen);
            iv_genero.setImageResource(R.drawable.familiar);
        }else

            if(clasereserva.get(position).getGenero_superior().equals("Accion")){
            ImageView iv_genero = (ImageView)item.findViewById(R.id.item_imagen);
            iv_genero.setImageResource(R.drawable.accion);
        }else

            if (clasereserva.get(position).getGenero_superior().equals("Amor")){
                ImageView iv_genero = (ImageView)item.findViewById(R.id.item_imagen);
                iv_genero.setImageResource(R.drawable.amor);
            }else
                if (clasereserva.get(position).getGenero_superior().equals("Aventura")){
                    ImageView iv_genero = (ImageView)item.findViewById(R.id.item_imagen);
                    iv_genero.setImageResource(R.drawable.aventura);
                }else
                    if (clasereserva.get(position).getGenero_superior().equals("Comedia")){
                        ImageView iv_genero = (ImageView)item.findViewById(R.id.item_imagen);
                        iv_genero.setImageResource(R.drawable.comedia);
                    }else
                        if (clasereserva.get(position).getGenero_superior().equals("Terror")){
                            ImageView iv_genero = (ImageView)item.findViewById(R.id.item_imagen);
                            iv_genero.setImageResource(R.drawable.terror);
                        }






        return item;
    }
}

