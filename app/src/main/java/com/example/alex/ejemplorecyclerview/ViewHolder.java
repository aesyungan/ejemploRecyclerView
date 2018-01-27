package com.example.alex.ejemplorecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Alex on 26/1/2018.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    Button btnMegusta, btnfavorito;
    TextView txtTitulo;
    ImageView imganen;

    public ViewHolder(View itemView) {
        super(itemView);
        int position = getAdapterPosition();
        btnMegusta = (Button) itemView.findViewById(R.id.btnMegusta);
        btnfavorito = (Button) itemView.findViewById(R.id.btnFaboritos);
        txtTitulo = (TextView) itemView.findViewById(R.id.txtTitulo);
        imganen = (ImageView) itemView.findViewById(R.id.imagen);

    }


}
