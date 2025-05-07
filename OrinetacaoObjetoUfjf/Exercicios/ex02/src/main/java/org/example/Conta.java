package org.example;

public class Conta {
    private String titular;
    private int numeroConta;
    private double saldo;

    public Conta(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(saldo<0){
            throw new IllegalArgumentException("não é possivel depositar 0 ou valores negativos");
        }
        if(saldo>=50.000){
            throw new IllegalArgumentException("Não é possivel fazer um deposito tão alto");
        }
        this.saldo = this.saldo+valor;
    }

    public void sacar(double valor){
        if(valor <=0){
            throw new IllegalArgumentException("não é possivel depositar 0 ou valores negativos");
        }
        if(valor > this.saldo){
            throw new IllegalArgumentException("saldo insuficiente");
        }
        if(this.saldo == 0){
            throw new IllegalArgumentException("saldo zerado não é possivel sacar");
        }
        this.saldo = this.saldo-valor;
    }

}
