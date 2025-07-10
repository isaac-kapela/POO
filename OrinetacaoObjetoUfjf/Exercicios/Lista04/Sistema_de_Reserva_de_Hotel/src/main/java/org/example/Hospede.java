package org.example;

import java.util.ArrayList;

public class Hospede {
    private String nome;
    private int codigo;
    private ArrayList<Reserva> reservas;

    public Hospede(String nome, int codigo) {
        this.setNome(nome);
        this.setCodigo(codigo);
        this.reservas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("precisa de um nome");
        }
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo < 0){
            throw new IllegalArgumentException("codigo invalido");
        }
        this.codigo = codigo;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void adicionarReserva(Reserva reserva) {
        if (reserva == null) {
            throw new IllegalArgumentException("Reserva não pode ser nula");
        }
        this.reservas.add(reserva);
    }

    public ArrayList<Reserva> consultarReservas() {
        return this.getReservas();
    }

    public ArrayList<String> consultarResumoReservas() {
        ArrayList<String> resumo = new ArrayList<>();
        for (Reserva reserva : reservas) {
            String linha = "Tipo: " + reserva.getClass().getSimpleName()
                    + " | Dias: " + reserva.getNumDiasHospedagem()
                    + " | Valor: R$ " + reserva.calculaValor();
            resumo.add(linha);
        }
        return resumo;
    }


}
