package org.example;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private int quantEstoque;
    private int precoUnitario;
    private  int estotoqueMinimo;
    private  int estoqueMaximo;
    private String historico;
    List<String> vendas = new ArrayList<>();

    public Produto(String nome, int quantEstoque, int precoUnitario, int estotoqueMinimo, int estoqueMaximo, String historico) {
        this.nome = nome;
        this.quantEstoque = quantEstoque;
        this.precoUnitario = precoUnitario;
        this.estotoqueMinimo = estotoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.historico = historico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public int getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(int precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getEstotoqueMinimo() {
        return estotoqueMinimo;
    }

    public void setEstotoqueMinimo(int estotoqueMinimo) {
        this.estotoqueMinimo = estotoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(int estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
    public String resgistrarHistorico(String transacao){
       return   this.historico = transacao;
    }

    public String exibirHistorico(){
        return getHistorico();
    }
    public void debitarEstoque(int quantidade){
        this.quantEstoque = this.quantEstoque-quantidade;
    }
    public void creditarEstoque(int quantidade){
        this.quantEstoque = this.quantEstoque + quantidade;
    }

    public boolean verificarEstoqueBaixo(){
        if(this.quantEstoque< this.estotoqueMinimo){
            return  true;
        }
        else{
            return false;
        }
    }

    public boolean verificarEstoqueInsuficiente(int quantidade){
        if(quantidade > this.quantEstoque){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean verificarEstoqueExcedente(int quantidade){
        int quantSomada = this.quantEstoque+quantidade;
        if(quantSomada > this.estotoqueMinimo){
            return  true;
        }
        else{
            return false;
        }
    }

    public int calcularValorVenda(int quantidade){
        return this.precoUnitario*quantidade;
    }

    public void vender(String dataVenda,Cliente cliente,int quantidadeVendida){
        Venda venda = new Venda(dataVenda, cliente, quantidadeVendida, this);
        if(venda.vender == true){
            return true;
        }
    }
    }

