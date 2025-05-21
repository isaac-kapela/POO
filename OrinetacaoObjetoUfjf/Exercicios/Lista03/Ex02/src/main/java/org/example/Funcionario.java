package org.example;

public abstract class  Funcionario {

    private double  salarioMensal;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Funcionario(double salarioMensal, String nome){
        this.setSalarioMensal(salarioMensal);
        this.setNome(nome);
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public abstract double calcularPagamento();
}
