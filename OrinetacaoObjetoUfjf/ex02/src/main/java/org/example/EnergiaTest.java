package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class EnergiaTest {

@Test
    public void deveCalcularValorPago(){
        Energia energia = new Energia();
        energia.calculaValorQuilowatt(5);
        assertEquals(0.708 , energia.getValorSerPago(), 0.001);
    }

    @Test
    public void deveLancarExecaoValorNegativoQuantQuilowatt(){
        try {
            Energia energia = new Energia();
            energia.calculaValorQuilowatt(-1);
            fail();
         }
        catch (IllegalArgumentException e){
            assertEquals("a quantidade de quilowatt não pode ser negativa", e.getMessage());
        }
    }

}
