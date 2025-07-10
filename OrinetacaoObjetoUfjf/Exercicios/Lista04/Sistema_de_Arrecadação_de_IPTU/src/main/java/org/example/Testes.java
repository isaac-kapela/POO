package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

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

//    @Test
//    public void deveRetornarListaDeImoveisComValores() {
//        ArrayList<Imovel> listaImoveis = new ArrayList<>();
//        Contribuinte c = new Contribuinte("Isaac", 1, listaImoveis);
//
//        Casa casa = new Casa(10, "Rua A, 123", c);
//        casa.setMetragemQuadradaTerreno(100);
//        casa.setMetragemQuadradaConstrucao(80);
//
//        Lote lote = new Lote(20, "Rua B, 456", c);
//        lote.setMetragemQuadradaTerreno(50);
//
//        Apartamento apt = new Apartamento(30, "Rua C, 789", c);
//        apt.setMetragemQuadradaApp(70);
//        apt.setAndar(2);
//
//        listaImoveis.add(casa);
//        listaImoveis.add(lote);
//        listaImoveis.add(apt);
//
//        ArrayList<String> resultado = c.consultarImoveis();
//
//        assertEquals(3, resultado.size());
//
//        // Verifica se a descrição contém os dados corretos
//        assertTrue(resultado.get(0).contains("Casa"));
//        assertTrue(resultado.get(0).contains("Rua A, 123"));
//        assertTrue(resultado.get(0).contains("IPTU: R$ 7000.00"));
//
//        assertTrue(resultado.get(1).contains("Lote"));
//        assertTrue(resultado.get(1).contains("Rua B, 456"));
//        assertTrue(resultado.get(1).contains("IPTU: R$ 1500.00"));
//
//        assertTrue(resultado.get(2).contains("Apartamento"));
//        assertTrue(resultado.get(2).contains("Rua C, 789"));
//        assertTrue(resultado.get(2).contains("IPTU: R$ 2240.00"));
//    }

}
