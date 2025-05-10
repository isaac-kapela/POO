package org.example;

public abstract class Pessoa {

    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        this.setNome(nome);
        this.setEmail(email);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
