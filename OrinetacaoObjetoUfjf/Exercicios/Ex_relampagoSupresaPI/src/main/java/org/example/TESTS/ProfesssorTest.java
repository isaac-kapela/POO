package org.example.TESTS;

import org.example.Classes.Cidade;
import org.example.Classes.Escolaridade;
import org.example.Classes.Estado;
import org.example.Classes.Professor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProfesssorTest {

    @Test
    public void deveRetonarEscolaridadeProfessor(){
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setEscolaridade("doutor");
        Estado estado = new Estado("Parana");
        Cidade cidade = new Cidade("Curitiba", estado);

        Professor professor = new Professor("antonio", 50, escolaridade, cidade);
        assertEquals("doutor", professor.getNomeEscolaridade());
    }
    @Test
    public void deveRetornarCidadeNascimentoProf(){
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setEscolaridade("doutor");
        Estado estado = new Estado("Parana");
        Cidade cidade = new Cidade("Curitiba", estado);
        Professor professor = new Professor("Marco antonio", 50, escolaridade, cidade);
        assertEquals("Curitiba", professor.getCidadeNascimentoProfessor());
    }

}
