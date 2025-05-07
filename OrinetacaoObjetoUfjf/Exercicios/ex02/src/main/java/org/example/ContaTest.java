package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ContaTest {

    @Test
    public void deveDepositar(){
        Conta conta = new Conta("isaac", 22222);
        conta.depositar(30.000);
        assertEquals(30.000, conta.getSaldo(), 0.001);
    }
    @Test
    public void deveLancarExecaoDepositoInvalido(){
        try{
        Conta conta = new Conta("isaac", 22222);
        conta.depositar(-1);
        fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("não é possivel depositar 0 ou valores negativos", e.getMessage());
        }
    }
}
