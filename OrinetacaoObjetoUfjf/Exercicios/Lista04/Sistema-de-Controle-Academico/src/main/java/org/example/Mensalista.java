package org.example;


public class Mensalista extends Alunos {
    private float valorMensalidade;
    private int numParcelas;

    public Mensalista(String matricula, String nome, String endereco, float valorMensalidade, int numParcelas) {
        super(matricula, nome, endereco);
        setValorMensalidade(valorMensalidade);
        setNumParcelas(numParcelas);
    }

    public float getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(float valorMensalidade) {
        if (valorMensalidade <= 0) {
            throw new IllegalArgumentException("Erro: Valor da mensalidade deve ser maior que zero.");
        }
        this.valorMensalidade = valorMensalidade;
    }

    public int getNumParcelas() {
        return numParcelas;
    }

    public void setNumParcelas(int numParcelas) {
        if (numParcelas <= 0) {
            throw new IllegalArgumentException("Erro: Número de parcelas deve ser maior que zero.");
        }
        this.numParcelas = numParcelas;
    }

    public float calcularMensalidade() {
        return valorMensalidade;
    }

    public int getNumeroParcelas() {
        return numParcelas;
    }
}