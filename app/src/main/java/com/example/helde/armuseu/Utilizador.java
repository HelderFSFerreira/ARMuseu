package com.example.helde.armuseu;

/**
 * Created by helde on 24/05/2016.
 */
public class Utilizador {
    private String nome;
    private String userName;
    private String password;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Utilizador(String nome, String userName, String password) {
        this.nome = nome;
        this.userName = userName;
        this.password = password;
    }
}
