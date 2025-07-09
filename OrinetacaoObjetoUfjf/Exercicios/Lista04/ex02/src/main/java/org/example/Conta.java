package org.example;

public  abstract class Conta {
    private Cliente cliente;
    private int numero;
    private double saldo;

    public Conta(Cliente cliente, int numero, double saldo) {
        this.setCliente(cliente);
        this.setNumero(numero);
        this.setSaldo(saldo);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if(cliente == null){
            throw new IllegalArgumentException("Precisa de um cliente");
        }
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero < 0){
            throw new IllegalArgumentException("Numero invalido");
        }
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo<0){
            throw new IllegalArgumentException("saldo invalido");
        }
        this.saldo = saldo;
    }

    public abstract double getSaldoTotal();

}
