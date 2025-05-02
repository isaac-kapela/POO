package org.example;

public class Imc {
    private double imc;
    private String genero;

    public Imc() {
        this.imc = 0.0;
        this.genero = "";
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void calculaImc(String genero, double peso, double altura) {
        if (altura <= 0 || peso <= 0) {
            throw new IllegalArgumentException("Peso e altura devem ser maiores que zero.");
        }

        this.genero = genero;
        this.imc = peso / (altura * altura);

        System.out.println(getCategoriaImc());
    }

    public String getCategoriaImc() {
        if (genero.equalsIgnoreCase("F")) {
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
