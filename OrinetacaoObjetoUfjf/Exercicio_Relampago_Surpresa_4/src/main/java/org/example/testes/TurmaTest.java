package org.example.testes;

import org.example.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TurmaTest {

    @Test
    public void deveRetornarNomeProfessorTurma(){
        Professor professor = new Professor("marco antonio", 50);
        Curso curso = new Curso();
        Disciplina disciplina = new Disciplina();
        Turma turma = new Turma(professor, curso, disciplina);
        assertEquals("marco antonio", turma.deveRetornarNomeProfessorTurma());
    }

    @Test
    public void deveRetornarNomeInvalidoProfessorTurma(){
        try{
            Professor professor = new Professor(" ", 50);
            fail();
        }catch (IllegalArgumentException e){
                assertEquals("nome invalido", e.getMessage());
        }
    }

    @Test
    public void deveRetornarNomeTodosAlunosTurma(){
        Professor professor = new Professor("Luciano", 40);
        Curso curso = new Curso();
        Disciplina disciplina = new Disciplina();
        Turma turma = new Turma(professor, curso, disciplina);

        Aluno aluno1 = new Aluno("Isaac", 20, turma);
        Aluno aluno2 = new Aluno("sla", 22, turma);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);

        turma.setAlunos(listaAlunos);
        ArrayList<String> nomes = turma.deveRetornarNomeTodosAlunosTurma();
        List<String> esperado = List.of("Isaac", "sla");

        assertEquals(esperado, nomes);

    }
}
