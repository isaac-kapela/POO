package org.example;

public class Aluno extends Pessoa{
    private int media;

    public Aluno(String nome, int idade, int media) {
        super(nome, idade);
        this.media = media;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }
}
