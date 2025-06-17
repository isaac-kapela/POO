package org.example;

public class Filial {
    private  String nome;
    private Estado estado;
    private Empresa empresa;

    public Filial(String nome, Estado estado, Empresa empresa) {
        this.nome = nome;
        this.estado = estado;
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public String getEstadoFilialFunCoordena(){
        return this.getEstado().getNome();
    }

    public  String getNomeDiretorEmpresaFilial(){
        return this.empresa.getNomeDiretor();
    }
}
