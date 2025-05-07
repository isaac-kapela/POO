package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PessoaTest {

    @Test
    public void deveEnvelhercer(){
        Pessoa pessoa = new Pessoa("fulano", 25, 1.80, 85 );
        pessoa.envelher();
        assertEquals(26, pessoa.getIdade());
    }
    @Test
    public void deveLancarExecaoIdadeAvancada(){
        try {
            Pessoa pessoa = new Pessoa("fulano", 1001, 1.80, 85 );
            pessoa.envelher();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("bem vindo ao gigante vascao", e.getMessage());
        }
    }
    @Test
    public void deveCrescer(){
        Pessoa pessoa = new Pessoa("sla", 18, 1.70, 70);
        pessoa.envelher();
        pessoa.crescer();
        assertEquals(19, pessoa.getIdade());
        assertEquals(1.71, pessoa.getAltura(), 0.001);
    }
    @Test
    public void deveLancarExecaoCrescimentoInvalido(){
        try {
            Pessoa pessoa = new Pessoa("sla", 30, 1.80, 80);
            pessoa.envelher();
            pessoa.crescer();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("muito velho pra crescer", e.getMessage());
        }

    }
    @Test
    public void deveGanharPeso(){
        Pessoa pessoa = new Pessoa("fulano", 30, 1.80,80);
        pessoa.ganharPeso(5);
        assertEquals(85, pessoa.getPeso(),0.001 );
    }
    @Test
    public void deveLancarExecaoPesoNegativo(){
        try{
            Pessoa pessoa = new Pessoa("fulano", 30, 1.80, 80);
            pessoa.ganharPeso(-1);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("quilo invalido", e.getMessage());
        }
    }
    @Test
    public void devePerderPeso(){
            Pessoa pessoa = new Pessoa("fulano", 30, 1.80, 80);
            pessoa.perderPeso(5);
            assertEquals(75, pessoa.getPeso(), 0.001);
    }

    @Test
    public void deveLancarExecaoPercaPesoNegativo(){
        try {
            Pessoa pessoa = new Pessoa("fulanno", 30, 1.80, 80);
            pessoa.perderPeso(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("quilo invalido", e.getMessage());
        }
    }

    @Test
    public void deveLancarExecaoPercaPesoAlta(){
        try {
            Pessoa pessoa = new Pessoa("fulanno", 30, 1.80, 80);
            pessoa.perderPeso(90);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("morreu", e.getMessage());
        }
    }
}
