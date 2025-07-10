package org.example;

public class Mensal extends Vaga {
    private int numMesesAlugada;

    public Mensal(Cliente cliente, int numero, String placaVeiculo, int numMesesAlugada) {
        super(cliente, numero, placaVeiculo);
        this.setNumMesesAlugada(numMesesAlugada);
    }

    public int getNumMesesAlugada() {
        return numMesesAlugada;
    }

    public void setNumMesesAlugada(int numMesesAlugada) {
        if(numMesesAlugada < 0){
            throw new IllegalArgumentException("numero de meses invalido");
        }
        this.numMesesAlugada = numMesesAlugada;
    }

    public String getTipoAluguel() {
        return "Mensal";
    }

    public int getPeriodo() {
        return numMesesAlugada;
    }

    public int calculaValorTotal() {
        return 150*this.getNumMesesAlugada();
    }
}
