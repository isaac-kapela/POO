package org.example;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<Conta>contas;

    public Cliente(int codigo, String nome, ArrayList<Conta> contas) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setContas(contas);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo < 0){
            throw new IllegalArgumentException("codigo invalido");
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("precisa de um nome");
        }
        this.nome = nome;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        if(contas == null){
            throw new IllegalArgumentException("Lista vazia");
        }
        this.contas = contas;
    }
    public ArrayList<Conta> consultarContas() {
        return this.getContas();
    }

    public ArrayList<String> consultarResumoContas() {
        ArrayList<String> info = new ArrayList<>();
        for (Conta conta : this.getContas()) {
            String linha = "Conta Nº: " + conta.getNumero() +
                    " | Tipo: " + conta.getClass().getSimpleName() +
                    " | Saldo total: R$ " + conta.getSaldoTotal();
            info.add(linha);
        }
        return info;
    }


}
