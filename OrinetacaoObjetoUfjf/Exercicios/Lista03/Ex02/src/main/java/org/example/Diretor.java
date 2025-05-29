package org.example;

public class Diretor extends Funcionario {
    private double lucroEmpresa;

    public Diretor(double salarioMensal, String nome, double lucroEmpresa) {
        super(salarioMensal, nome);
        this.lucroEmpresa = lucroEmpresa;
    }

    public double calcularPagamento() {
        if (getSalarioMensal() <= 2000) {
            throw new IllegalArgumentException("salario invalido");
        }
        return getSalarioMensal() + 0.1 * lucroEmpresa;
    }
}
