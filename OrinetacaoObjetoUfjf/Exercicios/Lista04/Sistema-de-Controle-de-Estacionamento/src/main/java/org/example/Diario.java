package org.example;

public class Diario extends Vaga {
    private int numDiasAlugados;

    public Diario(Cliente cliente, int numero, String placaVeiculo, int numDiasAlugados) {
        super(cliente, numero, placaVeiculo);
        this.setNumDiasAlugados(numDiasAlugados);
    }

    public int getNumDiasAlugados() {
        return numDiasAlugados;
    }

    public void setNumDiasAlugados(int numDiasAlugados) {
        if(numDiasAlugados < 0){
            throw new IllegalArgumentException("numuero de dias invalidos");
        }
        this.numDiasAlugados = numDiasAlugados;
    }

    public String getTipoAluguel() {
        return "Diário";
    }

    public int getPeriodo() {
        return numDiasAlugados;
    }

    public int calculaValorTotal() {
        return 10*this.getNumDiasAlugados();
    }
}

