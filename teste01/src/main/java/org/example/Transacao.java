package org.example;

public class Transacao {

    private String dataTransacao;
    private int quant;
    private Produto produto;

    public Transacao(String dataTransacao, int quant,Produto produto) {
        this.dataTransacao = dataTransacao;
        this.quant = quant;
    }

    public String getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(String dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
}
