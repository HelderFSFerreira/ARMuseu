package com.example.helde.armuseu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by helde on 24/05/2016.
 */
public class RegistarActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registar_activity);

        final EditText nome = (EditText) findViewById(R.id.etNome);
        final EditText userName = (EditText) findViewById(R.id.etUser);
        final EditText pass1 = (EditText) findViewById(R.id.etPass1);
        final EditText pass2 = (EditText) findViewById(R.id.etPass2);
    }

    public void btnRegistar (View view) {

    }
}
