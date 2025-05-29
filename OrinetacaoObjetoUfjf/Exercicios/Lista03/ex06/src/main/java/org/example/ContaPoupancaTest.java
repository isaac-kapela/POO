package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ContaPoupancaTest {

    @Test
    public void deveAplicarJurosSobreSaldo() {
        ContaPoupanca conta = new ContaPoupanca("Isaac", 1000.0, 0.1);
        assertEquals(1100.0, conta.calcularSaldoFinal(), 0.001);
    }

    @Test
    public void deveLancarExcecaoJurosNegativo() {
        try {
            ContaPoupanca conta = new ContaPoupanca("Isaac", 800.0, -0.05);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Taxa de juros inválida", e.getMessage());
        }
    }
}
