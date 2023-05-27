package org.example;

import java.util.ArrayList;

public class Album {
    private String nome;
    private String nomeArtista;

    private ArrayList<Musica> musicas = new ArrayList<>();

    public Album(){}
    public Album(String nome, String nomeArtista){
        this.nome = nome;
        this.nomeArtista = nomeArtista;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNomeArtista() {
        return this.nomeArtista;
    }
    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }
    public ArrayList<Musica> getMusicas() {
        return this.musicas;
    }
    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    public Musica getMusicaMaiorPopularidade() {
        int maiorPopularidade = 0;
        int index = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).getPopularidade() > maiorPopularidade) {
                maiorPopularidade = musicas.get(i).getPopularidade();
                index = i;
            }
        }
        return musicas.get(index);
    }

    public Musica getMusicaMenorDuracao() {
        int menorDuracao = 0;
        int index = 0;
        for (int i = 0; i < musicas.size(); i ++) {
            if (musicas.get(i).getDuracaoEmSegundos() < menorDuracao) {
                menorDuracao = musicas.get(i).getDuracaoEmSegundos();
                index = i;

            }
        }
        return musicas.get(index);
    }
}