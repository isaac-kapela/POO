package org.example;

import java.time.LocalDate;

public abstract class MaterialBiblioteca {
    private String titulo;
    private LocalDate dataPublicacao;

    public MaterialBiblioteca(String titulo, LocalDate dataPublicacao) {
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public abstract LocalDate calcularDataDevolucao(LocalDate dataEmprestimo);
}
