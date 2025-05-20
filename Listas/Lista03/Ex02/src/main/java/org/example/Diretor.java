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
        if(getSalarioMensal() <= 0 ){
            throw new IllegalArgumentException("salario invalido");
        }
        if(getBonus() <=0){
            throw new IllegalArgumentException("bonus invalido");
        }
        return  this.getSalarioMensal() * (getBonus() / 100);
    }


}
