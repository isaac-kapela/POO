package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoEletronicoTest {

    @Test
    public void deveCalcularPrecoComImposto() {
        ProdutoEletronico produto = new ProdutoEletronico("Notebook", 2000, 0.2);
        assertEquals(2400.0, produto.calcularPrecoFinal(), 0.001);
    }

    @Test
    public void deveLancarExcecaoTaxaInvalida() {
        try {
            ProdutoEletronico produto = new ProdutoEletronico("TV", 3000, -0.1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Taxa de imposto inválida", e.getMessage());
        }
    }
}
