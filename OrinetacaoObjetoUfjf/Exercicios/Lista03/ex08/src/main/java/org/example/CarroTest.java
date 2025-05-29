package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarroTest {
    @Test
    public void deveCalcularCustoCarro() {
        Carro carro = new Carro("Toyota", "Corolla", 50000);
        assertEquals(60000, carro.calcularCusto(), 0.001);
    }
}
