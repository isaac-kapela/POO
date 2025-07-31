package org.example;

import java.util.ArrayList;

public class Funcionario extends Pessoa {

    private Cargo cargo;
    private Departamento departamento;
    private ArrayList<Dependente> dependentes;
    private ArrayList<Ocorrencia> ocorrencias;

    public Funcionario(String nome, Cargo cargo) {
        super(nome);
        this.cargo = cargo;
        this.ocorrencias = new ArrayList<>();
        this.dependentes = new ArrayList<>();
    }

    @Override
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("precisa de nome");
        }
        super.setNome(nome);
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        if (cargo == null) {
            throw new IllegalArgumentException("precisa de cargo");
        }
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(ArrayList<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    public ArrayList<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(ArrayList<Ocorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public double calcularSalarioLiquido(ArrayList<Ocorrencia> ocorrencias, int mes, int ano) {
        double salario = this.cargo.getSalarioBruto();
        double totalDescontos = 0;
        double totalAcrescimos = 0;

        if (ocorrencias != null) {
            for (Ocorrencia ocorrencia : ocorrencias) {
                if (ocorrencia.getAnoOcorrencia() == ano && ocorrencia.getMesOcorrencia() == mes) {
                    if (ocorrencia.getTipoOcorrencia().equalsIgnoreCase("desconto")) {
                        totalDescontos += ocorrencia.getValaorOcorrencia();
                    } else if (ocorrencia.getTipoOcorrencia().equalsIgnoreCase("acrescimo")) {
                        totalAcrescimos += ocorrencia.getValaorOcorrencia();
                    }
                }
            }
        }

        return salario + totalAcrescimos - totalDescontos;
    }

    public ArrayList<String> retornaDependentes() {
        ArrayList<String> nomes = new ArrayList<>();
        if (this.dependentes != null) {
            for (Dependente dep : dependentes) {
                nomes.add(dep.getNome());
            }
        }
        return nomes;
    }

    public String retornaNomeDepartamentoFuncionario() {
        if (this.departamento == null) {
            throw new IllegalStateException("Funcionário não está vinculado a um departamento.");
        }
        return this.departamento.getNome();
    }
}
