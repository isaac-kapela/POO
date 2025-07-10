package org.example;

public class Monitor extends Manutencao {
    private double maoDeObra;

    public Monitor(int numero, Cliente cliente, double maoDeObra) {
        super(numero, cliente);
        this.maoDeObra = maoDeObra;
    }


    public double calcularValor() {
        return maoDeObra;
    }

    public String getTipo() {
        return "Monitor";
    }
}
