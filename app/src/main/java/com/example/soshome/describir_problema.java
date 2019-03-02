package com.example.soshome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class describir_problema extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describir_problema);
    }
    public void siguienteatrabajador (View view) {

        Intent siguienteatrabajador = new Intent(this,describir_problema.class);
        startActivity(siguienteatrabajador);

    }
}
