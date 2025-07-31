package org.example;

public class Ocorrencia {
    private int mesOcorrencia;
    private  int anoOcorrencia;
    private String tipoOcorrencia;
    private String descricaoOcorrencia;
    private double valaorOcorrencia;

    public Ocorrencia(int mesOcorrencia, int anoOcorrencia, String tipoOcorrencia, String descricaoOcorrencia, double valaorOcorrencia) {
        this.setAnoOcorrencia(mesOcorrencia);
        this.setAnoOcorrencia(anoOcorrencia);
        this.setTipoOcorrencia(tipoOcorrencia);
        this.setDescricaoOcorrencia(descricaoOcorrencia);
        this.setValaorOcorrencia(valaorOcorrencia);
    }
    public int getMesOcorrencia() {
        return mesOcorrencia;
    }

    public void setMesOcorrencia(int mesOcorrencia) {
        this.mesOcorrencia = mesOcorrencia;
    }

    public int getAnoOcorrencia() {
        return anoOcorrencia;
    }

    public void setAnoOcorrencia(int anoOcorrencia) {
        this.anoOcorrencia = anoOcorrencia;
    }

    public String getTipoOcorrencia() {
        return tipoOcorrencia;
    }

    public void setTipoOcorrencia(String tipoOcorrencia) {
        this.tipoOcorrencia = tipoOcorrencia;
    }

    public String getDescricaoOcorrencia() {
        return descricaoOcorrencia;
    }

    public void setDescricaoOcorrencia(String descricaoOcorrencia) {
        this.descricaoOcorrencia = descricaoOcorrencia;
    }

    public double getValaorOcorrencia() {
        return valaorOcorrencia;
    }

    public void setValaorOcorrencia(double valaorOcorrencia) {
        this.valaorOcorrencia = valaorOcorrencia;
    }
}
