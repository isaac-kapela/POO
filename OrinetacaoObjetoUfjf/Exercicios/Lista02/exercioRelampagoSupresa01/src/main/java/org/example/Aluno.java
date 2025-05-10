package org.example;

public abstract class Aluno extends Pessoa{
    private int nota1;
    private int nota2;

    public Aluno(String nome, String email, int nota1, int nota2) {
        super(nome, email);
        this.nota1 = nota1;
        this.nota2 = nota2;

    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    public abstract String calcular();


}
