package org.example;

import java.util.ArrayList;

public class Cursos {
    private String codigo;
    private String descricao;
    private int cargaHoraria;
    private ArrayList<Alunos> alunos;

    public Cursos(String codigo, String descricao, int cargaHoraria) {
        setCodigo(codigo);
        setDescricao(descricao);
        setCargaHoraria(cargaHoraria);
        this.alunos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: Código inválido, string vazia");
        }
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: Descrição inválida, string vazia");
        }
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria <= 0) {
            throw new IllegalArgumentException("Erro: Carga horária deve ser maior que zero");
        }
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Alunos> getAlunos() {
        return alunos;
    }

    public void addAluno(Alunos aluno) {
        if (aluno == null) {
            throw new IllegalArgumentException("Erro: Aluno não pode ser nulo");
        }
        this.alunos.add(aluno);
    }

    public void removerAluno(Alunos aluno) {
        if (aluno == null) {
            throw new IllegalArgumentException("Erro: Aluno não pode ser nulo");
        }
        if (!alunos.contains(aluno)) {
            throw new IllegalArgumentException("Erro: Aluno não encontrado na lista");
        }
        alunos.remove(aluno);
    }

    public boolean buscarAluno(Alunos aluno) {
        return alunos.contains(aluno);
    }

    public int getNumeroAlunos() {
        return alunos.size();
    }

    public String listarAlunos() {
        StringBuilder sb = new StringBuilder();
        for (Alunos aluno : alunos) {
            sb.append(aluno.getNome()).append(" - ").append(aluno.getMatricula()).append(", ");
        }
        return sb.toString();
    }
}