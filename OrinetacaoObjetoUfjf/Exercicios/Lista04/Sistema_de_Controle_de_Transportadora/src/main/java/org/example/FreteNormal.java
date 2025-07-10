package org.example;

public class FreteNormal extends Frete{

    public FreteNormal(Cliente frete, int numero, double valor, double taxaEntrega) {
        super(frete, numero, valor);
    }

    public double calcularValorTotal(){
        return  this.getValor();
    }


}
