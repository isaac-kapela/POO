package org.example;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(double salarioMensal, String nome, double bonus) {
        super(salarioMensal, nome);
        this.bonus = bonus;
    }

    public double calcularPagamento() {
        if (getSalarioMensal() <= 0) {
            throw new IllegalArgumentException("Salario Invalido");
        }
        return getSalarioMensal() + bonus;
    }
}
