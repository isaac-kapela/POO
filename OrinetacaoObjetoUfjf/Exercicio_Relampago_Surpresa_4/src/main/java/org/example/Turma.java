package org.example;

import java.util.ArrayList;

public class Turma {
    private Professor professor;
    private Curso curso;
    private ArrayList<Aluno> alunos;
    private Disciplina disciplina;
    private String nome;

    public Turma(Professor professor, Curso curso, Disciplina disciplina) {
        this.setProfessor(professor);
        this.setCurso(curso);
        this.setDisciplina(disciplina);
        this.setAlunos(new ArrayList<>());
        this.setNome(nome);
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public String deveRetornarNomeProfessorTurma(){
        return this.getProfessor().getNome();
    }
    public ArrayList<String> deveRetornarNomeTodosAlunosTurma(){
            ArrayList<String> nomes = new ArrayList<>();
            for(Aluno aluno : this.getAlunos()){
                nomes.add(aluno.getNome());
            }
            return  nomes;
    }

    public boolean verificaAlunoTurma(String nomeAluno) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                return true;
            }
        }
        return false;
    }

    public boolean removerAluno(Aluno aluno) {
        if (aluno == null || this.alunos == null) {
            return false;
        }

        boolean removido = this.alunos.remove(aluno);

        return removido;
    }



}
