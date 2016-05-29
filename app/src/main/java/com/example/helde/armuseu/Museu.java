package com.example.helde.armuseu;


import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by Nelson on 24/05/2016.
 */
public class Museu implements Serializable {
    int id_museu;
    String nome;
    String descricao;
    int imagem;

    public Museu(String nome, String descricao, int img){
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = img;
    }

    //getters
    public int getId_museu(){
        return id_museu;
    }

    public String getNome(){
        return nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public int getImagem(){
        return imagem;
    }

    //setters
    public void setId_museu(int id){
        this.id_museu = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDescricao(String desc){
        this.descricao = desc;
    }

    public void setImagem(int img){
        this.imagem = img;
    }

}
