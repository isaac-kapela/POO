package org.example;

public class Single extends Reserva {

    public Single(Hospede hospede, int numDiasHospedagem) {
        super(hospede, numDiasHospedagem);
    }

    public double calculaValor(){
        return 50*this.getNumDiasHospedagem();
    }

}
