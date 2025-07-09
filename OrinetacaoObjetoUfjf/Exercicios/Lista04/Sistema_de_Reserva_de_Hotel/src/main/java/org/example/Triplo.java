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
        if(numRefeicao < 0){
            throw new  IllegalArgumentException("num de refeição invalida");
        }
        this.numRefeicao = numRefeicao;
    }

    public double calculaValor(){
        return  (100*this.getNumDiasHospedagem()) + (this.getNumRefeicao()*10);
    }
}
