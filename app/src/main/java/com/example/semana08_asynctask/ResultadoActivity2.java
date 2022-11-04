package com.example.semana08_asynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity2 extends AppCompatActivity {

    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado2);

        tvResultado = (TextView)findViewById(R.id.tvMensaje);
        String nombreUsuario = getIntent().getStringExtra("usuario");
        tvResultado.setText("Bienvenido: " + nombreUsuario);
    }
}