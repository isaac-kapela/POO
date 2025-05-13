package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AlunoEnsinoMedioTest {

    @Test
    public void deveRetornarAprovacao(){
        AlunoGraduacao graduacao = new AlunoGraduacao("fulano", "sla@gmail.com", 10, 10);
        assertEquals("Aprovado", graduacao.calcular());
    }

    @Test
    public void deveRetonarReprovado(){
        AlunoGraduacao graduacao = new AlunoGraduacao("fulano", "sla@gmail.com", 4, 4);
        assertEquals("Reprovado", graduacao.calcular());
    }
    @Test
    public void deveLancarExecaoNotaNegativa(){
        try{
            AlunoGraduacao graduacao = new AlunoGraduacao("fulano", "sla@gmail.com", -1, 4);
            graduacao.calcular();
            fail();
        }
        catch ( IllegalArgumentException e){
            assertEquals("Nota invalida", e.getMessage());
        }
    }
    @Test
    public void deveLancarExecaoNotaMuitoAlta(){
        try{
            AlunoGraduacao graduacao = new AlunoGraduacao("fulano", "sla@gmail.com", 11, 4);
            graduacao.calcular();
            fail();
        }
        catch ( IllegalArgumentException e){
            assertEquals("Nota invalida", e.getMessage());
        }
    }

}
