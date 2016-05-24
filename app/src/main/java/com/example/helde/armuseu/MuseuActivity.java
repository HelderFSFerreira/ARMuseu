package com.example.helde.armuseu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by helde on 24/05/2016.
 */
public class MuseuActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.museu_layout);

        ListView listaMuseus = (ListView) findViewById(R.id.listaMuseus);
        ArrayList<Museu> ArrayDadosMuseu = new ArrayList<Museu>();
        Museu museu;



        museu = new Museu("Meseu Agua", "é muito bom",getResources().getDrawable(R.drawable.m));
        ArrayDadosMuseu.add(museu);
        museu = new Museu("Meseu Vinho", "toptop",getResources().getDrawable(R.drawable.m));
        ArrayDadosMuseu.add(museu);

        MuseuAdapter adapter = new MuseuAdapter(this, ArrayDadosMuseu);
        listaMuseus.setAdapter(adapter);
    }
}
