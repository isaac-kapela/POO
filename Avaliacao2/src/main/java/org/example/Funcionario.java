package org.example;

import java.util.ArrayList;

public class Funcionario extends Pessoa {
    private Departamento departamento;
    private Cargo cargo;
    private ArrayList<Dependente> dependentes;
    private ArrayList<Ocorrencia> ocorrencias;

    public Funcionario(String nome, Departamento departamento, Cargo cargo) {
        super(nome);
        setDepartamento(departamento);
        setCargo(cargo);

    }


    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
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

    public void calcularSalarioLiquido() {

    }

    public ArrayList<String> retornaDependentes(){
            ArrayList<String> resultado = new ArrayList<>();
            for(Dependente dependente: this.dependentes){
                resultado.add(dependente.getNome());
            }
        return  resultado;
    }

    public String retornaNomeDepartamentoFuncionario()
    {
        return getDepartamento().getNome();
    }
}


