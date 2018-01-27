package com.example.alex.ejemplorecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Alex on 26/1/2018.
 */

public class AdaptadorRecyclerView extends RecyclerView.Adapter<ViewHolder> {
    List<Destino> lista;

    //constructor
    public AdaptadorRecyclerView(List<Destino> lista) {
        this.lista = lista;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //carga la vista para cada item
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        //cada item

        holder.txtTitulo.setText(lista.get(position).nombre);
        holder.imganen.setImageResource(lista.get(position).imagen);
        holder.btnMegusta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.btnMegusta.getContext(), "Megusta " + lista.get(position).getNombre(), Toast.LENGTH_LONG).show();
            }
        });
        holder.btnfavorito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.btnfavorito.getContext(), "Añadido a Favoritos" + lista.get(position).getNombre(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return lista.size();//tamaño del objeto
    }
}
