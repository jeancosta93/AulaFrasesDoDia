package com.jeancosta.aulafrasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    String[] frases = {
            "frase 01",
            "frase 02",
            "frase 03",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrases(View view){

        TextView texto = findViewById(R.id.textResultado);
        int numeroAleatorio = new Random().nextInt(3);
        String frase = frases[numeroAleatorio];

        texto.setText(frase);

    }

    public void exibirTodas(View view){

        TextView texto = findViewById(R.id.textResultado);

        String textoResultado = "";
        for (String frase : frases){
            textoResultado = textoResultado + frase + "\n";
        }

        texto.setText(textoResultado);


    }
}