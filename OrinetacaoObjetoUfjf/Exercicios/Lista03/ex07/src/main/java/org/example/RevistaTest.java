package org.example;

import org.junit.Test;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class RevistaTest {

    @Test
    public void deveCalcularDataDevolucaoRevista() {
        Revista revista = new Revista("Super Interessante", LocalDate.of(2010, 6, 1));
        LocalDate dataEmprestimo = LocalDate.of(2025, 5, 1);
        LocalDate esperado = LocalDate.of(2025, 5, 8);

        assertEquals(esperado, revista.calcularDataDevolucao(dataEmprestimo));
    }
}
