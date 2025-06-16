package org.example;

public class Funcionario {
    private String nome;
    private String cargo;
    private Escolaridade nivelEnsino;

    public Funcionario(String nome, String cargo, Escolaridade nivelEnsino) {
        this.nome = nome;
        this.cargo = cargo;
        this.nivelEnsino = nivelEnsino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Escolaridade getNivelEnsino() {
        return nivelEnsino;
    }

    public void setNivelEnsino(Escolaridade nivelEnsino) {
        this.nivelEnsino = nivelEnsino;
    }

    public String getEscolaridadePresida(){
        return this.nivelEnsino.getEscolaridade();
    }
}
