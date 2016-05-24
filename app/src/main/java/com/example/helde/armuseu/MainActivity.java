package com.example.helde.armuseu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Utilizador> utilizadores = new ArrayList<Utilizador>();

        Utilizador u;
        u = new Utilizador("Helder","wn","123");
        utilizadores.add(u);




        /*ListView listaMuseus = (ListView) findViewById(R.id.listaObras);
        ArrayList<Obra> ArrayDadosMuseu = new ArrayList<Obra>();
        Obra obras;


        obras = new Obra("MonaLisa", "Uma obra muita fantastica!! Venha aprecisar!!",getResources().getDrawable(R.drawable.m));
        ArrayDadosMuseu.add(obras);
        obras = new Obra("MonaDeslisa", "Uma obra muita fantastica!! Venha aprecisar!!",getResources().getDrawable(R.drawable.m2));
        ArrayDadosMuseu.add(obras);
        obras = new Obra("MonaLisa", "Uma obra muita fantastica!! Venha aprecisar!!",getResources().getDrawable(R.drawable.m));
        ArrayDadosMuseu.add(obras);

        ObraAdapter adapter = new ObraAdapter(this, ArrayDadosMuseu);

        listaMuseus.setAdapter(adapter);*/
    }

    public void btnLogin (View view) {
        System.out.println("entrei aqui");
        EditText etLogin = (EditText) findViewById(R.id.etUser);
        EditText etPass = (EditText) findViewById(R.id.etPass);

        System.out.println(etLogin.getText().toString());
        System.out.println(etPass.getText().toString());

    }

    public boolean checkLogin(String user, String pass) {
        return true;
    }
}
