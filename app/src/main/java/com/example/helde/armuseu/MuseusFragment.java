package com.example.helde.armuseu;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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


    Museu m = new Museu("Nome","desscricao",R.drawable.m);
    Museu m2 = new Museu("Nome2","desscricao3",R.drawable.m2);


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

}
