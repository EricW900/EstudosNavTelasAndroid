package com.example.aplicacaoteste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

/* Nesta classe não há muitas diferenças para as classes anteriores, basicamente é uma lógica muito semelhante
    porém, com pequenas mudanças para dar prosseguimento ao aplicativo da maneira que ele foi idealizado
 */

public class Tela3 extends AppCompatActivity {

    private ConstraintLayout mainLayout;

    private Button btn_aleatorio;

    private Button bt_tela4;
    private Button bt_retornar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        bt_tela4 = findViewById(R.id.bt_tela4);
        bt_retornar = findViewById(R.id.bt_retornar);

        mainLayout = findViewById(R.id.main_layout);
        btn_aleatorio = findViewById(R.id.btn_aleatorio);

        bt_tela4.setOnClickListener(view -> {
            startActivity(new Intent(this, Tela4.class));
        });

        bt_retornar.setOnClickListener(view -> {
            finish();
        });

        btn_aleatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                changeBackgroundColor();
            }
        });
    }

    public void setCorVerde(View view) { // Para deixar a cor de fundo de verde
        mainLayout.setBackgroundColor(getResources().getColor(R.color.green));
    }

    public void setCorVermelho(View view) { // Para deixar a cor de fundo de vermelho
        mainLayout.setBackgroundColor(getResources().getColor(R.color.red));
    }

    public void setCorAzul(View view) { // Para deixar a cor de fundo de azul
        mainLayout.setBackgroundColor(getResources().getColor(R.color.blue));
    }

    private void changeBackgroundColor() {
        Random random = new Random();
        // Gerar uma cor aleatória
        int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        mainLayout.setBackgroundColor(color);
    }
}