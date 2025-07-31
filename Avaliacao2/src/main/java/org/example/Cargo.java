package org.example;

public class Cargo {
    private double salarioBruto;

    public Cargo(double salarioBruto) {
        this.setSalarioBruto(salarioBruto);
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {

        this.salarioBruto = salarioBruto;
    }
}
