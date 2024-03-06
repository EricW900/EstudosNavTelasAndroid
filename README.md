# Estudo Android: Transição de Telas
Desenvolvido no Android Studio para aprendizado em mobile, este projeto prioriza a exploração de conceitos essenciais, destacando a navegação fluida entre quatro telas e a capacidade de mudar dinamicamente o plano de fundo.

# Código para Cores Aleatórias
Para habilitar cores aleatórias, utilizamos o seguinte código:

```
private void changeBackgroundColor() { // Para deixar a cor de fundo aleatória de acordo com o que o usuário for clicando
        Random random = new Random();
        // Gerar uma cor aleatória
        int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        mainLayout.setBackgroundColor(color);
```

Esse código gera uma cor RGB aleatória cada vez que o botão "Aleatório" é acionado, criando uma experiência visual dinâmica e tornando a interação mais envolvente.

# Resultado final

![print_1](https://github.com/EricW900/EstudosNavTelasAndroid/assets/113937150/705d4bb0-36bd-4dee-b443-93e8d719df9e)
