package org.example;

public abstract class Reserva {
    private  Hospede hospede;
    private int numDiasHospedagem;

    public Reserva(Hospede hospede, int numDiasHospedagem) {
        this.setHospede(hospede);
        this.setNumDiasHospedagem(numDiasHospedagem);
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public int getNumDiasHospedagem() {
        return numDiasHospedagem;
    }

    public void setNumDiasHospedagem(int numDiasHospedagem) {
        this.numDiasHospedagem = numDiasHospedagem;
    }
    public abstract double calculaValor();


}
