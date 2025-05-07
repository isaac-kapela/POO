package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ProdutoTest {

    @Test
    public void deveAddProduto(){
        Produtos produtos = new Produtos("arroz", 19.99, 80, "Alimento");
        produtos.addEstoque(20);
        assertEquals(100, produtos.getQuantidadeEstoque());
    }

    @Test
    public void deveLancarExecaoQuantNegativa(){
        try{
            Produtos produtos = new Produtos("arroz", 19.99, 80, "alimento");
            produtos.addEstoque(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("quantidade negativa", e.getMessage());
        }
    }

    @Test
    public void deveLancarExecaoQuantAlta(){
        try {
            Produtos produtos = new Produtos("arroz", 19.99, 80, "alimento");
            produtos.addEstoque(201);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Estoque ja esta cheio", e.getMessage());
        }
    }
    @Test
    public void deveRemoveProduto(){
        Produtos produtos = new Produtos("arroz", 19.99, 80, "alimento");
        produtos.addRemove(10);
        assertEquals(70, produtos.getQuantidadeEstoque());
    }
    @Test
    public void deveLancarExecaoQuantMaiorEstoque(){
        try{
            Produtos produtos = new Produtos("arroz", 19.99, 80, "alimento");
            produtos.addRemove(81);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("quantidade de produtos insuficientes", e.getMessage());
        }
    }

    @Test
    public void deveLancarExecaoRemoveNegativo(){
        try {
            Produtos produtos = new Produtos("arroz", 19.99, 80, "alimento");
            produtos.addRemove(-1);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("quantidade negativa", e.getMessage());
        }
    }
    @Test
    public void deveLancarExexaoRemoveMuitoAlto(){
        try{
            Produtos produtos = new Produtos("arroz", 19.99, 80, "alimento");
            produtos.addRemove(21);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("so é possivel remover 20 itens por vez", e.getMessage());
        }
    }
    @Test
    public void deveAplicarDesconto(){
        Produtos produtos = new Produtos("arroz", 19.99, 80, "alimento");
        produtos.aplicaDesconto(0.85);
        assertEquals();
    }
}
