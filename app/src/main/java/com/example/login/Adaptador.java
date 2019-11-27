package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adaptador extends BaseAdapter {

    Context contexto;
    ArrayList<Datos> ListaObjetos;

    public Adaptador(Context contexto, ArrayList<Datos> listaObjetos){
        this.contexto = contexto;
        ListaObjetos = listaObjetos;

    }

    @Override
    public int getCount() {
        return ListaObjetos.size();//cantidad de elementos en la lista
    }

    @Override
    public Object getItem(int position) {
        return ListaObjetos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return ListaObjetos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista= convertView;

        LayoutInflater inflate = LayoutInflater.from(contexto);
        vista = inflate.inflate(R.layout.itemlistview,null);

        ImageView  imagen = (ImageView) vista.findViewById(R.id.ImageView1);
        TextView Lamina = (TextView) vista.findViewById(R.id.Lamina);

        Lamina.setText(ListaObjetos.get(position).getLamina().toString());
        imagen.setImageResource(ListaObjetos.get(position).getImagen());
        return vista;
    }
}
