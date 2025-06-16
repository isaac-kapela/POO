package org.example;

public class Empresa {
    private  String nome;
    private  Grupo grupo;

    public Empresa(String nome, Grupo grupo) {
        this.nome = nome;
        this.grupo = grupo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public String getPais(){
        return this.grupo.getNomePais();
    }
}
