package org.example;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private int qtdeEstoque;
    private double precoUnit;
    private int estoqueMinimo;
    private int estoqueMaximo;
    private List<Transacao> historico;

    public Produto(String nome, int qtdeEstoque, double precoUnit, int estoqueMinimo, int estoqueMaximo) {
        this.nome = nome;
        this.qtdeEstoque = qtdeEstoque;
        this.precoUnit = precoUnit;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.historico = new ArrayList<>();
    }

    public void debitarEstoque(int quantidade) {
        if (!verificarEstoqueSuficiente(quantidade)) {
            throw new IllegalArgumentException("Estoque insuficiente para a venda.");
        }
        qtdeEstoque -= quantidade;
    }

    public void creditarEstoque(int quantidade) {
        if (!verificarEstoqueExcedente(quantidade)) {
            throw new IllegalArgumentException("Quantidade excede o estoque máximo permitido.");
        }
        qtdeEstoque += quantidade;
    }

    public boolean verificarEstoqueBaixo() {
        return qtdeEstoque < estoqueMinimo;
    }

    public boolean verificarEstoqueExcedente(int quantidade) {
        return qtdeEstoque + quantidade <= estoqueMaximo;
    }

    public boolean verificarEstoqueSuficiente(int quantidade) {
        return qtdeEstoque >= quantidade;
    }

    public double calcularValorVenda(int quantidade) {
        return quantidade * precoUnit;
    }

    public void registrarHistorico(Transacao t) {
        historico.add(t);
    }

    public List<Transacao> getHistorico() {
        return historico;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public double getPrecoUnit() {
        return precoUnit;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }
}
