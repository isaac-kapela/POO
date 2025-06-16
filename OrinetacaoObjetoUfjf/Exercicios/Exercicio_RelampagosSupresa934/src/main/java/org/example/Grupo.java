package org.example;

public class Grupo {
    private Pais sede;
    private Funcionario Presidente;

    public Grupo(Pais sede, Funcionario presidente) {
        this.sede = sede;
        Presidente = presidente;
    }

    public Pais getSede() {
        return sede;
    }

    public void setSede(Pais sede) {
        this.sede = sede;
    }

    public Funcionario getPresidente() {
        return Presidente;
    }

    public void setPresidente(Funcionario presidente) {
        Presidente = presidente;
    }

    public String getEscolaridadePresidenteGrupo(){
        return this.Presidente.getEscolaridadePresida();
    }
}
