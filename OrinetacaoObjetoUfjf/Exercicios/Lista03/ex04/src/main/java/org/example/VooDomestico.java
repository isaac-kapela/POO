package org.example;

import java.time.LocalDate;

public class VooDomestico extends Voo {

    private double fatorPreco;

    public VooDomestico(String origem, String destino, double distancia, LocalDate data, double fatorPreco) {
        super(origem, destino, distancia, data);
        if (fatorPreco <= 0) {
            throw new IllegalArgumentException("Fator de preço inválido");
        }
        this.fatorPreco = fatorPreco;
    }

    public double getFatorPreco() {
        return fatorPreco;
    }

    public double calcularPreco() {
        return this.getDistancia() * fatorPreco;
    }
}
