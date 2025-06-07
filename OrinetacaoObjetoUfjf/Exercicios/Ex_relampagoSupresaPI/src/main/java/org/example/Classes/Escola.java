package org.example.Classes;

public class Escola {
    private String nome;
    private Professor diretor;
    private Cidade cidadeEscola;
    private Professor profEscola;

    public Escola(String nome, Professor diretor, Cidade cidadeEscola, Professor profEscola) {
        this.setNome(nome);
        this.setDiretor(diretor);
        this.setCidadeEscola(cidadeEscola);
        this.setProfEscola(profEscola);
    }

    public Escola(String nome, Professor diretor, Cidade cidadeEscola) {
        this.setNome(nome);
        this.setDiretor(diretor);
        this.setCidadeEscola(cidadeEscola);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getDiretor() {
        return diretor;
    }

    public void setDiretor(Professor diretor) {
        if(diretor == null){
            throw new IllegalArgumentException("toda escola precisa de um diretor ");
        }
        this.diretor = diretor;
    }

    public Cidade getCidadeEscola() {
        return cidadeEscola;
    }

    public void setCidadeEscola(Cidade cidadeEscola) {
        this.cidadeEscola = cidadeEscola;
    }

    public Professor getProfEscola() {
        return profEscola;
    }

    public void setProfEscola(Professor profEscola) {
        this.profEscola = profEscola;
    }

    public String getEscolaridadeDiretor(){
        return this.getDiretor().getNivelEnsino().getEscolaridade();
    }
}
    public String getDiretorProfessor(){
        return this.get
}