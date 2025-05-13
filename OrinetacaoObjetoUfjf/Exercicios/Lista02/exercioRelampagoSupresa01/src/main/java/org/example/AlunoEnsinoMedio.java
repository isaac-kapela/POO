package org.example;

public class AlunoEnsinoMedio extends  Aluno{
    public AlunoEnsinoMedio(String nome, String email, int nota1, int nota2) {
        super(nome, email, nota1, nota2);
    }
    public String calcular(){
        if(getNota1() < 0 || getNota2() <0 ){
            throw new IllegalArgumentException("Nota invalida");
        }
        if(getNota1() > 10 || getNota2() > 10){
            throw new IllegalArgumentException("Nota invalida");
        }
        int media = (this.getNota1()+ this.getNota2())/2;

        if(media >= 7){
            return "Aprovado";
        }
        return  "Reprovado";
    }

}
