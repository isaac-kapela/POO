package org.example;

public class Salario {

    private String nome;
    private double salario;
    private  double novoSalario;



    public String getNome() {
        return nome;
    }

    public Salario() {
        this.salario = 1000.0;
        this.novoSalario = 1150.00;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



    public double getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }

    public  void calculaAumento(double aumento){
        if(aumento <= 0){
            throw  new IllegalArgumentException("Aumento invalido");
        }
        this.novoSalario = this.salario * (1 + aumento/100);
    }
}


