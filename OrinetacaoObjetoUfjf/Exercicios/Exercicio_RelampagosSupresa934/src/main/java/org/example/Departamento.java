package org.example;

public class Departamento {
    private  String nome;
    private Empresa empresa;


    public Departamento(String nome, Empresa empresa) {
        this.nome = nome;
        this.empresa = empresa;
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
    public  String getNomeEmpresa(){
        return this.empresa.getPais();
    }
}
