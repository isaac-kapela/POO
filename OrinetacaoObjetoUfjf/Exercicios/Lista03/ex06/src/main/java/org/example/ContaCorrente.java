package org.example;

public class ContaCorrente extends ContaBancaria {
    private double taxaManutencao;

    public ContaCorrente(String titular, double saldo, double taxaManutencao) {
        super(titular, saldo);
        if (taxaManutencao < 0) {
            throw new IllegalArgumentException("Taxa de manutenção inválida");
        }
        this.taxaManutencao = taxaManutencao;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public double calcularSaldoFinal() {
        return this.getSaldo() - taxaManutencao;
    }
}
