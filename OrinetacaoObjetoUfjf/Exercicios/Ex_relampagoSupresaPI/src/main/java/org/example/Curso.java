package org.example;

public class Curso {

    private  String nome;
    private  Professor coordenador;

    public Curso(String nome, Professor coordenador) {
        this.setNome(nome);
        this.setCoordenador(coordenador);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        if(coordenador == null){
            throw new IllegalArgumentException("todo curso precisa de um coordernador ");
        }
        this.coordenador = coordenador;
    }



    public String getEscolaridadeCordenador(){
        return this.coordenador.getNivelEnsino().getEscolaridade();
    }

}
