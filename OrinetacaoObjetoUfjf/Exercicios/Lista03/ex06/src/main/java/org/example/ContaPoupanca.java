package org.example;

public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(String titular, double saldo, double taxaJuros) {
        super(titular, saldo);
        if (taxaJuros < 0) {
            throw new IllegalArgumentException("Taxa de juros inválida");
        }
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public double calcularSaldoFinal() {
        return this.getSaldo() * (1 + taxaJuros);
    }
}
