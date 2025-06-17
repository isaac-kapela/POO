package org.example;

public class Empresa {
    private String nome;
    private Grupo grupo;
    private Funcionario diretor;

    public Empresa(String nome, Grupo grupo) {
        this.setNome(nome);
        this.setGrupo(grupo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome da empresa não pode ser vazio");
        }
        this.nome = nome;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        if (grupo == null) {
            throw new IllegalArgumentException("A empresa deve pertencer a um grupo");
        }
        this.grupo = grupo;
    }

    public Funcionario getDiretor() {
        return diretor;
    }

    public void setDiretor(Funcionario diretor) {
        if (diretor == null) {
            throw new IllegalArgumentException("O diretor da empresa não pode ser nulo");
        }
        this.diretor = diretor;
    }

    public String getPais() {
        if (this.grupo == null) {
            throw new IllegalStateException("Grupo não definido para a empresa");
        }
        return this.grupo.getNomePais();
    }

    public String getNomeDiretor() {
        if (this.diretor == null) {
            throw new IllegalStateException("Diretor não definido para a empresa");
        }
        return this.diretor.getNome();
    }


}
