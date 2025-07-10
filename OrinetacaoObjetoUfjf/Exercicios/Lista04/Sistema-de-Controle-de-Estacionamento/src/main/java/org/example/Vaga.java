package org.example;

public abstract class Vaga {
    private Cliente cliente;
    private int numero;
    private String placaVeiculo;

    public Vaga(Cliente cliente, int numero, String placaVeiculo) {
        this.setCliente(cliente);
        this.setNumero(numero);
        this.setPlacaVeiculo(placaVeiculo);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if(cliente == null){
            throw new IllegalArgumentException("Cliente invalido");
        }
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero < 0){
            throw new IllegalArgumentException("numero invalido");
        }
        this.numero = numero;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }


    public void setPlacaVeiculo(String placaVeiculo) {
        if(placaVeiculo ==null|| placaVeiculo.trim().isEmpty()){
            throw new IllegalArgumentException("placa invalida");
        }
        this.placaVeiculo = placaVeiculo;
    }

    public abstract String getTipoAluguel();
    public abstract int getPeriodo();
    public abstract int calculaValorTotal();




}
