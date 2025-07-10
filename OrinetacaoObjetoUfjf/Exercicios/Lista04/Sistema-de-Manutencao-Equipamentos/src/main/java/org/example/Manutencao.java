package org.example;

public abstract class Manutencao {
    protected int numero;
    protected Cliente cliente;

    public Manutencao(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public abstract double calcularValor();
    public abstract String getTipo();
}
