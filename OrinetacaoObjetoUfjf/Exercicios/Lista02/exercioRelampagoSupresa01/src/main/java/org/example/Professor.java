package org.example;

public class Professor extends  Pessoa{
    private String titulacao;

    public Professor( String nome, String email, String titulacao) {
        super(nome, email);
        this.setTitulacao(titulacao);

    }


    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        if(titulacao == null || titulacao.isEmpty()){
            throw new IllegalArgumentException("Forneca uma titulacao");
        }
        this.titulacao = titulacao;
    }
    public String getDadosProfessor() {
        return  this.getNome() + this.getTitulacao();
    }
    }
