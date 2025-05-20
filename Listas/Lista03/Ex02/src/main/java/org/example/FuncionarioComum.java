package org.example;

public class FuncionarioComum extends Funcionario{


    public FuncionarioComum(double salarioMensal, String nome) {
        super(salarioMensal, nome);
    }


    public double calcularPagamento() {
        if(this.getSalarioMensal() <= 0){
            throw new IllegalArgumentException("Salario Invalido");
        }
        return this.getSalarioMensal();
    }
}
