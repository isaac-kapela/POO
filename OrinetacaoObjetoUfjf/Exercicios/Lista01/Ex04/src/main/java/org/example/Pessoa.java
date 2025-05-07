package org.example;

public class Pessoa{

    private String genero;
    private double altura;
    private  double peso;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Pessoa(String genero, double altura, double peso) {
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    public double calculaImc() {
        if (this.altura <= 0 || this.peso <= 0) {
            throw new IllegalArgumentException("Peso e altura devem ser maiores que zero.");
        }
        return this.peso / (this.altura * this.altura);
    }

    public String getCategoriaImc() {
        double imc = this.calculaImc();
        if (this.genero.equalsIgnoreCase("F")) {
            if (imc < 19.1) {
                return "Abaixo do peso";
            } else if (imc < 25.8) {
                return "No peso normal";
            } else if (imc < 27.3) {
                return "Marginalmente acima do peso";
            } else if (imc < 32.3) {
                return "Acima do peso ideal";
            } else {
                return "Obeso";
            }
        } else if (genero.equalsIgnoreCase("M")) {
            if (imc < 20.7) {
                return "Abaixo do peso";
            } else if (imc < 26.4) {
                return "No peso normal";
            } else if (imc < 27.8) {
                return "Marginalmente acima do peso";
            } else if (imc < 31.1) {
                return "Acima do peso ideal";
            } else {
                return "Obeso";
            }
        } else {
            throw new IllegalArgumentException("Gênero inválido para este cálculo.");
        }
    }
}