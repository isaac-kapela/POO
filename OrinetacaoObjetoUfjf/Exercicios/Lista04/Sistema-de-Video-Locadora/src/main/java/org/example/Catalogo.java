package org.example;

import java.time.LocalDate;

public class Catalogo extends Emprestimo{


    public Catalogo(Cliente cliente, LocalDate data, int diasEmprestimo) {
        super(cliente, data, diasEmprestimo);
    }

    public String getTipoFita() {
        return "Catalogo";
    }

    public int calculaValorTotal(){
       return 5*this.getDiasEmprestimo();
   }
}
