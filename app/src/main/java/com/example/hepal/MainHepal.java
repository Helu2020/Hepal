package com.example.hepal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

<<<<<<< HEAD:app/src/main/java/com/example/hepal/MainActivity.java
import com.example.hepal.controlador.RecyclerAdapter;
import com.example.hepal.modelo.App;

import java.util.ArrayList;

=======
<<<<<<< HEAD:app/src/main/java/com/example/hepal/MainHepal.java
public class MainHepal extends AppCompatActivity {
=======
>>>>>>> 318331f08703745a0204494de4529a3e1aba3a05:app/src/main/java/com/example/hepal/MainHepal.java
/**
 * @author Alberto
 * @author Héctor Luis
 * @author Pablo Blesa
 *
 * Aplicación para la empresa HEPAL
 *
 * @version 06-02-2021*/

public class MainActivity extends AppCompatActivity {
>>>>>>> 0ab25019794a116e751b75df6601d6e6454cad58:app/src/main/java/com/example/hepal/MainActivity.java

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