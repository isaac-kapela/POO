package org.example;

public class Impressora extends Manutencao {
    private double maoDeObra;
    private double valorPecas;

    public Impressora(int numero, Cliente cliente, double maoDeObra, double valorPecas) {
        super(numero, cliente);
        this.setMaoDeObra(maoDeObra);
        this.setValorPecas(valorPecas);
    }

    public double getMaoDeObra() {
        return maoDeObra;
    }

    public void setMaoDeObra(double maoDeObra) {
        this.maoDeObra = maoDeObra;
    }

    public double getValorPecas() {
        return valorPecas;
    }

    public void setValorPecas(double valorPecas) {
        this.valorPecas = valorPecas;
    }

    public double calcularValor() {
        return maoDeObra + valorPecas;
    }

    public String getTipo() {
        return "Impressora";
    }
}
