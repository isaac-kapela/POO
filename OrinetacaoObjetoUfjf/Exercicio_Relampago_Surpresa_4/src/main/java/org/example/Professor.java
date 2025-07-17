package org.example;

public class Professor extends Pessoa{
    private Turma turma;

    public Professor(String nome, int idade, Turma turma) {
        super(nome, idade);
        this.setTurma(turma);
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
