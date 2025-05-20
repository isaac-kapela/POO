package org.example;

public class Gerente extends Diretor{

    private double adicional;

    public Gerente(double salarioMensal, String nome, double adicional) {
        super(salarioMensal, nome);
        this.setAdicional(adicional);
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

   
}
