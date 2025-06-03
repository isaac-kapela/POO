package org.example;

public class Cordenador extends Pessoa{
   private Curso cordena;
   private  Escolaridade escolaridade;

    public Cordenador(String nome, int idade, Curso cordena, Escolaridade escolaridade) {
        super(nome, idade);
        this.setCordena(cordena);
        this.setEscolaridade(escolaridade);
    }

    public Curso getCordena() {
        return cordena;
    }

    public void setCordena(Curso cordena) {
        if(cordena == null){
            throw new IllegalArgumentException("pra ser cordenador temq cordenar um curso");
        }
        this.cordena = cordena;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getNomeEscolaridade(){
    }
}
