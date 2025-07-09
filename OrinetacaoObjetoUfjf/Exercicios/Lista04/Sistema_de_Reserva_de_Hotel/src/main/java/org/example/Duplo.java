package org.example;

public class Duplo extends  Reserva{
    private  int numRefeicao;

    public Duplo(Hospede hospede, int numDiasHospedagem, int numRefeicao) {
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
        return 80*getNumDiasHospedagem();
    }
}
