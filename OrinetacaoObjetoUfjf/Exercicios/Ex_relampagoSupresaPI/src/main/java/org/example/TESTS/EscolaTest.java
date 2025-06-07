package org.example.TESTS;

import org.example.Classes.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EscolaTest {

    @Test
    public void deveRetornarEscolaridadeDiretor(){
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setEscolaridade("mestre");
        Estado estado = new Estado("São paulo");
        Cidade cidade = new Cidade("São", estado);

        Professor professor = new Professor("sla", 50, escolaridade, cidade );
        Escola escola = new Escola("escola de tal", professor, cidade );
        assertEquals("mestre", escola.getEscolaridadeDiretor());

    }
}
