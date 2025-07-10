package org.example;

import java.time.LocalDate;

public class Lancamento extends Emprestimo{
    private int valorAluguelDia;

    public Lancamento(Cliente cliente, LocalDate data, int diasEmprestimo, int valorAluguelDia) {
        super(cliente, data, diasEmprestimo);
        this.setValorAluguelDia(valorAluguelDia);
    }

    public int getValorAluguelDia() {
        return valorAluguelDia;
    }

    public void setValorAluguelDia(int valorAluguelDia) {
        this.valorAluguelDia = valorAluguelDia;
    }

    public String getTipoFita() {
        return "";
    }

    public int calculaValorTotal() {
        return this.valorAluguelDia*this.getDiasEmprestimo();
    }
}
