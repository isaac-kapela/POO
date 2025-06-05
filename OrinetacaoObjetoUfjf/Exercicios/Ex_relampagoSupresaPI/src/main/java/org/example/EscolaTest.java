package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EscolaTest {

    @Test
    public void deveRetornarEscolaridadeDiretor(){
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setEscolaridade("mestre");
        Professor professor = new Professor("sla", 45, escolaridade);
        Escola escola = new Escola("escola sla", professor );
        assertEquals("mestre", escola.getEscolaridadeDiretor());

    }
}
