package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Contribuinte {
    private String nome;
    private int codigo;
    private ArrayList<Imovel>imoveis;

    public Contribuinte(String nome, int codigo, ArrayList<Imovel> imoveis) {
        this.setNome(nome);
        this.setCodigo(codigo);
        this.setImoveis(imoveis);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome  == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("precisa de um nome");
        }
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo < 0){
            throw new IllegalArgumentException("informe um codigo valido");
        }
        this.codigo = codigo;
    }

    public ArrayList<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(ArrayList<Imovel> imoveis) {
        this.imoveis = imoveis;
    }


    public ArrayList<String> consultarImoveis() {
        ArrayList<String> lista = new ArrayList<>();
        if (imoveis == null || imoveis.isEmpty()) {
            throw new IllegalArgumentException("Nenhum imóvel encontrado");
        }
        for (Imovel i : imoveis) {
            String linha = "Imóvel Código: " + i.getCodigo() +
                    ", Endereço: " + i.getEndereco() +
                    ", Tipo: " + i.getClass().getSimpleName() +
                    ", IPTU: " + i.calculaIptu();
            lista.add(linha);
        }
        return lista;
    }


}
