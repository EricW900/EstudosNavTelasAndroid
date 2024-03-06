package com.example.aplicacaoteste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

/* Nesta classe não há muitas diferenças para a classe anterior, basicamente é uma lógica muito semelhante
    porém, com pequenas mudanças para dar prosseguimento ao aplicativo da maneira que ele foi idealizado
 */

public class Tela2 extends AppCompatActivity {

    private ConstraintLayout mainLayout;

    private Button bt_tela3;
    private Button bt_retornar;
    private Button btn_aleatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        bt_tela3 = findViewById(R.id.bt_tela3);
        bt_retornar = findViewById(R.id.bt_retornar);

        mainLayout = findViewById(R.id.main_layout);
        btn_aleatorio = findViewById(R.id.btn_aleatorio);

        bt_tela3.setOnClickListener(view -> {
            startActivity(new Intent(this, Tela3.class));
        });

        bt_retornar.setOnClickListener(view ->{ // Neste trecho ele retorna a classe anterior
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