package org.example;

public class Escola {
    private String nome;
    private Professor diretor;

    public Escola(String nome, Professor diretor) {
        this.setNome(nome);
        this.setDiretor(diretor);
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

    public String getEscolaridadeDiretor(){
        return this.getDiretor().getNivelEnsino().getEscolaridade();
    }
}
