package org.example;

public class ProdutoLivro extends Produto {

    public ProdutoLivro(String nome, double precoBase) {
        super(nome, precoBase);
    }

    public double calcularPreco() {
        if (getPrecoBase() <= 0) {
            throw new IllegalArgumentException("Preço inválido");
        }
        return getPrecoBase() * 0.95;
    }
}
