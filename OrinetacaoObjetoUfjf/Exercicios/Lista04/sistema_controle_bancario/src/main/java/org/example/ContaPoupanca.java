package org.example;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente, int numero, double saldo) {
        super(cliente, numero, saldo);
    }

    public  double getSaldoTotal(){
        return this.getSaldo() ;
    }
}
