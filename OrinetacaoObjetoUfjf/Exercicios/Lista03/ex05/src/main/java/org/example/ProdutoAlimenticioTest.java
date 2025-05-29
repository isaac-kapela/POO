package org.example;

import org.junit.Test;
import java.time.LocalDate;

import static org.junit.Assert.*;

public class ProdutoAlimenticioTest {

    @Test
    public void deveAplicarDescontoSeProximoDaValidade() {
        ProdutoAlimenticio produto = new ProdutoAlimenticio("Leite", 10.0, LocalDate.now().plusDays(3));
        assertEquals(7.0, produto.calcularPrecoFinal(), 0.001);
    }

    @Test
    public void naoDeveAplicarDescontoSeValidadeLonga() {
        ProdutoAlimenticio produto = new ProdutoAlimenticio("Arroz", 10.0, LocalDate.now().plusDays(10));
        assertEquals(10.0, produto.calcularPrecoFinal(), 0.001);
    }

    @Test
    public void deveLancarExcecaoValidadeInvalida() {
        try {
            ProdutoAlimenticio produto = new ProdutoAlimenticio("Iogurte", 5.0, LocalDate.now().minusDays(1));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data de validade inválida", e.getMessage());
        }
    }
}
