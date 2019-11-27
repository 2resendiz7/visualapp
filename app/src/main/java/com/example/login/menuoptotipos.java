package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class menuoptotipos extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuoptotipos);
    }

    public void snellen (View view){

        Intent snellen = new Intent (this, snellen.class);
        startActivity(snellen);
    }

    public void egiratoria(View view){

        Intent egira = new Intent (this, egiratoria.class);
        startActivity(egira);
    }


    public void Lea (View view){

        Intent lea = new Intent (this, Lea.class);
        startActivity(lea);
    }

    public  void TestIshihara (View view){

        Intent Ishihara = new Intent(this, TestIshihara.class);
        startActivity(Ishihara);
    }
}
