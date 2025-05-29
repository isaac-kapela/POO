package org.example;

import java.time.LocalDate;

public abstract class Voo {
    private String origem;
    private String destino;
    private double distancia;
    private LocalDate data;

    public Voo(String origem, String destino, double distancia, LocalDate data) {
        if (distancia <= 0) {
            throw new IllegalArgumentException("Distância inválida");
        }
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.data = data;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public LocalDate getData() {
        return data;
    }

    public abstract double calcularPreco();
}
