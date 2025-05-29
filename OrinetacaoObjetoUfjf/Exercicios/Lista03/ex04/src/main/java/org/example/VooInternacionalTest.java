package org.example;

import org.junit.Test;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class VooInternacionalTest {

    @Test
    public void deveCalcularPrecoComTaxaCambio() {
        VooInternacional voo = new VooInternacional("SP", "NY", 8000, LocalDate.now(), 0.3, 5.0);
        assertEquals(12000.0, voo.calcularPreco(), 0.001);
    }

    @Test
    public void deveLancarExcecaoTaxaOuFatorInvalido() {
        try {
            VooInternacional voo = new VooInternacional("SP", "NY", 8000, LocalDate.now(), 0, 4);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fator de preço ou taxa de câmbio inválida", e.getMessage());
        }
    }
}

