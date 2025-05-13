package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ProfessorTest {
    @Test
    public void deveRetonarDadosProfessor(){
        Professor professor = new Professor("Marco", "marco@gmail.com","nao sei");
        assertEquals("Marco"+"nao sei", professor.getDadosProfessor());
    }

    @Test
    public void deveLancarExecaoSemTitulacao(){
        try{
            Professor professor = new Professor("Marco", "marco@gmail.com","");
            professor.getDadosProfessor();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Forneca uma titulacao", e.getMessage());
        }
    }

}
