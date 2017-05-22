package com.example.enzo.petshop.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.enzo.petshop.CustomAdapter;
import com.example.enzo.petshop.MyList;
import com.example.enzo.petshop.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Drei on 22/05/2017.
 */

public class PetsFragment extends Fragment {

    //recyclerview objects
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    //model object for our list data
    private List<MyList> list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pets,container,false);

        /*//initializing views
        recyclerView = (RecyclerView) getView().findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getView().getContext()));

        list = new ArrayList<>();

        loadRecyclerViewItem();*/

        return view;
    }

    private void loadRecyclerViewItem() {
        //you can fetch the data from server or some apis
        //for this tutorial I am adding some dummy data directly
        for (int i = 1; i <= 8; i++) {
            MyList myList = new MyList(
                    "Veterinaria " + i,
                    "Descripcion de la Veterinaria",
                    "direccion Veterinaria"
            );
            list.add(myList);
        }
        adapter = new CustomAdapter(list, getContext());
        recyclerView.setAdapter(adapter);

    }
}
