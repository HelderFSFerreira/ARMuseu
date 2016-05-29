package com.example.helde.armuseu;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nelson on 24/05/2016.
 */
public class MuseuAdapter extends BaseAdapter {

    protected Activity activity;

    protected ArrayList<Museu> museus;

    public MuseuAdapter(Activity activity, ArrayList<Museu> Museus){
        this.activity = activity;
        this.museus = Museus;
    }

    @Override
    public int getCount() {
        return museus.size();
    }

    @Override
    public Object getItem(int position) {
        return museus.get(position);
    }

    @Override
    public long getItemId(int position) {
        return museus.get(position).getId_museu();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if(convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.museulist, null);
        }

        Museu museu = museus.get(position);
        Museu dir = museus.get(position);

        ImageView img = (ImageView) v.findViewById(R.id.id_image_museu);
        img.setImageResource(museu.getImagem());

        TextView title = (TextView) v.findViewById(R.id.id_nome_museu);
        title.setText(museu.getNome());

        TextView descp = (TextView) v.findViewById(R.id.id_descricao);
        descp.setText(museu.getDescricao());

        return v;
    }
}
