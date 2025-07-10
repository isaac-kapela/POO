package org.example;

public class Semanal extends Vaga {
    private int numSemanasAlugadas;

    public Semanal(Cliente cliente, int numero, String placaVeiculo, int numSemanasAlugadas) {
        super(cliente, numero, placaVeiculo);
        this.setNumSemanasAlugadas(numSemanasAlugadas);
    }


    public int getNumSemanasAlugadas() {
        return numSemanasAlugadas;
    }

    public void setNumSemanasAlugadas(int numSemanasAlugadas) {
        if(numSemanasAlugadas < 0){
            throw new IllegalArgumentException("numero de semanas invalidos");
        }
        this.numSemanasAlugadas = numSemanasAlugadas;
    }

    public String getTipoAluguel() {
        return "Semanal";
    }

    public int getPeriodo() {
        return numSemanasAlugadas;
    }

    public int calculaValorTotal() {
        return 40*this.getNumSemanasAlugadas();
    }
}
