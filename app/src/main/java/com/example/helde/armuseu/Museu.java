package com.example.helde.armuseu;


import android.graphics.drawable.Drawable;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Nelson on 24/05/2016.
 */
public class Museu implements Serializable{
    int id_museu;
    String nome;
    String descricao;
    int imagem;
    ArrayList<Obra> obras;

    public Museu(String nome, String descricao, int img){
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = img;
        obras = new ArrayList<Obra>();
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

    public ArrayList<Obra> getObras(){
        return obras;
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

    public void setObras(ArrayList<Obra> obras){
        this.obras = obras;
    }

    public void addObra(Obra obra1) {
        this.obras.add(obra1);
    }

}
