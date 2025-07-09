package org.example;

public class Triplo extends Reserva {
    private  int numRefeicao;

    public Triplo(Hospede hospede, int numDiasHospedagem, int numRefeicao) {
        super(hospede, numDiasHospedagem);
        this.setNumRefeicao(numRefeicao);
    }

    public int getNumRefeicao() {
        return numRefeicao;
    }

    public void setNumRefeicao(int numRefeicao) {
        this.numRefeicao = numRefeicao;
    }

    public double calculaValor(){
        return 0;
    }
}
