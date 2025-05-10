package org.example;

public class AlunoEnsinoMedio extends  Aluno{
    public AlunoEnsinoMedio(String nome, String email, int nota1, int nota2) {
        super(nome, email, nota1, nota2);
    }    public String calcular(){
        int media = (this.getNota1()+ this.getNota2())/2;
        if(media >= 6){
            return "Aprovado";
        }
        return  "Reprovado";
    }

}
