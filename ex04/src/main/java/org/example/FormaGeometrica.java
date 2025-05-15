package org.example;

public abstract class FormaGeometrica {
    private  String nome;

    public FormaGeometrica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcularArea();

    public abstract double   calcularPerimetro();


}
