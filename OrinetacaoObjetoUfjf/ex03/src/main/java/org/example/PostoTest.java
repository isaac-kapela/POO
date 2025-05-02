package org.example;

import org.junit.Test;

import javax.swing.plaf.PanelUI;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PostoTest {


    @Test
    public void deveCalcularMediaGastoCombustivel(){
        Posto posto = new Posto();
        posto.calculaMediaCombustivel(300,25);
        assertEquals(12.0 , posto.getConsumoMedio(),0.001);
    }
    @Test
    public void deveLancarExecaoQuilometragemInvalida(){
        try{
            Posto posto = new Posto();
            posto.calculaMediaCombustivel(-1, 25);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("não existe quilometros negativos ou == 0", e.getMessage());
        }
    }
    @Test
    public void deveLancarExecaoCombustivelInvalida(){
        try{
            Posto posto = new Posto();
            posto.calculaMediaCombustivel(300, -1);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("não existe litros negativos ou == 0",e.getMessage());
        }
    }
    @Test
    public void deveLancarExecaoCombustivelZerado(){
        try {
            Posto posto = new Posto();
            posto.calculaMediaCombustivel(300, 0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("então carro não andou nenheum quilometro", e.getMessage());
        }
    }
    @Test
    public void deveLancarExecaoQuilometrosZerado(){
        try {
            Posto posto = new Posto();
            posto.calculaMediaCombustivel(0, 25);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("o carro esta parado",  e.getMessage());
        }
    }



}
