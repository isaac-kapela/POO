package org.example;

import java.util.ArrayList;

public class Hospede {
    private String nome;
    private int codigo;
    private ArrayList<Reserva> reservas;

    public Hospede(String nome, int codigo, ArrayList<Reserva> reservas) {
        this.nome = nome;
        this.codigo = codigo;
        this.reservas = reservas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
}
