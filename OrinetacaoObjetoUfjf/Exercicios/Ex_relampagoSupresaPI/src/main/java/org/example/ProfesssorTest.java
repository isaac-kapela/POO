package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProfesssorTest {

    @Test
    public void deveRetonarEscolaridadeProfessor(){
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setEscolaridade("doutor");
        Professor professor = new Professor("isaac", 40, escolaridade);
        assertEquals("doutor", professor.getNomeEscolaridade());


    }
}
