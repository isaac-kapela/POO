package org.example;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<Frete> fretes;

    public Cliente(int codigo, String nome) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setFretes(new ArrayList<>());
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Frete> getFretes() {
        return fretes;
    }

    public void setFretes(ArrayList<Frete> fretes) {
        this.fretes = fretes;
    }

    public ArrayList<Frete> consultarFretes() {
        return this.fretes;
    }

    public ArrayList<String> consultarFretePorClinte() {
        ArrayList<String> resultado = new ArrayList<>();
        if (fretes.isEmpty()) {
            resultado.add("esse cliente n possui frte");
            return resultado;
        }
        for (Frete frete : fretes) {
            String info = "num de frete: " + frete.getNumero()
                    + "| tipo: " + frete.getClass().getSimpleName()
                    + "| valor total: " + frete.calcularValorTotal();
            resultado.add(info);
        }
        return  resultado;
    }


}
