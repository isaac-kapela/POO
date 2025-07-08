package org.example;

public abstract class  Imovel {
    private int codigo;
    private String endereco;
    private Contribuinte propretario;

    public Imovel(int codigo, String endereco, Contribuinte propretario) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.propretario = propretario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Contribuinte getPropretario() {
        return propretario;
    }

    public void setPropretario(Contribuinte propretario) {
        this.propretario = propretario;
    }

    public abstract double calculaIptu();
}
