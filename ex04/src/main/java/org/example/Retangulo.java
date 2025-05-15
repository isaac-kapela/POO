package org.example;

public class Retangulo extends  FormaGeometrica {

    private  double largura, altrura;

    public Retangulo(double largura, double altrura) {
        this.largura = largura;
        this.altrura = altrura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltrura() {
        return altrura;
    }

    public double calcularArea() {
        return  this.getAltrura() * this.getLargura();

    }
    public double calcularPerimetro() {
        return 2 * (this.getAltrura() + this.getLargura());

    }
}
