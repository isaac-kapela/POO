package org.example;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Testes {

    @Test
    public void deveResumoReserva() {
        ArrayList<Reserva> reservas = new ArrayList<>();
        Hospede hospede = new Hospede("isaac", 123, reservas);
        Single single = new Single(hospede, 3);
        Duplo duplo = new Duplo(hospede,4 , 2);
        Triplo triplo = new Triplo(hospede, 2, 4);
        reservas.add(single);
        reservas.add(duplo);
        reservas.add(triplo);

        ArrayList<String> resumoReservas = hospede.consultarResumoReservas();
        assertEquals(3, resumoReservas.size());
        assertEquals("Tipo: Single | Dias: 3 | Valor: R$ 150.0", resumoReservas.get(0));
        assertEquals("Tipo: Duplo | Dias: 4 | Valor: R$ 340.0", resumoReservas.get(1));
        assertEquals("Tipo: Triplo | Dias: 2 | Valor: R$ 240.0", resumoReservas.get(2));

    }
    @Test
    public void deveConsultarReservaHospede() {
        ArrayList<Reserva> reservas = new ArrayList<>();
        Hospede hospede = new Hospede("isaac", 123, reservas);
        Single single = new Single(hospede, 3);
        Duplo duplo = new Duplo(hospede,4 , 2);
        Triplo triplo = new Triplo(hospede, 2, 4);
        reservas.add(single);
        reservas.add(duplo);
        reservas.add(triplo);

        ArrayList<Reserva> reservasHospede = hospede.consultarReservas();
        assertEquals(3, reservasHospede.size());
        assertEquals(hospede, reservasHospede.get(0).getHospede());
        assertEquals(3, reservasHospede.get(0).getNumDiasHospedagem(),0.01);



    }
}
