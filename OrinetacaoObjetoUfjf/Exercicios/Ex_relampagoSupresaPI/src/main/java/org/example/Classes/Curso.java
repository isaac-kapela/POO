package org.example.Classes;

public class Curso {

    private  String nome;
    private Professor coordenador;
    private Escola nomeEscola;

    public Curso(String nome, Professor coordenador, Escola nomeEscola) {
        this.setNome(nome);
        this.setCoordenador(coordenador);
        this.setNomeEscola(nomeEscola);
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

    public Escola getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(Escola nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getEscolaridadeCordenador(){
        return this.getCoordenador().getNivelEnsino().getEscolaridade();
    }

    public String getNomeCoordenador(){
        return this.coordenador.getNome();
    }

}
