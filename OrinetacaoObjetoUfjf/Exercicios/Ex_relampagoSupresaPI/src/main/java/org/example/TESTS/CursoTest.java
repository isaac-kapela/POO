package org.example.TESTS;

import org.example.Classes.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CursoTest {
    @Test
    public void deveRetonarEscolaridadeCoordenador(){
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setEscolaridade("pos-graduado");

        Estado estado = new Estado("Minas Gerais");
        Cidade cidade = new Cidade("Juiz de Fora", estado);

        Professor professor = new Professor("sla", 45, escolaridade, cidade);
        Escola escola = new Escola("Escola sla",professor, cidade );

        Curso curso = new Curso("curso de back-end", professor, escola );

        assertEquals("pos-graduado", curso.getEscolaridadeCordenador());
    }

}
