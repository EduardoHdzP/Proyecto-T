package com.example.gamerlenovo.easyenglish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TableLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaVerbosActivity extends AppCompatActivity {
    private String nivel;

    private TextView textViewNivel;

    private GridView gridViewVerbos;

    private ListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_verbos);
/*
        hacerReferencias();

        Bundle bundle=getIntent().getExtras();
        nivel=bundle.getString("nivel");

        switch (nivel){
            case "A1":
                textViewNivel.setText("Nivel: A1");
                break;
            case "A2":
                textViewNivel.setText("Nivel A2");
                break;
            case "B1":
                textViewNivel.setText("Nivel B1");
                break;
            case "B2":
                textViewNivel.setText("Nivel B2");
                break;
            case "C1":
                textViewNivel.setText("Nivel C1");
                break;
            case "C2":
                textViewNivel.setText("Nivel C2");
                break;
        }*/

        Tabla tabla = new Tabla(this, (TableLayout) findViewById(R.id.tabla));

        tabla.agregarCabecera(R.array.cabecera_tabla);
        for(int i = 0; i < 15; i++)
        {
            ArrayList<String> elementos = new ArrayList<String>();
            elementos.add(Integer.toString(i));
            elementos.add("Casilla [" + i + ", 0]");
            elementos.add("Casilla [" + i + ", 1]");
            elementos.add("Casilla [" + i + ", 2]");
            elementos.add("Casilla [" + i + ", 3]");
            tabla.agregarFilaTabla(elementos);
        }


    }

    /*private void hacerReferencias(){
        textViewNivel=findViewById(R.id.textviewNivel);
        gridViewVerbos=findViewById(R.id.gridViewVerbos);
    }*/
}
