package com.example.gamerlenovo.easyenglish;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter{
    private Context context;
    private int layout;
    private ArrayList<Tema> temas;
    private  Tema tema;

    public MyAdapter(Context context, int layout, ArrayList<Tema> temas) {
        this.context = context;
        this.layout = layout;
        this.temas = temas;
    }

    @Override
    public int getCount() {
        return this.temas.size();
    }

    @Override
    public Object getItem(int position) {
        return this.temas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;

        LayoutInflater layoutInflater=LayoutInflater.from(this.context);
        v=layoutInflater.inflate(R.layout.item_personalizado,null);

        tema=(Tema) getItem(position);

        TextView textViewTitulo=v.findViewById(R.id.textViewIPTitulo);
        TextView textViewDescripcion=v.findViewById(R.id.textViewIPDescripcion);
        ImageView imageView=v.findViewById(R.id.imageViewIPImagen);
        
        textViewTitulo.setText(tema.getTitulo());
        textViewDescripcion.setText(tema.getDescripcion());
        imageView.setImageResource(R.drawable.usa);
        return v;
    }
}
