package org.example;

public class Compra extends  Transacao{
    private int precoUnidade;
    private Fornecedor fornecedor;


    public Compra(String dataTransacao, int quant, Produto produto, int precoUnidade, Fornecedor fornecedor) {
        super(dataTransacao, quant, produto);
    }

    public void comprar(){
        
    }


}
