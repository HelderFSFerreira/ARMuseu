package com.example.helde.armuseu;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v4.content.res.TypedArrayUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ObraFragment extends ListFragment {


    public ObraFragment() {
        // Required empty public constructor
    }

    ObraAdapter obraAdapter;
    ArrayList<Obra> listaObras = new ArrayList<Obra>();

    Obra ob1 = new Obra("Obra Linda","Uma obra muito mas muito linda.Uma obra muito mas muito linda.Uma obra muito mas muito linda.",R.drawable.quadro1);
    Obra ob2 = new Obra("Obra feia","Uma obra muito mas muito feitadadafa.Uma obra muito mas muito linda.Uma obra muito mas muito linda.",R.drawable.quadro2);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_obra, container,false);

        listaObras.add(ob1);
        listaObras.add(ob2);

        obraAdapter = new ObraAdapter(getActivity(), listaObras);

        setListAdapter(obraAdapter);
        setRetainInstance(true);

        return rootView;
    }

    public void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(getActivity(), ObraActivity.class);
        intent.putExtra("Obra",(Obra) getListView().getItemAtPosition(position));
        startActivityForResult(intent,1);
    }

}
