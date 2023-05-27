package org.example;

import java.util.ArrayList;

public class Mapa {
    private String nome;
    private int altura;
    private int largura;
    private ArrayList<Inimigo> inimigos = new ArrayList<>();
    private ArrayList<Heroi> herois = new ArrayList<>();

    public Mapa(){}

    public Mapa(String nome, int altura, int largura) {
        this.nome = nome;
        this.altura = altura;
        this.largura = largura;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return this.largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public ArrayList<Inimigo> getInimigos(){
        return this.inimigos;
    }

    public void setInimigos(ArrayList<Inimigo> inimigos){
        this.inimigos = inimigos;
    }

    public ArrayList<Heroi> getHerois(){
        return this.herois;
    }

    public void setHerois(ArrayList<Heroi> herois){
        this.herois = herois;
    }

    public Inimigo getInimigoMaiorAtaque() {
        int maiorAtaque = 0;
        int index = 0;
        for (int i = 0; i < inimigos.size(); i++) {
            if (inimigos.get(i).getAtaque() > maiorAtaque) {
                maiorAtaque = inimigos.get(i).getAtaque();
                index = i;
            }
        }
        return inimigos.get(index);
    }

    public <Heroi> Heroi getHeroiMaiorAtaque() {
        int maiorAtaque = 0;
        int index = 0;
        for (int i = 0; i < herois.size(); i++) {
            if (herois.get(i).getAtaque() > maiorAtaque) {
                maiorAtaque = herois.get(i).getAtaque();
                index = i;
            }
        }
        return (Heroi) herois.get(index);
    }
}