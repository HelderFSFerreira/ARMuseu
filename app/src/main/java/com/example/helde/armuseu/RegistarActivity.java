package com.example.helde.armuseu;

import android.database.Cursor;
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
    DataBaseHelper myDb;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registar_activity);
        myDb = new DataBaseHelper(this);


    }

    public void btnRegistar (View view) {
        final EditText nome = (EditText) findViewById(R.id.etNome);
        final EditText userName = (EditText) findViewById(R.id.etUser);
        final EditText pass1 = (EditText) findViewById(R.id.etPass1);
        final EditText pass2 = (EditText) findViewById(R.id.etPass2);

        String n = nome.getText().toString(); //Passagem para String de todas as variaveis.
        String p1 = pass1.getText().toString();
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


        Cursor res1 = myDb.verificaUser(userName1);
        if (res1.getCount()!=0) {
            passouVerificacao=false;
            Toast.makeText(RegistarActivity.this,"Já existe um utilizador com esse UserName", Toast.LENGTH_LONG).show();
        }

        //Insere o utilizador na base de dados

        if (passouVerificacao==true) {
            boolean isInserted = myDb.insertData(n,userName1,p1);
            if(isInserted ==true) {
                Toast.makeText(RegistarActivity.this, userName1 + " foi registado", Toast.LENGTH_LONG).show();
                finish();
            } else {
                Toast.makeText(RegistarActivity.this, "Erro no acesso à BD", Toast.LENGTH_LONG).show();
            }
        }
    }
}
