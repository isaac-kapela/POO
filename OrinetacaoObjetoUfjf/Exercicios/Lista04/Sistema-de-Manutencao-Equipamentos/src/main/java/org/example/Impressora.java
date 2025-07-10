package org.example;

public class Impressora extends Manutencao {
    private double maoDeObra;
    private double valorPecas;

    public Impressora(int numero, Cliente cliente, double maoDeObra, double valorPecas) {
        super(numero, cliente);
        this.maoDeObra = maoDeObra;
        this.valorPecas = valorPecas;
    }

    public double calcularValor() {
        return maoDeObra + valorPecas;
    }

    public String getTipo() {
        return "Impressora";
    }
}
