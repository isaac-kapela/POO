package org.example;

import java.time.LocalDate;

public class Filme extends MaterialBiblioteca {

    public Filme(String titulo, LocalDate dataPublicacao) {
        super(titulo, dataPublicacao);
    }

    public LocalDate calcularDataDevolucao(LocalDate dataEmprestimo) {
        return dataEmprestimo.plusDays(5);
    }
}
