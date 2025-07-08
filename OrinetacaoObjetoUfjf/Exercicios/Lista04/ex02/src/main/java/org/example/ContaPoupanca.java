package org.example;

public class ContaPoupanca extends Conta{
    private double saldo;
    public ContaPoupanca(Cliente cliente, int numero) {
        super(cliente, numero);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
