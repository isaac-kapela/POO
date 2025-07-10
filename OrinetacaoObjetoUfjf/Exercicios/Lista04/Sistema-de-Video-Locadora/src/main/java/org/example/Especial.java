package org.example;

import java.time.LocalDate;

public class Especial extends Emprestimo{
    private int valorAluguelDia;

    public Especial(Cliente cliente, LocalDate data, int diasEmprestimo, int valorAluguelDia) {
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
        return "Especial";
    }

    public int calculaValorTotal(){
        return this.valorAluguelDia*this.getDiasEmprestimo();
    }

}
