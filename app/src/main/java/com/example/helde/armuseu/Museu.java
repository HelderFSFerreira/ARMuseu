package com.example.helde.armuseu;


import android.graphics.drawable.Drawable;

/**
 * Created by Nelson on 24/05/2016.
 */
public class Museu {
    int id_museu;
    String nome;
    String descricao;
    Drawable imagem;

    public Museu(String nome, String descricao, Drawable img){
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

    public Drawable getImagem(){
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

    public void setImagem(Drawable img){
        this.imagem = img;
    }

}
