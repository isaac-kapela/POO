package org.example;

public class CPU extends Manutencao {
    private double maoDeObra;
    private double valorPecas;

    public CPU(int numero, Cliente cliente, double maoDeObra, double valorPecas) {
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
        return "CPU";
    }
}
