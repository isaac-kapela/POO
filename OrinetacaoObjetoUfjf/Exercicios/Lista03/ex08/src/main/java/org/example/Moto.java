package org.example;

public class Moto extends Veiculo {
    public Moto(String marca, String modelo, double precoBase) {
        super(marca, modelo, precoBase);
    }

    public double calcularCusto() {
        return getPrecoBase() * 1.1; // custo com 10% a mais
    }
}
