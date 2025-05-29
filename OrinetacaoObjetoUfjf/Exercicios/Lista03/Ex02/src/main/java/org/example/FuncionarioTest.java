package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class FuncionarioTest {

    @Test
    public void deveCalcularSalarioCorretamente() {
        FuncionarioComum funcionario = new FuncionarioComum(2000, "João");
        assertEquals(2000, funcionario.calcularPagamento(), 0.001);
    }

    @Test
    public void deveLancarExcecaoSalarioInvalido() {
        try {
            FuncionarioComum funcionario = new FuncionarioComum(0, "João");
            funcionario.calcularPagamento();
            fail("Era esperado lançar IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Salario Invalido", e.getMessage());
        }
    }
}
