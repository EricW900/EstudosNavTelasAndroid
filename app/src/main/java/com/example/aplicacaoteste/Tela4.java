package com.example.aplicacaoteste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

/* Nesta classe não há muitas diferenças para a classe anterior, basicamente é uma lógica muito semelhante
    porém, com pequenas mudanças para dar prosseguimento ao aplicativo da maneira que ele foi idealizado, além do
    fato dela ser a última classe.
 */

public class Tela4 extends AppCompatActivity {

    private ConstraintLayout mainLayout;

    private Button btn_aleatorio;

    private Button bt_retornar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        bt_retornar = findViewById(R.id.bt_retornar); // Puxando o Button para retornar

        mainLayout = findViewById(R.id.main_layout);
        btn_aleatorio = findViewById(R.id.btn_aleatorio);

        bt_retornar.setOnClickListener(view -> { // Aqui é a função para ele retornar a tela anterior
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