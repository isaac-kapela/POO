package org.example;

public class ProdutoEletronico extends Produto {
    private double taxaImposto;

    public ProdutoEletronico(String nome, double precoBase, double taxaImposto) {
        super(nome, precoBase);
        if (taxaImposto < 0) {
            throw new IllegalArgumentException("Taxa de imposto inválida");
        }
        this.taxaImposto = taxaImposto;
    }

    public double getTaxaImposto() {
        return taxaImposto;
    }

    public double calcularPrecoFinal() {
        return this.getPrecoBase() * (1 + taxaImposto);
    }
}
