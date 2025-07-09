package org.example;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<Conta>contas;

    public Cliente(int codigo, String nome, ArrayList<Conta> contas) {
        this.codigo = codigo;
        this.nome = nome;
        this.contas = contas;
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

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }
    public ArrayList<Conta> consultarContas() {
        return this.contas;
    }

    public ArrayList<String> consultarResumoContas() {
        ArrayList<String> info = new ArrayList<>();
        for (Conta conta : contas) {
            String linha = "Conta Nº: " + conta.getNumero() +
                    " | Tipo: " + conta.getClass().getSimpleName() +
                    " | Saldo total: R$ " + conta.getSaldoTotal();
            info.add(linha);
        }
        return info;
    }


}
