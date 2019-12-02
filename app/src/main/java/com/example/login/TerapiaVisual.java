package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TerapiaVisual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terapia_visual);
    }

    public void EjercicioColores(View view){

        Intent EjercicioColores = new Intent(this, EjercicioColores.class);
        startActivity(EjercicioColores);
    }

    public void EjercicioNumeros(View view){

        Intent EjercicioNumeros = new Intent(this, EjercicioNumeros.class);
        startActivity(EjercicioNumeros);
    }
    public void Ejerciciolectura(View view){

        Intent Ejerciciolectura = new Intent(this, Ejerciciolectura.class);
        startActivity(Ejerciciolectura);
    }


}
