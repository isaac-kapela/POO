package org.example;

import java.time.LocalDate;

public class Livro extends MaterialBiblioteca {

    public Livro(String titulo, LocalDate dataPublicacao) {
        super(titulo, dataPublicacao);
    }

    public LocalDate calcularDataDevolucao(LocalDate dataEmprestimo) {
        return dataEmprestimo.plusDays(15);
    }
}
