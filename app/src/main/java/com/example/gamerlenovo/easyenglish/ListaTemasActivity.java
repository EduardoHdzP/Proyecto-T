package com.example.gamerlenovo.easyenglish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaTemasActivity extends AppCompatActivity {
    private ListView listViewTemas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_temas);
        Toast.makeText(getApplicationContext(),"1",Toast.LENGTH_LONG).show();
        listViewTemas=findViewById(R.id.listViewLTTemas);
        Toast.makeText(getApplicationContext(),"2",Toast.LENGTH_LONG).show();
        MyAdapter myAdapter=new MyAdapter(getApplicationContext(),R.layout.item_personalizado,dameTemas());
        Toast.makeText(getApplicationContext(),"3",Toast.LENGTH_LONG).show();
        listViewTemas.setAdapter(myAdapter);
        Toast.makeText(getApplicationContext(),"4",Toast.LENGTH_LONG).show();
    }


    public ArrayList<Tema> dameTemas(){
        ArrayList<Tema> temas=new ArrayList<>();
        temas.add(new Tema("Simple present","usa.gif","Tema de presente simple"));

        return temas;

    }

}
