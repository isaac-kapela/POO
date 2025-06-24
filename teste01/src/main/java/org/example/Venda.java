package org.example;

public class Venda extends Transacao {
    private Cliente cliente;

    public Venda(String dataVenda, Cliente cliente, Produto produto, int qtdeVendida) {
        super(dataVenda, produto, qtdeVendida);
        this.cliente = cliente;
        vender(produto, qtdeVendida);
    }

    public void vender(Produto produto, int qtdeVendida) {
        if (!produto.verificarEstoqueSuficiente(qtdeVendida)) {
            throw new IllegalArgumentException("Estoque insuficiente para realizar a venda.");
        }
        produto.debitarEstoque(qtdeVendida);
    }

    public Cliente getCliente() {
        return cliente;
    }
}
