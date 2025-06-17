package org.example;

public class Cidade {
    private String nome;
    private  Estado estado;

    public Cidade(String nome, Estado estado) {
        this.setNome(nome);
        this.setEstado(estado);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }


}
