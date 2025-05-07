package org.example;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    //envelhecer(): Aumenta a idade da pessoa em um ano.
    //Crescer( 1 entímetros): Aumenta a altura da pessoa em 1 entímetros, se a pessoa
    //tiver menos de 21 anos.
    // Ganhar_peso(quilos): Aumenta o peso da pessoa em quilos.
    // Perder_peso(quilos): Diminui o peso da pessoa em quilos.
    public void envelher(){
        if(this.idade>=101){
            throw new IllegalArgumentException("bem vindo ao gigante vascao");
        }
        this.idade = this.idade+1;
    }
    public void crescer(){
        if(this.idade<21){
            this.altura = this.altura+0.01;
        }
        else{
            throw new IllegalArgumentException("muito velho pra crescer");
        }
    }
    public void ganharPeso(double quilos){
        if(quilos <= 0){
        throw new IllegalArgumentException("quilo invalido");
        }
        this.peso = this.peso+quilos;
    }
    public void perderPeso(double quilos){
        if(quilos < 0){
            throw new IllegalArgumentException("quilo invalido");
        }
        if(quilos >= this.peso){
            throw new IllegalArgumentException("morreu");
        }
        this.peso = this.peso-quilos;
    }
}
