package org.example;

public abstract class Funcionario {
    private double salarioMensal;
    private String nome;

    public Funcionario(double salarioMensal, String nome) {
        this.salarioMensal = salarioMensal;
        this.nome = nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularPagamento();
}
