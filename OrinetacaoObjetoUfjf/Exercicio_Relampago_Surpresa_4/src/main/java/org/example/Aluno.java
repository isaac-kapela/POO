package org.example;

public class Aluno extends Pessoa{
    private Turma turma;
    private Curso curso;

    public Aluno(String nome, int idade, Turma turma) {
        super(nome, idade);
        this.setTurma(turma);
        this.setCurso(curso);

    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
