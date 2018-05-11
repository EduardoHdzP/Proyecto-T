package com.example.gamerlenovo.easyenglish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EjerciciosActivity extends AppCompatActivity {
    private TextView textViewNivel;
    private String nivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios);

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

    }


    public void hacerReferencias(){
        textViewNivel=findViewById(R.id.textViewNivelE);
    }
}
