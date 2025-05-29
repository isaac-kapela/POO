package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MotoTest {
    @Test
    public void deveCalcularCustoMoto() {
        Moto moto = new Moto("Honda", "CG 160", 15000);
        assertEquals(16500, moto.calcularCusto(), 0.001);
    }
}
