package org.example;

public class Departamento {
    private  String nome;
    private Empresa empresa;
    private Funcionario chefe;


    public Departamento(String nome, Empresa empresa) {
        this.setNome(nome);
        this.setEmpresa(empresa);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }

    public  String getNomeEmpresa(){
        return this.empresa.getPais();
    }
    public String getEscolaridadeChefeDepartamento(){
        return this.chefe.getEscolaridadeChefe();
    }
}
