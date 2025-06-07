package org.example.Classes;

import org.example.ClassePai.Pessoa;

public class Professor extends Pessoa {

    private Escolaridade nivelEnsino;

    public Professor(String nome, int idade, Escolaridade nivelEnsino, Cidade naturalidade) {
        super(nome, idade, naturalidade);
        this.setNivelEnsino(nivelEnsino);
    }

    public Escolaridade getNivelEnsino() {
        return nivelEnsino;
    }

    public void setNivelEnsino(Escolaridade nivelEnsino) {
        if(nivelEnsino == null){
            throw new IllegalArgumentException("Escolaridade invalida");
        }
        this.nivelEnsino = nivelEnsino;
    }

    public String getNomeEscolaridade(){
        return  this.nivelEnsino.getEscolaridade();
    }

    public  String getCidadeNascimentoProfessor(){
            return this.getNaturalidade().getNome();
    }

}
