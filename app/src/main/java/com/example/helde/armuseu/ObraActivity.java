package com.example.helde.armuseu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Nelson on 24/05/2016.
 */
public class ObraActivity extends AppCompatActivity {
    Obra o = null;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obra_layout);

        o = (Obra) getIntent().getSerializableExtra("Obra");
        System.out.println(o.getNome());
    }
}
