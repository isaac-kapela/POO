package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CirculoTest {

    @Test
    public void deveCalcularPerimetro(){
        Circulo circulo = new Circulo("circulo 1", 7);
        circulo.calcularPerimetro();
        assertEquals(43.96, circulo.calcularPerimetro(), 0.03 );

    }
    @Test
    public void deveLancarExecaoRaioNegativo(){
        try{
            Circulo circulo = new Circulo("sla", -1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Raio inválido", e.getMessage());
        }
    }

    @Test
    public void deveCalcularArea(){
        Circulo circulo = new Circulo(" sla", 7);
        circulo.calcularArea();
        assertEquals(153.9384, circulo.calcularArea(), 0.03);
    }
}
