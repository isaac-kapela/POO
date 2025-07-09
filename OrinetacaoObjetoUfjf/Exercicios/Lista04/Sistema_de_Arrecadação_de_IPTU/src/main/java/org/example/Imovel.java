package org.example;

public abstract class  Imovel {
    private int codigo;
    private String endereco;
    private Contribuinte propretario;

    public Imovel(int codigo, String endereco, Contribuinte propretario) {
        this.setCodigo(codigo);
        this.setEndereco(endereco);
        this.setPropretario(propretario);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo < 0){
            throw new IllegalArgumentException("informe um codigo valido");
        }
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(endereco  == null || endereco.trim().isEmpty()){
            throw new IllegalArgumentException("precisa de um endereço");
        }
        this.endereco = endereco;
    }

    public Contribuinte getPropretario() {
        return propretario;
    }

    public void setPropretario(Contribuinte propretario) {
        if(propretario  == null ){
            throw new IllegalArgumentException("precisa de um propetario");
        }
        this.propretario = propretario;
    }

    public abstract double calculaIptu();
}
