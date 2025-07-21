package org.example;

import java.util.ArrayList;

public class Curso {
    private ArrayList<Turma> turmas;
    private ArrayList<Aluno> alunos;

    public Curso() {
        this.setTurmas(new ArrayList<>());
        this.setAlunos(new ArrayList<>());
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public ArrayList<String> deveRetornarNomeProfessorLecionaTurmaCurso(){
        ArrayList<String> nomes = new ArrayList<>();
        for(Turma turma: this.getTurmas()){
            nomes.add(turma.deveRetornarNomeProfessorTurma());
        }
        return nomes;
    }

    public ArrayList<String> deveRetornarNomesAlunosEstaoTurmaCurso(){
        ArrayList<String> nomesAlunos = new ArrayList<>();
        for(Turma turma: this.getTurmas()){
            nomesAlunos.addAll(turma.deveRetornarNomeTodosAlunosTurma());
        }
        return nomesAlunos;
    }

    public ArrayList<String> deveRetornarNomeAlunoRegistradoCurso(){
        ArrayList<String> nomesalunos2 = new ArrayList<>();
        for(Aluno aluno: this.getAlunos()){
            nomesalunos2.add(aluno.getNome());
        }
        return nomesalunos2;
    }

    public ArrayList<String> deveRetornarDisciplinasTurmaCurso(){
        ArrayList<String> listadisciplinas = new ArrayList<>();
        for(Turma turma: turmas){
            listadisciplinas.add(turma.getDisciplina().getNome());
        }
        return  listadisciplinas;
    }

    public boolean verificaTurmaEstaCurso(String nomeTurma){
        for(Turma turma1: turmas){
            if(turma1.getNome().equalsIgnoreCase(nomeTurma)){
                return true;
            }
        }
        return false;
    }

    public boolean removeTurmaCurso(){

    }
}
