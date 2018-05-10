package com.example.gamerlenovo.easyenglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnA1;
    private Button btnA2;
    private Button btnB1;
    private Button btnB2;
    private Button btnC1;
    private Button btnC2;

    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hacerReferencias();
        btnA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(getApplicationContext(),NivelActivity.class);
                intent.putExtra("nivel","A1");
                startActivity(intent);

            }
        });

        btnA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(getApplicationContext(),NivelActivity.class);
                intent.putExtra("nivel","A2");
                startActivity(intent);
            }
        });
        btnB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(getApplicationContext(),NivelActivity.class);
                intent.putExtra("nivel","B1");
                startActivity(intent);
            }
        });

        btnB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(getApplicationContext(),NivelActivity.class);
                intent.putExtra("nivel","B2");
                startActivity(intent);
            }
        });

        btnC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(getApplicationContext(),NivelActivity.class);
                intent.putExtra("nivel","C1");
                startActivity(intent);
            }
        });

        btnC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(getApplicationContext(),NivelActivity.class);
                intent.putExtra("nivel","C2");
                startActivity(intent);
            }
        });
    }



    public void hacerReferencias(){
        btnA1=findViewById(R.id.btnA1);
        btnA2=findViewById(R.id.btnA2);
        btnB1=findViewById(R.id.btnB1);
        btnB2=findViewById(R.id.btnB2);
        btnC1=findViewById(R.id.btnC1);
        btnC2=findViewById(R.id.btnC2);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Toast.makeText(getApplicationContext(),"Ajustes",Toast.LENGTH_LONG).show();
        }else if (id==R.id.action_about){
            Toast.makeText(getApplicationContext(),"Easy English 1.0",Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
