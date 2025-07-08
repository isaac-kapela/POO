package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Contribuinte {
    private String nome;
    private int codigo;
    private ArrayList<Imovel>imoveis;

    public Contribuinte(String nome, int codigo, ArrayList<Imovel> imoveis) {
        this.nome = nome;
        this.codigo = codigo;
        this.imoveis = imoveis;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(ArrayList<Imovel> imoveis) {
        this.imoveis = imoveis;
    }
}
