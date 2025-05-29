package org.example;

public class Bicicleta extends Veiculo {
    public Bicicleta(String marca, String modelo, double precoBase) {
        super(marca, modelo, precoBase);
    }

    public double calcularCusto() {
        return getPrecoBase() * 1.05; // custo com 5% a mais
    }
}
