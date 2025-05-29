package org.example;

public class ProdutoRoupa extends Produto {

    public ProdutoRoupa(String nome, double precoBase) {
        super(nome, precoBase);
    }

    public double calcularPreco() {
        if (getPrecoBase() <= 0) {
            throw new IllegalArgumentException("Preço inválido");
        }
        return getPrecoBase() * 0.80;
    }
}
