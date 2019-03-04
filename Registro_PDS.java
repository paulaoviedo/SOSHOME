package com.example.soshome;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Registro_PDS extends AppCompatActivity {
Spinner profeciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro__pds);
        profeciones=(Spinner) findViewById(R.id.profecion);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.Profeciones, android.R.layout.simple_spinner_item);
  profeciones.setAdapter(adapter);
    }

}
