package org.example;

public class Funcionario {
    private String nome;
    private String cargo;
    private Escolaridade nivelEnsino;
    private Departamento alocacao;
    private Filial coordenacao;

    public Funcionario(String nome, String cargo, Escolaridade nivelEnsino) {
        this.setNome(nome);
        this.setCargo(cargo);
        this.setNivelEnsino(nivelEnsino);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Escolaridade getNivelEnsino() {
        return nivelEnsino;
    }

    public void setNivelEnsino(Escolaridade nivelEnsino) {
        if (nivelEnsino == null) {
            throw new IllegalArgumentException("todo funcionário precisa ter um nível de ensino");
        }
        this.nivelEnsino = nivelEnsino;
    }

    public Departamento getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(Departamento alocacao) {
        if (alocacao == null) {
            throw new IllegalArgumentException("todo funcionario presica de uma alocaçao");
        }
        this.alocacao = alocacao;
    }

    public Filial getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Filial coordenacao) {
        this.coordenacao = coordenacao;
    }

    public String getEscolaridadePresida() {
        if (this.nivelEnsino == null) {
            throw new IllegalStateException("nível de ensino não definido");
        }
        return this.nivelEnsino.getEscolaridade();
    }

    public String getPaisAlocaoFun() {
        return this.alocacao.getNomeEmpresa();
    }

    public String getEstadoFilialCoordena() {
        if (this.coordenacao == null) {
            throw new IllegalStateException("coordenacao não definida");
        }
        return this.coordenacao.getEstadoFilialFunCoordena();
    }

    public String getEscolaridadeChefe() {
        if (this.nivelEnsino == null) {
            throw new IllegalStateException("nível de ensino não definido");
        }
        return this.nivelEnsino.getEscolaridade();
    }
}
