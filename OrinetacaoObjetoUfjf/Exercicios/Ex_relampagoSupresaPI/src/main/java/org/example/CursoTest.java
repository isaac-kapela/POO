package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CursoTest {
    @Test
    public void deveRetonarEscolaridadeCoordenador(){
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setEscolaridade("pos-graduado");
        Professor professor = new Professor( "sla",  45,escolaridade);
        Curso curso = new Curso("curso de back-end", professor );

        assertEquals("pos-graduado", curso.getEscolaridadeCordenador());
    }
}
