package org.example;

public class Disciplina {
    private Turma turma;
    private String nome;

    public Disciplina() {
        this.setTurma(turma);
        this.setNome(nome);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
