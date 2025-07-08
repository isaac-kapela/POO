package org.example;

public class ContaCorrente extends  Conta{
    private double saldo;

    public ContaCorrente(Cliente cliente, int numero) {
        super(cliente, numero);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
