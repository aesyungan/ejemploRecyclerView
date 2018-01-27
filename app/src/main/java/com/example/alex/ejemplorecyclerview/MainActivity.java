package com.example.alex.ejemplorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Destino> lista = new ArrayList<>();
        lista.add(new Destino("Imagen Numero 2", R.drawable.dos,0));
        lista.add(new Destino("Imagen Numero 1", R.drawable.uno,0));
        lista.add(new Destino("Imagen Numero 3", R.drawable.tres,0));
        lista.add(new Destino("Imagen Numero 4", R.drawable.cuatro,0));
        lista.add(new Destino("Imagen Numero 5", R.drawable.cinco,0));
        lista.add(new Destino("Imagen Numero 6", R.drawable.seis,0));
        lista.add(new Destino("Imagen Numero 7", R.drawable.siete,0));

        RecyclerView myRecyclerView = (RecyclerView) findViewById(R.id.myRecyclerView);
        myRecyclerView.setHasFixedSize(true);//no va presentar variable en el tamaño
        LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext());
        layout.setOrientation(LinearLayoutManager.VERTICAL);//utiliza tipo vertical
        myRecyclerView.setAdapter(new AdaptadorRecyclerView(lista));
        myRecyclerView.setLayoutManager(layout);

    }
}
