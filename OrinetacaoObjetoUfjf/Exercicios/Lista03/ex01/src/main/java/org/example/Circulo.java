package org.example;

public class Circulo  extends FormaGeometrica{

    private double raio;

    public Circulo(String nome, double raio) {
        super(nome);
        setRaio(raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if(raio < 0){
            throw new IllegalArgumentException("Raio inválido");
        }
        this.raio = raio;
    }
    public  double calcularPerimetro(){
        return 2 * 3.14159265359  * this.getRaio();
    }
    public double calcularArea(){
        return    3.14159265359 * (this.getRaio() * this.getRaio());
    }
}
