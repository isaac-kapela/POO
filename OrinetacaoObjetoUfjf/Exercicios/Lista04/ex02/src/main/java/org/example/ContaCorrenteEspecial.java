package org.example;

public class ContaCorrenteEspecial extends Conta{
    private double saldo;
    protected double limiteCredito;

    public ContaCorrenteEspecial(Cliente cliente, int numero) {
        super(cliente, numero);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
