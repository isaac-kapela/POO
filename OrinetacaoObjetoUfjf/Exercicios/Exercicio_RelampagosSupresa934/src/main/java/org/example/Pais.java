package org.example;

public class Pais {
    private String nome;
    private int numHabitantes;
    private String capital;

    public Pais(String nome, int numHabitantes, String capital) {
        this.setNome(nome);
        this.setNumHabitantes(numHabitantes);
        this.setCapital(capital);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Todo país deve ter um nome válido");
        }
        this.nome = nome;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        if (numHabitantes < 0) {
            throw new IllegalArgumentException("Número de habitantes não pode ser negativo");
        }
        this.numHabitantes = numHabitantes;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        if (capital == null || capital.isBlank()) {
            throw new IllegalArgumentException("Todo país deve ter uma capital válida");
        }
        this.capital = capital;
    }

}
