package org.example;

import java.util.ArrayList;

public class Mapa {
    static String nome;
    int altura;
    int largura;
    static ArrayList<inimigo> inimigos = new ArrayList<>();

    public inimigo getMaiorInimigos() {
        int maiorAtaque = 0;
        int index = 0;
        for (int i = 0; i < inimigos.size(); i++){
            if (inimigos.get(i).ataque > maiorAtaque);{
                maiorAtaque = inimigos.get(i).ataque;
                index = i;
             }
        }
        return inimigos.get(index);
    }
}