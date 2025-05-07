package org.example;

public class Posto {
    private  double consumoMedio;

    public Posto() {
        this.consumoMedio = consumoMedio;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
    public void calculaMediaCombustivel(double quilometros, double combustivel ) {
        if (quilometros < 0) {
            throw new IllegalArgumentException("não existe quilometros negativos");
        }
        if (combustivel < 0) {
            throw new IllegalArgumentException("não existe litros negativos");
        }
        if (combustivel == 0) {
            throw new IllegalArgumentException("então carro não andou nenheum quilometro");
        }
        if (combustivel > 0 && quilometros == 0) {
            throw new IllegalArgumentException("o carro esta parado");
        }
        this.consumoMedio = quilometros/combustivel;
    }


}
