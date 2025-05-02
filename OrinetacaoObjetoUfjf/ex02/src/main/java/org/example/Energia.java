package org.example;

public class Energia {

    private  double quilowatt;
    private   double valorQuilowatt;
    private  double valorBruto;
    private  double Icms;
    private  double valorSerPago;

    public Energia(double valorSerPago) {
        this.valorSerPago = valorSerPago;
    }

    public Energia() {
        Icms = Icms;
        this.quilowatt = quilowatt;
        this.valorQuilowatt = 0.12;
        this.valorBruto = valorBruto;
    }

    public double getQuilowatt() {
        return quilowatt;
    }

    public void setQuilowatt(double quilowatt) {
        this.quilowatt = quilowatt;
    }

    public double getValorQuilowatt() {
        return valorQuilowatt;
    }

    public void setValorQuilowatt(double valorQuilowatt) {
        this.valorQuilowatt = valorQuilowatt;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public double getIcms() {
        return Icms;
    }

    public void setIcms(double icms) {
        Icms = icms;
    }

    public double getValorSerPago() {
        return valorSerPago;
    }

    public void setValorSerPago(double valorSerPago) {
        this.valorSerPago = valorSerPago;
    }

    public void calculaValorQuilowatt(double quantQuilowatt){
        if(quantQuilowatt < 0){
            throw  new IllegalArgumentException("a quantidade de quilowatt não pode ser negativa");
        }
        valorBruto = quantQuilowatt*valorQuilowatt;
        Icms = valorBruto * 0.18;
        valorSerPago = Icms+valorBruto;

    }


}
