package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ContaTest {

    @Test
    public void deveDepositar(){
        Conta conta = new Conta("isaac", 22222);
        conta.depositar(100);
        assertEquals(200, conta.getSaldo(), 0.001);
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
    @Test
    public void deveLancarExecaoDepositoAlto(){
        try{
            Conta conta = new Conta("isaac", 2323);
            conta.depositar(50.001);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Não é possivel fazer um deposito tão alto", e.getMessage());
        }
    }

    @Test
    public void deveSacar(){
        Conta conta = new Conta("isaac", 3422);
        conta.sacar(60);
        assertEquals(40, conta.getSaldo(),0.001);
    }
    @Test
    public void deveLancarExecaoSaqueInvalido(){
        try{
            Conta conta = new Conta("Isaac", 123);
            conta.sacar(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("não é possivel depositar 0 ou valores negativos", e.getMessage());
        }
    }
    @Test
    public void deveLancarExecaoSaqueAlto(){
        try{
            Conta conta = new Conta("sla", 4310);
            conta.sacar(200);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("saldo insuficiente", e.getMessage());
        }
    }
    @Test
    public void deveLancarExecaoSaldoZerado(){
        try {
            Conta conta = new Conta("sla", 65432);
            conta.sacar(100);
            conta.sacar(50);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("saldo insuficiente", e.getMessage());
        }
    }
}
