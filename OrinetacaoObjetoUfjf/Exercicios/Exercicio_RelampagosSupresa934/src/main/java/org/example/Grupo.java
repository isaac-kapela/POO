package org.example;

public class Grupo {
    private Pais sede;
    private Funcionario Presidente;

    public Grupo(Pais sede, Funcionario presidente) {
        this.setSede(sede);
        this.setPresidente(presidente);
    }

    public Pais getSede() {
        return sede;
    }

    public void setSede(Pais sede) {
        if (sede == null) {
            throw new IllegalArgumentException("todo grupo empresarial precisa de uma sede");
        }
        this.sede = sede;
    }

    public Funcionario getPresidente() {
        return Presidente;
    }

    public void setPresidente(Funcionario presidente) {
        if (presidente == null) {
            throw new IllegalArgumentException("todo grupo precisa de um presidente");
        }
        this.Presidente = presidente;
    }

    public String getEscolaridadePresidenteGrupo() {
        if (Presidente == null) {
            throw new IllegalStateException("presidente não definido");
        }
        return this.Presidente.getEscolaridadePresida();
    }

    public String getNomePais() {
        return this.sede.getNome();
    }

}
