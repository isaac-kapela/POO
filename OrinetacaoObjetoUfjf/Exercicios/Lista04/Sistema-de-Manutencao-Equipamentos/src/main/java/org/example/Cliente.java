package org.example;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private int codigo;
    private ArrayList<Manutencao> manutencoes;

    public Cliente(String nome, int codigo) {
        this.setNome(nome);
        this.setCodigo(codigo);
        this.setManutencoes(new ArrayList<>());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido.");
        }
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo < 0) {
            throw new IllegalArgumentException("Código inválido.");
        }
        this.codigo = codigo;
    }

    public ArrayList<Manutencao> getManutencoes() {
        return manutencoes;
    }

    public void setManutencoes(ArrayList<Manutencao> manutencoes) {
        this.manutencoes = manutencoes;
    }

    public void adicionarManutencao(Manutencao manutencao) {
        if (manutencao == null) {
            throw new IllegalArgumentException("Manutenção inválida.");
        }
        this.manutencoes.add(manutencao);
    }

    public ArrayList<String> consultarResumoManutencoes() {
        ArrayList<String> resumo = new ArrayList<>();
        for (Manutencao m : manutencoes) {
            String linha = "Manutenção " + m.getNumero()
                    + " | Tipo: " + m.getTipo()
                    + " | Valor: R$ " + m.calcularValor();
            resumo.add(linha);
        }
        return resumo;
    }
}
