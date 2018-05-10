package com.example.gamerlenovo.easyenglish;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NivelActivity extends AppCompatActivity {
    private Intent intent;

    private TextView textViewNivel;
    private String nivel;

    private Button btnGramatica;
    private Button btnEjercicio;
    private Button btnLectura;
    private Button btnVerbos;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel);
        hacerReferencias();
        Bundle bundle=getIntent().getExtras();
        nivel=bundle.getString("nivel");
        switch (nivel){
            case "A1":
                textViewNivel.setText("Nivel A1");
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
        }

        btnGramatica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(getApplicationContext(),ListaTemasActivity.class);
                intent.putExtra("nivel",nivel);
                startActivity(intent);
            }
        });

        btnEjercicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(getApplicationContext(),EjerciciosActivity.class);
                intent.putExtra("nivel",nivel);
                startActivity(intent);
            }
        });

        btnLectura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnVerbos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(getApplicationContext(),ListaVerbosActivity.class);
                intent.putExtra("nivel",nivel);
                startActivity(intent);
            }
        });
    }


    public void hacerReferencias(){
        textViewNivel=findViewById(R.id.textviewNivel);
            btnGramatica=findViewById(R.id.btnGramatica);
            btnEjercicio=findViewById(R.id.btnEjercicios);
            btnLectura=findViewById(R.id.btnLecturas);
            btnVerbos=findViewById(R.id.btnVerbos);

    }
}
