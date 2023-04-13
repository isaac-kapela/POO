package org.example;

public class Main {
    public static void main(String[] args) {
        inimigo inimigo1 = new inimigo();
        inimigo1.nome = "pedrinho coisa ruim";
        inimigo1.ataque = 5;

        inimigo inimigo2 = new inimigo();
        inimigo2.nome = "Mosquitao";
        inimigo2.ataque = 7;

        inimigo inimigo3 = new inimigo();
        inimigo3.nome ="lukinhas matador";
        inimigo3.ataque = 9;

        Mapa mapa = new Mapa();
        Mapa.nome = "Twin Wars";

        Mapa.inimigos.add(inimigo1);
        Mapa.inimigos.add(inimigo2);
        Mapa.inimigos.add(inimigo3);

        int getMaiorInimigos= 0;
        inimigo inimigoVencedor = Mapa.inimigos.get(getMaiorInimigos);


    }
}