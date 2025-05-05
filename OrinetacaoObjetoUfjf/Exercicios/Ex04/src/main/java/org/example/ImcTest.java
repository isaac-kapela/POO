package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ImcTest {

    @Test
    public void deveCalcularImc(){
        Pessoa pessoa = new Pessoa("m", 60, 1.60);
        pessoa.calculaImc();
        assertEquals(23.4375, pessoa.calculaImc(), 0.01);
    }
    @Test
    public void deveLancarExecaoSexoInvalido(){
        try{
            Pessoa pessoa = new Pessoa("A", 60, 1.60);
            pessoa.calculaImc();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Gênero inválido para este cálculo.", e.getMessage());
        }
    }

    @Test
    public void deveLancarExecaoPesoInvalido(){
        try{
            Pessoa pessoa = new Pessoa("M", 60, 0);
            pessoa.calculaImc();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Peso e altura devem ser maiores que zero.", e.getMessage());
        }
    }
    @Test
    public void deveLnancarExecaoAlturaInvalida(){
        try {
            Pessoa pessoa = new Pessoa("M", 0, 60);
            pessoa.calculaImc();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Peso e altura devem ser maiores que zero.", e.getMessage());
        }
    }

    @Test
    public void deveL


}
