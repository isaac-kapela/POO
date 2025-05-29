package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class DiretorTest {

    @Test
    public void deveCalcularSalarioComParticipacaoNosLucros() {
        Diretor diretor = new Diretor(3000, "Ana", 10000); // 10% dos lucros = 1000
        assertEquals(4000, diretor.calcularPagamento(), 0.001);
    }

    @Test
    public void deveLancarExcecaoSalarioMenorOuIgual2000() {
        try {
            Diretor diretor = new Diretor(2000, "Ana", 10000);
            diretor.calcularPagamento();
            fail("Era esperado lançar IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("salario invalido", e.getMessage());
        }
    }
}
