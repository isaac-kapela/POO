package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImcTest {

    @Test
    public void deveCalcularImc(){
        Imc imc = new Imc();
        imc.calculaImc("F", 60, 1.60);
        assertEquals(23.4375, imc.getImc(), 0.01);
    }
}
