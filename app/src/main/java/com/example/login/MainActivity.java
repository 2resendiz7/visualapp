package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void Ingresar (View view){

        Intent ingresar = new Intent(this, Main2Activity.class);
        startActivity(ingresar);
        //Toast.makeText(this, "test debug", Toast.LENGTH_LONG).show();
    }
}
