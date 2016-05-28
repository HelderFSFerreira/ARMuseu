package com.example.helde.armuseu;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    DataBaseHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDB = new DataBaseHelper(this);

        final TextView registerLink = (TextView) findViewById(R.id.tvRegister);

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this,RegistarActivity.class);
                MainActivity.this.startActivity(registerIntent);
            }
        });


    }

    public void btnLogin (View view) {
        EditText etLogin = (EditText) findViewById(R.id.etUser);
        EditText etPass = (EditText) findViewById(R.id.etPass);

        if(checkLogin(etLogin.getText().toString(),etPass.getText().toString())){
            Intent intent = new Intent(view.getContext(), HomeActivity.class);
            startActivityForResult(intent,1);
        } else {
            etLogin.setText("");
            etPass.setText("");
            Toast.makeText(MainActivity.this, "Erro nas credencias de acesso", Toast.LENGTH_LONG).show();
        }

    }

    public boolean checkLogin(String user, String pass) {
        Cursor res = myDB.checkLogIN(user,pass);
        if (res.getCount()==0) {
            return false;
        } else {
            return true;
        }
    }
}
