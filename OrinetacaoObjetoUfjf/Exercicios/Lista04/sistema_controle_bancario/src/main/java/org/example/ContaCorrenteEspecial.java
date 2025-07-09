package org.example;

public class ContaCorrenteEspecial extends Conta{

    private double limiteCredito;

    public ContaCorrenteEspecial(Cliente cliente, int numero, double saldo, double limiteCredito) {
        super(cliente, numero, saldo);
        this.setLimiteCredito(limiteCredito);
    }


    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        if(limiteCredito < 0){
            throw new IllegalArgumentException("Limite invalido");
        }
        this.limiteCredito = limiteCredito;
    }
    public  double getSaldoTotal(){
        return this.getSaldo() + this.getLimiteCredito() ;
    }
}
