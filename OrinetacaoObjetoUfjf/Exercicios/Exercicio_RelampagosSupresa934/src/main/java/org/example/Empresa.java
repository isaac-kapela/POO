package org.example;

public class Empresa {
    private  String nome;
    private  Grupo grupo;
    private Funcionario diretor;

    public Empresa(String nome, Grupo grupo) {
        this.setNome(nome);
        this.setGrupo(grupo);
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

    public Funcionario getDiretor() {
        return diretor;
    }

    public void setDiretor(Funcionario diretor) {
        this.diretor = diretor;
    }

    public String getPais(){
        return this.grupo.getNomePais();
    }
    public String getNomeDiretor(){
        return this.diretor.getNome();
    }
}
