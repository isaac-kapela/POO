package org.example;

import org.junit.Test;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class FilmeTest {

    @Test
    public void deveCalcularDataDevolucaoFilme() {
        Filme filme = new Filme("Matrix", LocalDate.of(1999, 3, 31));
        LocalDate dataEmprestimo = LocalDate.of(2025, 5, 1);
        LocalDate esperado = LocalDate.of(2025, 5, 6);

        assertEquals(esperado, filme.calcularDataDevolucao(dataEmprestimo));
    }
}
