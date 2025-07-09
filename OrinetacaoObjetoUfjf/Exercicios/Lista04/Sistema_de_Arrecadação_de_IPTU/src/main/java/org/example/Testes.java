package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Testes {

    @Test
    public  void deveRetornarIptuCasa(){
        ArrayList<Imovel> lista = new ArrayList<Imovel>();
        Contribuinte contribuinte = new Contribuinte("marco antonio", 123, lista );
        Casa casa = new Casa(123, "ufjf sla", contribuinte);
        casa.setMetragemQuadradaTerreno(100);
        casa.setMetragemQuadradaConstrucao(80);
        lista.add(casa);
        assertEquals(7000.0, casa.calculaIptu(), 0.01);
    }

    @Test
    public void deveLancarExecaoMetragemQuadradaTerrenoZero(){
        try {
            ArrayList<Imovel> lista = new ArrayList<Imovel>();
            Contribuinte contribuinte = new Contribuinte("marco antonio", 123, lista );
            Casa casa = new Casa(123, "ufjf sla", contribuinte);
            casa.setMetragemQuadradaTerreno(0);
            casa.setMetragemQuadradaConstrucao(80);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("metragem quadrada invalida", e.getMessage());
        }
    }
    @Test
    public void deveLancarExecaoMetragemQuadradaConstrucaoZero(){
        try {
            ArrayList<Imovel> lista = new ArrayList<Imovel>();
            Contribuinte contribuinte = new Contribuinte("marco antonio", 123, lista );
            Casa casa = new Casa(123, "ufjf sla", contribuinte);
            casa.setMetragemQuadradaTerreno(100);
            casa.setMetragemQuadradaConstrucao(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("metragem quadrada invalida", e.getMessage());
        }
    }
    @Test
    public void deveLancarExecaoCodigoInvalido() {
        try {
            ArrayList<Imovel> lista = new ArrayList<>();
            Contribuinte contribuinte = new Contribuinte("Marco Antonio", -1, lista);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("informe um codigo valido", e.getMessage());
        }
    }

    @Test
    public void deveLancarExecaoEnderecoInvalido() {
        ArrayList<Imovel> lista = new ArrayList<Imovel>();
        try {
            Contribuinte contribuinte = new Contribuinte("isaac", 1, lista);
            Casa casa = new Casa(10, "", contribuinte);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("precisa de um endereço", e.getMessage());
        }
    }
    @Test
    public void deveLancarExecaoProprietarioNulo() {
        try {
            Casa casa = new Casa(10, "Rua ufjf", null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("precisa de um propetario", e.getMessage());
        }
    }

    @Test
    public void deveLancarExecaoNomeNulo(){
        ArrayList<Imovel> lista = new ArrayList<Imovel>();
        try {
            Contribuinte contribuinte = new Contribuinte(" ", 1, lista);
            Casa casa = new Casa(10, "Rua ufjf", contribuinte);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("precisa de um nome", e.getMessage());
        }
    }
}
