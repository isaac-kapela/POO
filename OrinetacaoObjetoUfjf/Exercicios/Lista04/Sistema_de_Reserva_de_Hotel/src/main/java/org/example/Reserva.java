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
        if(hospede == null){
            throw new IllegalArgumentException("precisa de hospede");
        }
        this.hospede = hospede;
    }

    public int getNumDiasHospedagem() {
        return numDiasHospedagem;
    }

    public void setNumDiasHospedagem(int numDiasHospedagem) {
        if(numDiasHospedagem < 1){
            throw new IllegalArgumentException("so da para marcar por dia");

        }
        this.numDiasHospedagem = numDiasHospedagem;
    }

    public abstract double calculaValor();


}
