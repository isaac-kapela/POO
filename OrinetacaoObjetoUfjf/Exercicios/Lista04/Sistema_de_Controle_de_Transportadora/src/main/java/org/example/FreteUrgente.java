package org.example;

public class FreteUrgente extends Frete{
    private double taxaEntrega;
    private int numItens;

    public FreteUrgente(Cliente frete, int numero, double valor, double taxaEntrega, int numItens) {
        super(frete, numero, valor);
        this.setTaxaEntrega(taxaEntrega);
        this.setNumItens(numItens);
        }
    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public int getNumItens() {
        return numItens;
    }

    public void setNumItens(int numItens) {
        this.numItens = numItens;
    }

    public double calcularValorTotal(){
        return (this.getValor()+this.getTaxaEntrega())+(10*this.getNumItens());
    }

}
