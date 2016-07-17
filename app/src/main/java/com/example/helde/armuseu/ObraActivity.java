package com.example.helde.armuseu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nelson on 24/05/2016.
 */
public class ObraActivity extends AppCompatActivity {
    Obra o = null;

    TextView titulo;
    TextView descricao;
    ImageView img;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obra_layout);

        o = (Obra) getIntent().getSerializableExtra("Obra");
        System.out.println(o.getNome());

        titulo = (TextView) findViewById(R.id.nomedaobra);
        titulo.setText(o.getNome());
        System.out.println(o.getNome());

        descricao = (TextView) findViewById(R.id.descricaoobra);
        descricao.setText(o.getDescricao());

        img = (ImageView) findViewById(R.id.museuimagem);
        //img.setImageDrawable(m.getImagem());

    }
}
