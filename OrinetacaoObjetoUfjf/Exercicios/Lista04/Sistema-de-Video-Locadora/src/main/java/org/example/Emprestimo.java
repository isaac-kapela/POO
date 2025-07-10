package org.example;

import java.time.LocalDate;

public abstract class Emprestimo {
    private Cliente cliente;
    private LocalDate data = LocalDate.now();
    public abstract String getTipoFita();
    private int diasEmprestimo;


    public Emprestimo(Cliente cliente, LocalDate data, int diasEmprestimo) {
        this.setCliente(cliente);
        this.setData(data);
        this.setDiasEmprestimo(diasEmprestimo);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if(cliente == null){
            throw new IllegalArgumentException("cliente invalido");
        }
        this.cliente = cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        if(data == null){
            throw new IllegalArgumentException("precisa de uma data");
        }
        this.data = data;
    }

    public int getDiasEmprestimo() {
        return diasEmprestimo;
    }

    public void setDiasEmprestimo(int diasEmprestimo) {
        if(diasEmprestimo < 0){
            throw new IllegalArgumentException("dias invalidos");
        }
        this.diasEmprestimo = diasEmprestimo;
    }
    public abstract  int calculaValorTotal();
}
