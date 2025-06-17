package org.example;

public class Departamento {
    private String nome;
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
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Todo departamento precisa ter um nome");
        }
        this.nome = nome;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        if (empresa == null){
            throw new IllegalArgumentException("Todo departamento precisa de uma empresa");
        }
        this.empresa = empresa;
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) {
        if (chefe == null) {
            throw new IllegalArgumentException("Todo departamento deve ter um chefe");
        }
        this.chefe = chefe;
    }

    public String getNomeEmpresa(){
        return this.empresa.getPais();
    }

    public String getEscolaridadeChefeDepartamento(){

        return this.chefe.getEscolaridadeChefe();
    }
}
