package com.example.helde.armuseu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Utilizador> uti = new ArrayList<Utilizador>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Utilizador> utilizadores = new ArrayList<Utilizador>();

        Utilizador u;
        u = new Utilizador("Helder","wn","123");
        uti.add(u);




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

        if(checkLogin(etLogin.getText().toString(),etPass.getText().toString())){
            System.out.println("entraaaafjnahfagahbigaganojf");
        }

    }

    public boolean checkLogin(String user, String pass) {
        boolean retorno = false;
        for(Utilizador u : uti){
            if(u.getUserName().equals(user) && u.getPassword().equals(pass)){
                retorno = true;
            }else{
                retorno = false;
            }
        }
        return retorno;
    }

    private void carregarDados(){


    }
}
