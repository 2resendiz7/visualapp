package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalle extends AppCompatActivity {

    ImageView foto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        foto =(ImageView) findViewById(R.id.ImgFoto);

        Datos obj = (Datos)getIntent().getExtras().getSerializable("Objeto");

        foto.setImageResource(obj.getImagen());

    }
}
