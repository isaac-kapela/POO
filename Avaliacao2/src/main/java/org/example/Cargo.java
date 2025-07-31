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
        if(salarioBruto < 0){
            throw new IllegalArgumentException("não pode ter salario negativo");
        }
        this.salarioBruto = salarioBruto;
    }
}
