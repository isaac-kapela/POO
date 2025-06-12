package org.example.Classes;

import org.example.ClassePai.Pessoa;

public class Aluno extends Pessoa {
    private Curso cursoAluno;

    public Aluno(String nome, int idade, Cidade naturalidade, Curso cursoAluno) {
        super(nome, idade, naturalidade);
        this.setCursoAluno(cursoAluno);
    }
    public Curso getCursoAluno() {
        return cursoAluno;
    }

    public void setCursoAluno(Curso cursoAluno) {
        if(cursoAluno == null){
            throw new IllegalArgumentException("curso invalido");
        }
        this.cursoAluno = cursoAluno;
    }

    public String  deveRetornarEstadoNaturalidadeAluno(){
        return this.getNaturalidade().getEstado().getNome();

    }
    public  String getEstadoAlunoEstuda(){
        return this.getCursoAluno().getNomeEscola().getCidadeEscola().getEstado().getNome();
}
    public String getNomeCoordenadorCursoAluno(){
        return  this.cursoAluno.getNomeCoordenador();
    }

}
