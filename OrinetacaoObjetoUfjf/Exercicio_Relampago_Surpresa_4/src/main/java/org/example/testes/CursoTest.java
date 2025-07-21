package org.example.testes;

import org.example.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CursoTest {

    @Test
    public void deveRetornarNomeProfessorLecionaTurmaCursoCurso(){
        Curso curso = new Curso();
        Professor professor = new Professor("marco antonio",50);
        Disciplina disciplina = new Disciplina();
        Turma turma = new Turma(professor, curso,disciplina );
        Aluno aluno = new Aluno("sla", 20, turma);
        curso.adicionarTurma(turma);
        List<String> esperado = List.of("marco antonio");
        assertEquals(esperado, curso.deveRetornarNomeProfessorLecionaTurmaCurso());

    }

    @Test
    public void deveRetornarNomesAlunosEstaoTurmaCurso(){
        Curso curso = new Curso();
        Professor professor = new Professor("marco antonio", 50);
        Disciplina disciplina = new Disciplina();
        Turma turma = new Turma(professor, curso, disciplina);

        Aluno aluno = new Aluno("sla", 20, turma);
        Aluno aluno1 = new Aluno("isaac", 20, turma);
        Aluno aluno2 = new Aluno("sla2", 20, turma);

        turma.getAlunos().add(aluno);
        turma.getAlunos().add(aluno1);
        turma.getAlunos().add(aluno2);
        curso.adicionarTurma(turma);
        List<String> esperado = List.of("sla", "isaac", "sla2");
        ArrayList<String> nomes = curso.deveRetornarNomesAlunosEstaoTurmaCurso();
        assertEquals(esperado, nomes);
    }

    @Test
    public void deveRetornarNomeAlunoRegistradoCurso(){
        Professor professor = new Professor("marco antonio", 50);
        Curso curso = new Curso();
        Disciplina disciplina = new Disciplina();
        Turma turma = new Turma(professor,curso,disciplina);
        Aluno aluno = new Aluno("isaac", 20,turma);
        Aluno aluno1 = new Aluno("isaac", 20, turma);
        Aluno aluno2 = new Aluno("sla2", 20, turma);

        curso.getAlunos().add(aluno);
        curso.getAlunos().add(aluno1);
        curso.getAlunos().add(aluno2);
        curso.adicionarTurma(turma);
        List<String> esperado = List.of("isaac", "isaac", "sla2");
        ArrayList<String> nomes = curso.deveRetornarNomeAlunoRegistradoCurso();
        assertEquals(esperado, nomes);



    }

}
