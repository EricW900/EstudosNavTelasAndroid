package com.example.aplicacaoteste;

// Importações

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private ConstraintLayout mainLayout; // Isso é utilizado para a mudança de cores

    //Declaração de algumas variáveis
    private Button btn_aleatorio; // Variável cor aleatória
    private Button bt_tela2; // Variável para mudança da tela 1 para tela 2
    private Button bt_retornar; // Variável para retornar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Puxando dados para poder realizar a troca de cores do background de maneira aleatória
        mainLayout = findViewById(R.id.main_layout);
        btn_aleatorio = findViewById(R.id.btn_aleatorio);

        bt_tela2 = findViewById(R.id.bt_tela2); // Puxando o button tela2 do activity

        bt_retornar = findViewById(R.id.bt_retornar); // Mesma lógica do de cima, porém para retornar a tela anterior
        bt_retornar.setEnabled(false); // Desativar o button, pois não há mais telas para retornar

        bt_tela2.setOnClickListener(view -> { // Evento de clique para poder mudar de tela
            startActivity(new Intent(this, Tela2.class));
        });

        btn_aleatorio.setOnClickListener(new View.OnClickListener() { // Evento de clique para mudança de cor do Background
            @Override
            public void onClick(View v){

                // Aqui ele puxa a função de mudança da cor do background
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

    private void changeBackgroundColor() { // Para deixar a cor de fundo aleatória de acordo com o que o usuário for clicando
        Random random = new Random();
        // Gerar uma cor aleatória
        int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        mainLayout.setBackgroundColor(color);
    }
}