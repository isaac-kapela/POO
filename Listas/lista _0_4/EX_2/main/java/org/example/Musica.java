package org.example;

public class Musica {
    private String nome;
    private String genero;
    private int duracaoEmSegundos;
    private int popularidade;

    public Musica (){}
    public Musica(String nome, String genero, int duracaoEmSegundos, int popularidade){
        this.nome = nome;
        this.genero = genero;
        this.duracaoEmSegundos = duracaoEmSegundos;
        this.popularidade = popularidade;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return this.genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getDuracaoEmSegundos() {
        return this.duracaoEmSegundos;
    }
    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }
    public int getPopularidade() {
        return this.popularidade;
    }
    public void setPopularidade(int popularidade) {
        this.popularidade = popularidade;
    }
}
