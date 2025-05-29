package org.example;

import org.junit.Test;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class VooDomesticoTest {

    @Test
    public void deveCalcularPrecoCorretamente() {
        VooDomestico voo = new VooDomestico("SP", "RJ", 400, LocalDate.now(), 0.5);
        assertEquals(200.0, voo.calcularPreco(), 0.001);
    }

    @Test
    public void deveLancarExcecaoFatorInvalido() {
        try {
            VooDomestico voo = new VooDomestico("SP", "RJ", 400, LocalDate.now(), -1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fator de preço inválido", e.getMessage());
        }
    }
}
