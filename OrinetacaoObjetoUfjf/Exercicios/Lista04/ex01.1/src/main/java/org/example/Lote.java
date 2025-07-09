package org.example;

public class Lote extends Imovel{
    private double metragemQuadradaTerreno;

    public Lote(int codigo, String endereco, Contribuinte propretario) {
        super(codigo, endereco, propretario);
    }

    public double getMetragemQuadradaTerreno() {

        return metragemQuadradaTerreno;
    }

    public void setMetragemQuadradaTerreno(double metragemQuadradaTerreno) {
        if(metragemQuadradaTerreno <=0){
            throw new IllegalArgumentException("metragem quadrada invalida");
        }
        this.metragemQuadradaTerreno = metragemQuadradaTerreno;
    }

    public double calculaIptu() {
      return   this.metragemQuadradaTerreno*30;
    }
}
