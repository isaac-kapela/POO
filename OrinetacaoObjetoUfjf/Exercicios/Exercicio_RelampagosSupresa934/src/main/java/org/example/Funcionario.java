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
        this.setAlocacao(alocacao);
        this.setCoordenacao(coordenacao);
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
        this.nivelEnsino = nivelEnsino;
    }

    public Departamento getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(Departamento alocacao) {
        this.alocacao = alocacao;
    }

    public Filial getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Filial coordenacao) {
        coordenacao = coordenacao;
    }

    public String getEscolaridadePresida(){
        return this.nivelEnsino.getEscolaridade();
    }
    public String getPaisAlocaoFun(){
        return  this.alocacao.getNomeEmpresa();
    }

    public String getEstadoFilialCoordena(){
        return this.coordenacao.getEstadoFilialFunCoordena();
    }
}
