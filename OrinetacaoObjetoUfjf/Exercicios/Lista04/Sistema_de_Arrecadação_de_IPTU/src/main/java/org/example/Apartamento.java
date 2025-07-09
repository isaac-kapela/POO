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
        double valorBase = 40 * this.getMetragemQuadradaApp();
        double desconto = 0.10 * this.getAndar();
        if (andar > 0) {
            valorBase = valorBase * (1 - desconto);
        }
        return valorBase;
    }

}
