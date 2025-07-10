package org.example;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<Vaga>vagas;

    public Cliente(int codigo, String nome ) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.vagas = new ArrayList<>();
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null|| nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }

    public ArrayList<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(ArrayList<Vaga> vagas) {
        if(vagas == null){
            throw new IllegalArgumentException("lista vazia");
        }
        this.vagas = vagas;
    }
    public void alugarVaga(Vaga vaga) {
        vagas.add(vaga);
    }

    public ArrayList<String> consultarVagasAlugadas(){
        ArrayList<String> resumo = new ArrayList<>();
        if(vagas.isEmpty()){
            throw new IllegalArgumentException("Nenhuma vaga encontrada");
        }
        for(Vaga v: vagas){
            String linha = "Vaga: " + v.getNumero() +
                    "  Placa: " + v.getPlacaVeiculo() +
                    "  Tipo: " + v.getTipoAluguel() +
                    "  Período: " + v.getPeriodo() +
                    "  Valor Total: R$ " + v.calculaValorTotal();
            resumo.add(linha);
        }
        return resumo;
    }

}
