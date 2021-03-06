package com.example.helde.armuseu;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MuseusFragment extends ListFragment {


    public MuseusFragment() {
        // Required empty public constructor
    }

    ArrayList<Museu> listaMuseus = new ArrayList<Museu>();

    MuseuAdapter mAdapter;

    Museu m = new Museu("Museu da Água","O Museu da Água localiza-se na freguesia de São Vicente, na cidade, concelho e distrito de Lisboa, em Portugal." ,R.drawable.m);
    Museu m2 = new Museu("Museu do Vinho","O Museu do Vinho localiza-se na freguesia de São Baltazar, na cidade, concelho e distrito de Setubal, em Faro.",R.drawable.m2);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_museus, container,false);

        listaMuseus.add(m);
        listaMuseus.add(m2);

        mAdapter = new MuseuAdapter(getActivity(), listaMuseus);

        setListAdapter(mAdapter);
        setRetainInstance(true);
        return rootView;
    }

    public void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(getActivity(), MuseuActivity.class);
        intent.putExtra("Museu",(Museu) getListView().getItemAtPosition(position));
        startActivityForResult(intent,1);
    }
}
