package org.example;

public class Salario {

    private String nome;
    private double salario;
    private  double novoSalario;

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    private  double salarioLiquido;

    public String getNome() {
        return nome;
    }

    public Salario() {
        this.salario = 1000.0;
        this.novoSalario = 1150.00;
        this.salarioLiquido = salarioLiquido;
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

    public void calculaSalarioLiquido(double desconto, double horaExtra){
        if(horaExtra > 2){
            throw new IllegalArgumentException("so e permitido fazer 2h de horas extras");
        }
        if(horaExtra < 0){
            throw new IllegalArgumentException("não da pra lançar hora extra negativa");
        }
        if(desconto < 0){
            throw new IllegalArgumentException("não deve se lancar desconto negativo");
        }
        if(desconto > 80.00){
            throw  new IllegalArgumentException("Desconto muito alto para essa faixa salarial");
        }
        this.salarioLiquido = this.salario + ((this.salario / 220) * 1.5 * horaExtra) - desconto;
    }


}


