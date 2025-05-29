package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoEletronicoTest {

    @Test
    public void deveCalcularPrecoComDesconto() {
        ProdutoEletronico produto = new ProdutoEletronico("Notebook", 3000);
        assertEquals(2700.0, produto.calcularPreco(), 0.001);
    }

    @Test
    public void deveLancarExcecaoSePrecoInvalido() {
        try {
            ProdutoEletronico produto = new ProdutoEletronico("Notebook", 0);
            produto.calcularPreco();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preço inválido", e.getMessage());
        }
    }
}
