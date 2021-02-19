package com.example.hepal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.example.hepal.controlador.RecyclerAdapter;
import com.example.hepal.modelo.App;

import java.util.ArrayList;

/**
 * @author Alberto
 * @author Héctor Luis
 * @author Pablo Blesa
 *
 * Aplicación para la empresa HEPAL
 *
 * @version 06-02-2021*/

public class MainHepal extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<App> listaApps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //lista de prueba:
        listaApps.add(new App());
        listaApps.add(new App());
        listaApps.add(new App());
        listaApps.add(new App());

        recyclerView = findViewById(R.id.recycler_id);
        recyclerView.setAdapter(new RecyclerAdapter(listaApps));
    }
}