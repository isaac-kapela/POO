package org.example;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<Emprestimo>emprestimos;

    public Cliente(int codigo, String nome) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.emprestimos = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public ArrayList<String> consultarEmprestimosPorCliente() {
        ArrayList<String> resumo = new ArrayList<>();
        if (emprestimos == null || emprestimos.isEmpty()) {
            throw new IllegalArgumentException("Nenhum empréstimo encontrado para este cliente.");
        }
        for (Emprestimo e : emprestimos) {
            String linha = "Tipo da Fita: " + e.getTipoFita() +
                    "  Data: " + e.getData() +
                    "  Dias: " + e.getDiasEmprestimo() +
                    "  Valor Total: " + e.calculaValorTotal();
            resumo.add(linha);
        }
        return resumo;
    }

}
