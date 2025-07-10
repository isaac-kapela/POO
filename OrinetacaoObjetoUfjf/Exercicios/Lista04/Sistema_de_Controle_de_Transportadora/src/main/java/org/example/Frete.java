package org.example;

public abstract class Frete {
    private Cliente cliente;
    private int numero;
    private double valor;

    public Frete(Cliente cliente, int numero, double valor) {
        this.cliente = cliente;
        this.numero = numero;
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public abstract double calcularValorTotal();

}
