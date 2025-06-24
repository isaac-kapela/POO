package org.example;

public class Fornecedor extends Pessoa{
    private  int cnpj;

    public Fornecedor(String nome) {
        super(nome);
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
}
