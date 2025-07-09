package org.example;

public class ContaCorrente extends  Conta{

    public ContaCorrente(Cliente cliente, int numero, double saldo) {
        super(cliente, numero, saldo);
    }

    public  double getSaldoTotal(){
        return this.getSaldo() ;
    }

}
