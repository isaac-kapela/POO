package org.example;

public class Fornecedor extends Pessoa {
    private String cnpj;

    public Fornecedor(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}

