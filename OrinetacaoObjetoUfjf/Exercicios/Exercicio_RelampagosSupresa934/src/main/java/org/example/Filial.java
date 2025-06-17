package org.example;

public class Filial {
    private String nome;
    private Estado estado;
    private Empresa empresa;

    public Filial(String nome, Estado estado, Empresa empresa) {
        this.setNome(nome);
        this.setEstado(estado);
        this.setEmpresa(empresa);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("toda filial precisa ter um nome");
        }
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        if (estado == null) {
            throw new IllegalArgumentException("toda filial tem um estado");
        }
        this.estado = estado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        if (empresa == null) {
            throw new IllegalArgumentException("toda filial deve pertencer a uma empresa");
        }
        this.empresa = empresa;
    }

    public String getEstadoFilialFunCoordena() {
        return this.estado.getNome();
    }

    public String getNomeDiretorEmpresaFilial() {

        return this.empresa.getNomeDiretor();
    }

}
