package org.example;

public abstract class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo inicial inválido");
        }
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract double calcularSaldoFinal();
}
