package org.example.TESTS;

import org.example.Classes.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlunoTest {

    @Test
    public void deveRetornarEstadoNaturalidadeAluno(){
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setEscolaridade("graduando");
        Estado estado = new Estado("Minas Gerais");
        Cidade cidade = new Cidade("juiz de fora", estado);
        Professor professor = new Professor("Marco", 48, escolaridade,cidade);
        Escola escola = new Escola("escolaxxx", professor, cidade);
        Curso curso = new Curso("SI",professor, escola );
        Aluno aluno = new Aluno("isaac", 20, cidade, curso );
        assertEquals("Minas Gerais", aluno.deveRetornarEstadoNaturalidadeAluno());
    }
    @Test
    public void deveRetornarEstadoAlunoEstuda(){
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setEscolaridade("Graduando");
        Estado estado = new Estado("Minas Gerais");
        Cidade cidade = new Cidade("juiz de fora", estado);
        Professor professor = new Professor("Antonio", 48, escolaridade, cidade);
        Escola escola = new Escola("escolaxxx", professor, cidade);
        Curso curso = new Curso("SI",professor, escola);
        Aluno aluno = new Aluno("isaac", 20, cidade, curso);
    assertEquals("Minas Gerais", aluno.getEstadoAlunoEstuda());
    }
    @Test
    public void deveRetornarCoordenadorCursoAluno(){
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setEscolaridade("Graduando");
        Estado estado = new Estado("Minas Gerais");
        Cidade cidade = new Cidade("juiz de fora", estado);
        Professor professor = new Professor("Antonio", 48, escolaridade, cidade);
        Escola escola = new Escola("escolaxxx", professor, cidade);
        Curso curso = new Curso("SI", professor, escola);
        Aluno aluno = new Aluno("Isaac", 20, cidade, curso);
        assertEquals("Antonio", aluno.getNomeCoordenadorCursoAluno());

    }
}
