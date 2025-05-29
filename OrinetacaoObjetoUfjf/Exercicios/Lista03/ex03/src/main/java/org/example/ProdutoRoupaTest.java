package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoRoupaTest {

    @Test
    public void deveCalcularPrecoComDesconto() {
        ProdutoRoupa produto = new ProdutoRoupa("Camiseta", 100);
        assertEquals(80.0, produto.calcularPreco(), 0.001);
    }

    @Test
    public void deveLancarExcecaoSePrecoInvalido() {
        try {
            ProdutoRoupa produto = new ProdutoRoupa("Camiseta", -50);
            produto.calcularPreco();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preço inválido", e.getMessage());
        }
    }
}
