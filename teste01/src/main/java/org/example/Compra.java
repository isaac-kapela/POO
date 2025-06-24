package org.example;

public class Compra extends  Transacao{
    private int precoUnidade;
    private Fornecedor fornecedor;

    public Compra(String dataTransacao, Fornecedor fornecedor, int quant, Produto produto) {
        super(dataTransacao, quant, produto);
    }


    public void comprar(String dataTrasancao, Fornecedor fornecedor, int quantidadeCompra, int precoUnidade){

    }


}
