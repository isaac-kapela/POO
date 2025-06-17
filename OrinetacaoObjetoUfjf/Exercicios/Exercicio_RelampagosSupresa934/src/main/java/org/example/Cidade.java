package org.example;

public class Cidade {
    private String nome;
    private Estado estado;

    public Cidade(String nome, Estado estado) {
        this.setNome(nome);
        this.setEstado(estado);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Toda cidade precisa ter um nome ");
        }
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        if (estado == null) {
            throw new IllegalArgumentException("Toda cidade precisa de um estado");
        }
        this.estado = estado;
    }
}
