package com.example.hepal.controlador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hepal.R;
import com.example.hepal.modelo.App;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.holder>{

    private ArrayList<App> listaApps;

    //constructores
    public RecyclerAdapter() {}

    public RecyclerAdapter(ArrayList<App> listaApps) {
        this.listaApps = listaApps;
    }
    //getter de la lista del adapter por si queremos pasar datos a otro lado
    public ArrayList<App> getListaApps(){return listaApps;}

    @NonNull
    @Override
    public RecyclerAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.app_descripcion, parent, false));
    }

    @NonNull
    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.holder holder, final int position) {
        holder.imagen.setImageResource(listaApps.get(position).getImagen());

        holder.imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Ahora se abre el fragmento/diálog
                switch (listaApps.get(position).getCodApp()){
                    case 1:
                        //TODO: abrir app codApp 1
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaApps.size();
    }

    public class holder extends RecyclerView.ViewHolder {
        ImageView imagen;

        public holder(@NonNull View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.img_app_id);
        }
    }
}
