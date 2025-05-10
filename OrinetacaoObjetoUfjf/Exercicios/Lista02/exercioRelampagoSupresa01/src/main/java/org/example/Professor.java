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
        this.titulacao = titulacao;
    }
}
