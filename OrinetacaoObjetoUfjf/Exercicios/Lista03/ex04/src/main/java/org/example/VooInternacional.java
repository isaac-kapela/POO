package org.example;

import java.time.LocalDate;

public class VooInternacional extends Voo {

    private double fatorPreco;
    private double taxaCambio;

    public VooInternacional(String origem, String destino, double distancia, LocalDate data, double fatorPreco, double taxaCambio) {
        super(origem, destino, distancia, data);
        if (fatorPreco <= 0 || taxaCambio <= 0) {
            throw new IllegalArgumentException("Fator de preço ou taxa de câmbio inválida");
        }
        this.fatorPreco = fatorPreco;
        this.taxaCambio = taxaCambio;
    }

    public double getFatorPreco() {
        return fatorPreco;
    }

    public double getTaxaCambio() {
        return taxaCambio;
    }

    public double calcularPreco() {
        return (this.getDistancia() * fatorPreco) * taxaCambio;
    }
}
