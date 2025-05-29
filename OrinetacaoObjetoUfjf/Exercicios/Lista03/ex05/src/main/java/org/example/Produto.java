package org.example;

public abstract class Produto {
    private String nome;
    private double precoBase;

    public Produto(String nome, double precoBase) {
        if (precoBase <= 0) {
            throw new IllegalArgumentException("Preço base inválido");
        }
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public abstract double calcularPrecoFinal();
}
