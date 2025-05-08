package org.example;
public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private String departamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Funcionario(String nome, String cargo, double salario, String departamento) {
        if (salario < 0){
            throw new IllegalArgumentException("Salário não pode ser negativo");
        }
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }


    public void receberAumento(double percentual) {
        if (percentual <= 0) {
            throw new IllegalArgumentException("Percentual inválido");
        }
        salario += salario * (percentual / 100);
    }

    public void mudarDepartamento(String novoDepartamento) {
        if (novoDepartamento == null || novoDepartamento.isEmpty()) {
            throw new IllegalArgumentException("Departamento inválido");
        }
        this.departamento = novoDepartamento;
    }

    public String exibirDados() {
        return "Nome: " + nome + "\n" +
                "Cargo: " + cargo + "\n" +
                "Salário: R$ " + salario + "\n" +
                "Departamento: " + departamento;
    }
}
