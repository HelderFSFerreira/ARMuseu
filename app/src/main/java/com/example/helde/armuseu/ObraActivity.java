package com.example.helde.armuseu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Nelson on 24/05/2016.
 */
public class ObraActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obra_layout);

        ListView listaMuseus = (ListView) findViewById(R.id.listaObras);
        ArrayList<Obra> ArrayDadosMuseu = new ArrayList<Obra>();
        Obra obras;


        obras = new Obra("MonaLisa", "Uma obra muita fantastica!! Venha aprecisar!!",getResources().getDrawable(R.drawable.m));
        ArrayDadosMuseu.add(obras);
        obras = new Obra("MonaDeslisa", "Uma obra muita fantastica!! Venha aprecisar!!",getResources().getDrawable(R.drawable.m2));
        ArrayDadosMuseu.add(obras);
        obras = new Obra("MonaLisa", "Uma obra muita fantastica!! Venha aprecisar!!",getResources().getDrawable(R.drawable.m));
        ArrayDadosMuseu.add(obras);

        ObraAdapter adapter = new ObraAdapter(this, ArrayDadosMuseu);

        listaMuseus.setAdapter(adapter);
    }
}
