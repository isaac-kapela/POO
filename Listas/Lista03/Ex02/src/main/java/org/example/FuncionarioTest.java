package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FuncionarioTest {

    @Test
    public void deveCalcularSalario(){
        FuncionarioComum funcionario = new FuncionarioComum(2000,"sla");
        assertEquals(2000, funcionario.calcularPagamento(),0.001);
    }

    @Test
    public void deveLancarExecao(){
        try{
            FuncionarioComum funcionario = new FuncionarioComum(-1, "sla");
            funcionario.calcularPagamento();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Salario Invalido", e.getMessage());
        }
    }
}
