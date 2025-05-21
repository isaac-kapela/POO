package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class DiretorTest {


    @Test
    public void deveCalcularSalario(){
        Diretor diretor = new Diretor(2000, "sla");
        assertEquals(2200, diretor.calcularPagamento(), 0.001);
    }

    @Test
    public void deveLancarExecaoPagamentoInvalido(){
        try {
            Diretor diretor = new Diretor(2000, "sla");
            diretor.calcularPagamento();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("salario invalido", e.getMessage());       }
    }

}
