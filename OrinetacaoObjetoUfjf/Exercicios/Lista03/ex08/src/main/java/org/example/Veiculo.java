package org.example;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private double precoBase;

    public Veiculo(String marca, String modelo, double precoBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precoBase = precoBase;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public abstract double calcularCusto();
}
