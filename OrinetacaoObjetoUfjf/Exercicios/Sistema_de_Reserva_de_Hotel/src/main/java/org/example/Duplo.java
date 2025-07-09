package org.example;

public class Duplo extends  Reserva{
    private  int numRefeicao;
    public Duplo(Hospede hospede, int numDiasHospedagem) {
        super(hospede, numDiasHospedagem);
    }

    public Duplo(Hospede hospede, int numDiasHospedagem, int numRefeicao) {
        super(hospede, numDiasHospedagem);
        this.numRefeicao = numRefeicao;
    }

    public int getNumRefeicao() {
        return numRefeicao;
    }

    public void setNumRefeicao(int numRefeicao) {
        this.numRefeicao = numRefeicao;
    }
}
