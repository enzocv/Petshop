package com.example.enzo.petshop;

/**
 * Created by Asus on 22/05/2017.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Belal on 29/09/16.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private List<MyList> list;
    private Context mCtx;

    public CustomAdapter(List<MyList> list, Context mCtx) {
        this.list = list;
        this.mCtx = mCtx;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_items, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CustomAdapter.ViewHolder holder, int position) {
        MyList myList = list.get(position);
        holder.textViewNombre.setText(myList.getNombre_veterinaria());
        holder.textViewDesc.setText(myList.getDescripcion_veterinaria());
        holder.textViewDirec.setText(myList.getDireccion_veterinaria());

        holder.buttonViewOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //will show popup menu here

            }
        });
    }


    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewNombre;
        public TextView textViewDesc;
        public TextView textViewDirec;
        public TextView buttonViewOption;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewNombre = (TextView) itemView.findViewById(R.id.nombre_veterinaria);
            textViewDesc = (TextView) itemView.findViewById(R.id.descripcion_veterinaria);
            textViewDirec = (TextView) itemView.findViewById(R.id.direccion_veterinaria);
            buttonViewOption = (TextView) itemView.findViewById(R.id.textViewOptions);
        }
    }
}
