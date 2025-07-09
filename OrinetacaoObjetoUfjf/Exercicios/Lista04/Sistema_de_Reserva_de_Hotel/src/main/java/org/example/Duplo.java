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
        if(numRefeicao < 0){
            throw new  IllegalArgumentException("num de refeição invalida");
        }
        this.numRefeicao = numRefeicao;
    }
    public double calculaValor(){
        return  (80*this.getNumDiasHospedagem()) + (this.getNumRefeicao()*10);
    }
}
