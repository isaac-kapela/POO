package org.example;

public class Main {
    public static void main(String[] args) {
        Inimigo inimigo01 = new Inimigo(" joazinh", 2000,20,70);
        Inimigo inimigo02 = new Inimigo("pedrinho matador",555,10,40);
        Inimigo inimigo03 = new Inimigo("vim diesel",10,5,50);

        Heroi heroi01 = new Heroi("Miranha",400,50,100);
        Heroi heroi02 = new Heroi("Caneta azul",7000,25,1000);
        Heroi heroi03 = new Heroi("Naldo",400,25,1000);

        Mapa mapa = new Mapa("são paulo", 15,30);
        mapa.getInimigos().add(inimigo01);
        mapa.getInimigos().add(inimigo02);
        mapa.getInimigos().add(inimigo03);
        mapa.getHerois().add(heroi01);
        mapa.getHerois().add(heroi02);
        mapa.getHerois().add(heroi03);

        Inimigo inimigoMaiorAtaque = mapa.getInimigoMaiorAtaque();
        Object heroiMaiorAtaque = mapa.getHeroiMaiorAtaque();

        System.out.println("Inimigo " + inimigoMaiorAtaque.getNome() + " deu maior ataque de: " +
                "\n" + inimigoMaiorAtaque.getAtaque());
        System.out.println("Heroi " + heroiMaiorAtaque.getClass() + " deu maior ataque de: " +
                "\n" + heroiMaiorAtaque.getClass());
    }
}