package com.example.helde.armuseu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //utilizadores
    ArrayList<Utilizador> utilizadores = new ArrayList<Utilizador>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void btnLogin (View view) {
        EditText etLogin = (EditText) findViewById(R.id.etUser);
        EditText etPass = (EditText) findViewById(R.id.etPass);

        System.out.println(etLogin.getText().toString());
        System.out.println(etPass.getText().toString());

        if(checkLogin(etLogin.getText().toString(),etPass.getText().toString())){
            Intent intent = new Intent(view.getContext(), ObraActivity.class);
            startActivityForResult(intent,1);
        }

    }

    public boolean checkLogin(String user, String pass) {
        boolean retorno = false;
        for(Utilizador u : utilizadores){
            if(u.getUserName().equals(user) && u.getPassword().equals(pass)){
                retorno = true;
            }else{
                retorno = false;
            }
        }
        return retorno;
    }

    public void btnRegister (View view) {
        Intent intent = new Intent(view.getContext(), RegistarActivity.class);
        startActivityForResult(intent,0);
    }

    private void carregarDados(){
    }
}
