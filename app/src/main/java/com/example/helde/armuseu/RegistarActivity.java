package com.example.helde.armuseu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by helde on 24/05/2016.
 */
public class RegistarActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registar_activity);


    }

    public void btnRegistar (View view) {
        final EditText nome = (EditText) findViewById(R.id.etNome);
        final EditText userName = (EditText) findViewById(R.id.etUser);
        final EditText pass1 = (EditText) findViewById(R.id.etPass1);
        final EditText pass2 = (EditText) findViewById(R.id.etPass2);
        ArrayList<Utilizador> utilizadores = (ArrayList<Utilizador>) getIntent().getSerializableExtra("utilizadores");  // recebe os utilizadores

        String n = nome.getText().toString();
        String p1 = pass1.getText().toString();  // tive de definir aqui e não no if abaixo porque estava a ter erros de comparação
        String p2 = pass2.getText().toString();
        String userName1 = userName.getText().toString();

        Boolean passouVerificacao=true;

        if (nome.getText().length()==0 || userName.getText().length()==0 || pass1.getText().length()==0 || pass2.getText().length()==0) {
            Toast toastVazio = Toast.makeText(getApplicationContext(),"Algum dos campos está vazio",Toast.LENGTH_SHORT);
            toastVazio.show();
        }


        boolean passesIguais = p1.equals(p2);

        if (!passesIguais) {
            Toast passVazia = Toast.makeText(getApplicationContext(),"As passwords não são iguais",Toast.LENGTH_SHORT);
            passouVerificacao=false;
            passVazia.show();
        }

        // Verifica se o utilizador já está registado



        boolean verificacaoUtilizador=false;
        for (int i=0;i<utilizadores.size();i++) {
            Utilizador u = utilizadores.get(i);
            if (u.getUserName().equals(userName1)) {
                verificacaoUtilizador=true;
                passouVerificacao=false;
            }
        }

        if (verificacaoUtilizador==true) {
            Toast passUserExistente = Toast.makeText(getApplicationContext(),"Já existe um utilizador com esse nome",Toast.LENGTH_SHORT);
            passouVerificacao=false;
            passUserExistente.show();
        }

        if (passouVerificacao==true) {
            Utilizador u = new Utilizador(n,userName1,p1);
            utilizadores.add(u);
            Toast utilizadorRegistado = Toast.makeText(getApplicationContext(),n+" foi registado",Toast.LENGTH_SHORT);
            utilizadorRegistado.show();
            finish();
        }
    }
}
