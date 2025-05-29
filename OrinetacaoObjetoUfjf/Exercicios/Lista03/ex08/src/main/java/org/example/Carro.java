package org.example;

public class Carro extends Veiculo {
    public Carro(String marca, String modelo, double precoBase) {
        super(marca, modelo, precoBase);
    }

    public double calcularCusto() {
        return getPrecoBase() * 1.2; // custo com 20% a mais
    }
}
