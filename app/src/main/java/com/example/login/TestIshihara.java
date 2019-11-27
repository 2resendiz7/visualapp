package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestIshihara extends AppCompatActivity {
    ListView Lista;
    ArrayList<Datos> ListaDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_ishihara);

        Lista = (ListView) findViewById(R.id.Lista);
        ListaDatos = new ArrayList<Datos>();

        ListaDatos.add(new Datos(1,"Lamina 1 ",R.drawable.laminauno));
        ListaDatos.add(new Datos(1,"Lamina 2 ",R.drawable.laminados));
        ListaDatos.add(new Datos(1,"Lamina 3 ",R.drawable.laminatres));
        ListaDatos.add(new Datos(1,"Lamina 4 ",R.drawable.laminacuatro));
        ListaDatos.add(new Datos(1,"Lamina 5 ",R.drawable.laminacinco));
        ListaDatos.add(new Datos(1,"Lamina 6 ",R.drawable.lainaseis));
        ListaDatos.add(new Datos(1,"Lamina 7 ",R.drawable.laminasiete));
        ListaDatos.add(new Datos(1,"Lamina 8 ",R.drawable.laminaocho));
        ListaDatos.add(new Datos(1,"Lamina 9 ",R.drawable.laminanueve));
        ListaDatos.add(new Datos(1,"Lamina 10 ",R.drawable.laminadiez));

        Adaptador eladaptador = new Adaptador(getApplicationContext(),ListaDatos);
        System.out.println("---------------------------------------------------------------------------"+ListaDatos.size());
        Lista.setAdapter(eladaptador);

        Lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Datos obj = (Datos) parent.getItemAtPosition(position);
                Intent paso = new Intent(getApplicationContext(), Detalle.class);
                paso.putExtra("Objeto",(Serializable)obj);
                startActivity(paso);

            }
        });


    }

}
