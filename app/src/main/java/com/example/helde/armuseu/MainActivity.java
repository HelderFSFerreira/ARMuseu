package com.example.helde.armuseu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



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
