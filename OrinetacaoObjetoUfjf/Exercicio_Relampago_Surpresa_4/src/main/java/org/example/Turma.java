package org.example;

import java.util.ArrayList;

public class Turma {
    private Professor professor;
    private Curso curso;
    private ArrayList<Aluno> alunos;
    private Disciplina disciplina;

    public Turma(Professor professor, Curso curso, Disciplina disciplina) {
        this.setProfessor(professor);
        this.setCurso(curso);
        this.setAlunos(alunos);
        this.setDisciplina(disciplina);
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public String deveRetornarNomeProfessor(){
        return this.getProfessor().getNome();
    }
    public ArrayList<String> deveRetornarNomeTodosAlunosTurma(){
            ArrayList<String> nomes = new ArrayList<>();
            for(Aluno aluno : this.getAlunos()){
                nomes.add(aluno.getNome());
            }
            return  nomes;
    }
}
