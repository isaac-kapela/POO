package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CarroTest {

    @Test
  public void deveAcelerarCarro() {
        Carro carro = new Carro();
        carro.ligar();
        carro.acelerar(100);
        assertEquals(100, carro.getVelocidadeAtual());
    }

    @Test
    public void deveLancarExcecaoAceleracaoInvalida() {
        try {
            Carro carro = new Carro();
            carro.ligar();
            carro.acelerar(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Aceleracao invalida", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcecaoAcelerarCarroDesligado() {
        try {
            Carro carro = new Carro();
            carro.acelerar(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nao pode acelerar carro desligado", e.getMessage());
        }
    }

    @Test
    public void deveLigarCarroDesligado() {
        Carro carro = new Carro();
        carro.ligar();
        assertEquals(true, carro.isLigado());
    }

    @Test
    public void deveDesLigarCarroLigado() {
        Carro carro = new Carro();
        carro.ligar();
        carro.desligar();
        assertEquals(false, carro.isLigado());
        assertEquals(0, carro.getVelocidadeAtual());
    }

    @Test
    public void deveLancarExcecaoLigarCarroLigado() {
        try {
            Carro carro = new Carro();
            carro.ligar();
            carro.ligar();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nao pode ligar carro ligado", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcecaoDesLigarCarroDesligado() {
        try {
            Carro carro = new Carro();
            carro.desligar();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nao pode desligar carro desligado", e.getMessage());
        }
    }

    @Test
    public void deveFrearCarro() {
        Carro carro = new Carro();
        carro.ligar();
        carro.acelerar(100);
        carro.frear(100);
        assertEquals(0, carro.getVelocidadeAtual());
    }

    @Test
    public void deveLancarExcecaoFrearAlemVelocidadeAtual() {
        try {
            Carro carro = new Carro();
            carro.ligar();
            carro.acelerar(100);
            carro.frear(101);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nao pode frear alem da velocidade atual", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcecaoFrenagemInvalida() {
        try {
            Carro carro = new Carro();
            carro.ligar();
            carro.frear(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Frenagem invalida", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcecaoFrearCarroDesligado() {
        try {
            Carro carro = new Carro();
            carro.frear(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nao pode frear carro desligado", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcecaoDesligarCarroMovimento() {
        try {
            Carro carro = new Carro();
            carro.ligar();
            carro.acelerar(100);
            carro.desligar();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nao pode desligar carro em movimento", e.getMessage());
        }
    }

}