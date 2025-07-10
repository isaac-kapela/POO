package org.example;

public abstract class Manutencao {
    protected int numero;
    protected Cliente cliente;

    public Manutencao(int numero, Cliente cliente) {
        this.setNumero(numero);
        this.setCliente(cliente);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public abstract double calcularValor();
    public abstract String getTipo();
}
