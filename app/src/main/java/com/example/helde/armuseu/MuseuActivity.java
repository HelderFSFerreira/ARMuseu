package com.example.helde.armuseu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by helde on 24/05/2016.
 */
public class MuseuActivity extends AppCompatActivity {
    Museu m = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.museu_layout);

        m = (Museu) getIntent().getSerializableExtra("Museu");
        System.out.println(m.getNome());
    }
}
