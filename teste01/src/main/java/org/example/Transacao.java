package org.example;

public class Transacao {
    private String dataTransacao;
    private int qtde;

    public Transacao(String dataTransacao, Produto produto, int qtde) {
        this.dataTransacao = dataTransacao;
        this.qtde = qtde;
        produto.registrarHistorico(this);
    }

    public String getDataTransacao() {
        return dataTransacao;
    }

    public int getQtde() {
        return qtde;
    }
}
