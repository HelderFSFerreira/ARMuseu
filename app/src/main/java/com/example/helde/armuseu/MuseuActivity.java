package com.example.helde.armuseu;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by helde on 24/05/2016.
 */
public class MuseuActivity extends Activity {
    Museu m = null;

    TextView titulo;
    TextView descricao;
    ImageView img;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.museu_layout);

        m = (Museu) getIntent().getSerializableExtra("Museu");
        System.out.println(m.getNome());

        titulo = (TextView) findViewById(R.id.tituloMuseu);
        titulo.setText(m.getNome());

        descricao = (TextView) findViewById(R.id.descricaoMuseu);
        descricao.setText(m.getDescricao());

        img = (ImageView) findViewById(R.id.museuimagem);
        //img.setImageDrawable(m.getImagem());

        carregarObras();

        ListView lv = (ListView) findViewById(R.id.list_obras);
        ArrayList<Obra> listaObras = new ArrayList<Obra>();
        ObraAdapter oAdapter = new ObraAdapter(this, m.getObras());

        lv.setAdapter(oAdapter);


    }

    private void carregarObras(){
        Obra obra1 = new Obra("Quadro Rico","Uma obra muito boa",R.drawable.quadro1);
        Obra obra2 = new Obra("Quadro Pobre","Uma o321321321bra muito boa",R.drawable.quadro2);
        m.addObra(obra1);
        m.addObra(obra2);
    }

    public void btnClicarComprar(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(browserIntent);
    }


}
