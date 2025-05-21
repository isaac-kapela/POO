package org.example;

public class Diretor extends Funcionario{
    private double bonus;

    public Diretor(double salarioMensal, String nome) {
        super(salarioMensal, nome);
        setBonus(10);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public  double calcularPagamento(){
        if(getSalarioMensal() <= 2000 ){
            throw new IllegalArgumentException("salario invalido");
        }


        return this.getSalarioMensal()+(this.getSalarioMensal() * (getBonus() / 100));
    }


}
