package org.example;


public class BolsistaIntegral extends Alunos {
    private int numParcelasIsentas;

    public BolsistaIntegral(String matricula, String nome, String endereco, int numParcelasIsentas) {
        super(matricula, nome, endereco);
        setNumParcelasIsentas(numParcelasIsentas);
    }

    public int getNumParcelasIsentas() {
        return numParcelasIsentas;
    }

    public void setNumParcelasIsentas(int numParcelasIsentas) {
        if (numParcelasIsentas <= 0) {
            throw new IllegalArgumentException("Erro: Número de parcelas isentas deve ser maior que zero.");
        }
        this.numParcelasIsentas = numParcelasIsentas;
    }


    public float calcularMensalidade() {
        return 0;
    }

    public int getNumeroParcelas() {
        return numParcelasIsentas;
    }
}