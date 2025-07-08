package org.example;

public class Apartamento extends  Imovel{
    private double metragemQuadradaApp;
    private int andar;


    public Apartamento(int codigo, String endereco, Contribuinte propretario) {
        super(codigo, endereco, propretario);
    }

    public double getMetragemQuadradaApp() {
        return metragemQuadradaApp;
    }

    public void setMetragemQuadradaApp(double metragemQuadradaApp) {
        this.metragemQuadradaApp = metragemQuadradaApp;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }


    public double calculaIptu() {
        if(this.getAndar() > 0){
            return (40*this.getMetragemQuadradaApp()) -((40*this.getMetragemQuadradaApp()) * 0.10);
        }
        return (40*this.getMetragemQuadradaApp());
    }
}
