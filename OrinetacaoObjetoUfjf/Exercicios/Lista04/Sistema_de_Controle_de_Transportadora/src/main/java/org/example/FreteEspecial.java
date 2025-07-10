package org.example;

public class FreteEspecial extends Frete{
    private double taxaEntrega;

    public FreteEspecial(Cliente frete, int numero, double valor, double taxaEntrega) {
        super(frete, numero, valor);
        this.setTaxaEntrega(taxaEntrega);
    }


    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }
    public  double calcularValorTotal(){
        return this.getValor()+this.getTaxaEntrega();
    }

}
