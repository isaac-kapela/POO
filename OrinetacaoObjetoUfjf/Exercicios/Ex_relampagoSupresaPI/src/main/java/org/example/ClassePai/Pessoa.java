package org.example.ClassePai;

import org.example.Classes.Cidade;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private Cidade naturalidade;

    public Pessoa(String nome, int idade, Cidade naturalidade) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setNaturalidade(naturalidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Cidade getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(Cidade naturalidade) {
        this.naturalidade = naturalidade;
    }

    public void getEstadoNaturalidadeAluno(){
            this.getNaturalidade().getEstado().getNome();
    }
}
