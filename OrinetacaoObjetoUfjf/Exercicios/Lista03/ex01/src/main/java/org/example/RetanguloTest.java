package org.example;

import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class RetanguloTest {

    @Test
    public void deveCalcularArea(){
        Retangulo retangulo = new Retangulo("aaa", 5, 10);
        retangulo.calcularArea();
        assertEquals(50, retangulo.calcularArea(), 0.03);
    }
    @Test
    public void deveLancarExecaoAlturaInvalida() {
        try {
            Retangulo retangulo = new Retangulo("sla", 5, -10);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("altura invalida", e.getMessage());
        }
    }
        @Test
        public void deveLancarExecaoLarguraInvalida() {
            try {
                Retangulo retangulo = new Retangulo("sla", -5, 10);
                fail();
            } catch (IllegalArgumentException e) {
                assertEquals("Largura invalida", e.getMessage());
            }
        }
    @Test
    public void deveCalcularPerimetro(){
        Retangulo retangulo = new Retangulo("aaa", 5, 10);
        retangulo.calcularPerimetro();
        assertEquals(30, retangulo.calcularPerimetro(), 0.03);
        }
    }





