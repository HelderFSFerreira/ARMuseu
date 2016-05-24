package com.example.helde.armuseu;

import android.graphics.drawable.Drawable;

import android.graphics.drawable.Drawable;

/**
 * Created by Nelson on 24/05/2016.
 */
public class Obra {
    private int id_obra;
    private String nome;
    private String descricao;
    private Drawable imagem;

    public Obra(String name, String descricao, Drawable img){
        this.nome = name;
        this.descricao = descricao;
        this.imagem = img;
    }

    // getters

    public int getId_obra(){
        return id_obra;
    }

    public String getNome(){
        return nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public Drawable getImagem(){
        return imagem;
    }

    // setters

    public void setId_obra(int id){
        this.id_obra = id;
    }

    public void setNome(String name){
        this.nome = name;
    }

    public void setDescricao(String desc){
        this.descricao  = desc;
    }

    public void setImagem(Drawable i){
        this.imagem = i;
    }

}
