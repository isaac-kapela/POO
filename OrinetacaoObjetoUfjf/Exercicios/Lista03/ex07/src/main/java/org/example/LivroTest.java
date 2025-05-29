package org.example;

import org.junit.Test;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class LivroTest {

    @Test
    public void deveCalcularDataDevolucaoLivro() {
        Livro livro = new Livro("Dom Casmurro", LocalDate.of(2000, 1, 1));
        LocalDate dataEmprestimo = LocalDate.of(2025, 5, 1);
        LocalDate esperado = LocalDate.of(2025, 5, 16);

        assertEquals(esperado, livro.calcularDataDevolucao(dataEmprestimo));
    }
}
