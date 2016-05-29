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
public class ObraAdapter extends BaseAdapter {

    protected Activity activity;

    protected ArrayList<Obra> obras;

    public ObraAdapter(Activity activity, ArrayList<Obra> Obras){
        this.activity = activity;
        this.obras = Obras;
    }

    @Override
    public int getCount() {
        return obras.size();
    }

    @Override
    public Object getItem(int position) {
        return obras.get(position);
    }

    @Override
    public long getItemId(int position) {
        return obras.get(position).getId_obra();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.obralist, null);
        }

        Obra obra = obras.get(position);
        Obra dir = obras.get(position);

        ImageView img = (ImageView) v.findViewById(R.id.image_museu);
        img.setImageResource(obra.getImagem());

        TextView title = (TextView) v.findViewById(R.id.id_museu);
        title.setText(obra.getNome());

        TextView descp = (TextView) v.findViewById(R.id.text_desc);
        descp.setText(obra.getDescricao());

        return v;
    }
}
