package org.example;

public class Pais {
    private  String nome;
    private  int num_Habitantes;
    private String capital;

    public Pais(String nome, int num_Habitantes, String capital) {
        this.nome = nome;
        this.num_Habitantes = num_Habitantes;
        this.capital = capital;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNum_Habitantes() {
        return num_Habitantes;
    }

    public void setNum_Habitantes(int num_Habitantes) {
        this.num_Habitantes = num_Habitantes;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
