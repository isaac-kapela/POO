package org.example;

public class AlunoGraduacao extends Aluno {
    public AlunoGraduacao(String nome, String email, int nota1, int nota2) {
        super(nome, email, nota1, nota2);
    }
    public String calcular(){
        int media = (this.getNota1()+ this.getNota2())/2;
        if(media >= 7){
            return "Aprovado";
        }
        return  "Reprovado";
    }
}
