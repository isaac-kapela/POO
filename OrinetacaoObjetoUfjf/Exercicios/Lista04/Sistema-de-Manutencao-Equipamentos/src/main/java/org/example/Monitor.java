package org.example;

public class Monitor extends Manutencao {
    private double maoDeObra;

    public Monitor(int numero, Cliente cliente, double maoDeObra) {
        super(numero, cliente);
        this.setMaoDeObra(maoDeObra);
    }

    public double getMaoDeObra() {
        return maoDeObra;
    }

    public void setMaoDeObra(double maoDeObra) {
        this.maoDeObra = maoDeObra;
    }

    public double calcularValor() {
        return maoDeObra;
    }

    public String getTipo() {
        return "Monitor";
    }
}
