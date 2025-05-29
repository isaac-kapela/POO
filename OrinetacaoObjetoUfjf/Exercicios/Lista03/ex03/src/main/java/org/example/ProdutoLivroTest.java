package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoLivroTest {

    @Test
    public void deveCalcularPrecoComDesconto() {
        ProdutoLivro produto = new ProdutoLivro("Livro Java", 120);
        assertEquals(114.0, produto.calcularPreco(), 0.001);
    }

    @Test
    public void deveLancarExcecaoSePrecoInvalido() {
        try {
            ProdutoLivro produto = new ProdutoLivro("Livro Java", 0);
            produto.calcularPreco();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preço inválido", e.getMessage());
        }
    }
}
