package org.example;

public class Produtos {
    private String nome;
    private  double preco;
    private int quantidadeEstoque;
    private String categoria;

    public Produtos(String nome, double preco, int quantidadeEstoque, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void addEstoque(int quant){
        if(quant < 0){
            throw new IllegalArgumentException("quantidade negativa");
        }if(quant > 200){
            throw new IllegalArgumentException("Estoque ja esta cheio");
        }
        this.quantidadeEstoque = this.quantidadeEstoque+quant;
    }
    public void addRemove(int quant){
        if(quant > this.getQuantidadeEstoque()){
            throw new IllegalArgumentException("quantidade de produtos insuficientes");
        }
        if(quant < 0){
            throw new IllegalArgumentException("quantidade negativa");
        }
        if(quant > 20){
            throw new IllegalArgumentException("so é possivel remover 20 itens por vez");
        }
        this.quantidadeEstoque = this.quantidadeEstoque-quant;
    }

    public void aplicaDesconto(double porcentagem){
        if(porcentagem < 0){
            throw new IllegalArgumentException("desconto invalido");
        }


        this.preco = preco *(1-(porcentagem/100));

    }
}
