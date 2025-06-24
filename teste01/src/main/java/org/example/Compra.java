package org.example;
public class Compra extends Transacao {
    private double precoUnit;

    public Compra(String dataCompra, Produto produto, Fornecedor fornecedor, int qtdeCompra, double precoUnit) {
        super(dataCompra, produto, qtdeCompra);
        this.precoUnit = precoUnit;
        comprar(produto, qtdeCompra);
    }

    public void comprar(Produto produto, int qtdeCompra) {
        if (!produto.verificarEstoqueExcedente(qtdeCompra)) {
            throw new IllegalArgumentException("Compra excede o limite de estoque do produto.");
        }
        produto.creditarEstoque(qtdeCompra);
    }

    public double getPrecoUnit() {
        return precoUnit;
    }
}
