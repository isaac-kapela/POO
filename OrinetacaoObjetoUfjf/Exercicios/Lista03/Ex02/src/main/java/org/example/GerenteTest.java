package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class GerenteTest {

    @Test
    public void deveCalcularSalarioComAdicional() {
        Gerente gerente = new Gerente(3000, "Carlos", 500);
        assertEquals(3500, gerente.calcularPagamento(), 0.001);
    }

    @Test
    public void deveLancarExcecaoSalarioInvalido() {
        try {
            Gerente gerente = new Gerente(2000, "Carlos", 500);
            gerente.calcularPagamento();
            fail("Era esperado lançar IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("salario invalido", e.getMessage());
        }
    }
}
