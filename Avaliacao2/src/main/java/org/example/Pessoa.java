package org.example;

public abstract  class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("precisa de nome");
        }
        this.nome = nome;
    }
}
