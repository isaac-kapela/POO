package org.example;

public class Retangulo extends  FormaGeometrica {

    private  double largura, altrura;

    public Retangulo( String nome, double largura, double altrura) {
        super(nome);
        this.setLargura(largura);
        this.setAltrura(altrura);
    }
    public double getLargura() {
        return largura;

    }
    public double getAltrura() {
        return altrura;

    }
    public void setLargura(double largura) {
        if(largura <0){
            throw new IllegalArgumentException("Largura invalida");
        }
        this.largura = largura;
    }


    public void setAltrura(double altrura) {
        if(altrura <0){
            throw new IllegalArgumentException("altura invalida");
        }
        this.altrura = altrura;
    }

    public double calcularArea() {
        return  this.getAltrura() * this.getLargura();

    }
    public double calcularPerimetro() {
        return (2 * (this.getAltrura() + this.getLargura()));

    }
}
