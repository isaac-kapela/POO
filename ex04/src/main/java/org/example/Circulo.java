package org.example;

public class Circulo {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public  double calcularPerimetro(){
        return 3.14159265359 * this.getRaio() * this.getRaio();
    }
    public double calcularArea(){
        return  2 * 3.14159265359 * this.getRaio();
    }
}
