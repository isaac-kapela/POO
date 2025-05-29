package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ContaCorrenteTest {

    @Test
    public void deveCalcularSaldoComTaxa() {
        ContaCorrente conta = new ContaCorrente("Isaac", 1000.0, 50.0);
        assertEquals(950.0, conta.calcularSaldoFinal(), 0.001);
    }

    @Test
    public void deveLancarExcecaoTaxaNegativa() {
        try {
            ContaCorrente conta = new ContaCorrente("Isaac", 500.0, -10.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Taxa de manutenção inválida", e.getMessage());
        }
    }
}
