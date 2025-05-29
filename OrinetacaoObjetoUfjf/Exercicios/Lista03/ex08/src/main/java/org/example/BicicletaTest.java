package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BicicletaTest {
    @Test
    public void deveCalcularCustoBicicleta() {
        Bicicleta bicicleta = new Bicicleta("Caloi", "Elite", 2000);
        assertEquals(2100, bicicleta.calcularCusto(), 0.001);
    }
}
