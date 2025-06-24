package org.example;

public class Venda extends Transacao {
    private Cliente cliente;
    public Venda(String dataTransacao,  Cliente cliente, int quant, Produto produto) {
        super(dataTransacao, quant, produto);

    }
    public boolean vender(Produto produto, int quantidadeVendida){
       if( produto.verificarEstoqueInsuficiente(quantidadeVendida) == true){
e;
       }else{
           produto.debitarEstoque(quantidadeVendida);
           return false;

       }

    }
}
