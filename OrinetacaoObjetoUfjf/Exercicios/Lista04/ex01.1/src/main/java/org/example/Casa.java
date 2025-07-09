package org.example;

public class Casa extends Imovel{
    private double metragemQuadradaTerreno;
    private double metragemQuadradaConstrucao;


    public Casa(int codigo, String endereco, Contribuinte propretario) {
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

    public double getMetragemQuadradaConstrucao() {
        return metragemQuadradaConstrucao;
    }

    public void setMetragemQuadradaConstrucao(double metragemQuadradaConstrucao) {
        if(metragemQuadradaConstrucao <=0){
            throw new IllegalArgumentException("metragem quadrada invalida");
        }
        this.metragemQuadradaConstrucao = metragemQuadradaConstrucao;
    }

    public double calculaIptu() {

        return 30*this.getMetragemQuadradaTerreno()+50*this.getMetragemQuadradaConstrucao();
    }
}
