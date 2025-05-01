package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SalarioTest {

    @Test
    public  void deveFazerAumento(){
        Salario salario = new Salario();
        salario.calculaAumento(15.0);
        assertEquals(1150.00, salario.getNovoSalario(), 0.0001);
    }

    @Test
    public void deveLancarExecaoAumentoInvalido(){
        try {
            Salario salario = new Salario();
            salario.calculaAumento(0);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Aumento invalido", e.getMessage());
        }
    }

    @Test
    public  void deveCalcularSalarioLiquido(){
        Salario salario = new Salario();
        salario.calculaSalarioLiquido(80.00, 2);
        assertEquals(933.64, salario.getSalarioLiquido(), 0.01);
    }

    public void (){

    }
}
