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
        public void deveAplicarDesconto() {
            Produtos produto = new Produtos("arroz", 100.00, 80, "alimento");
            produto.aplicaDesconto(10.0);
            assertEquals(90.00, produto.getPreco(), 0.01);
        }

        @Test
        public void deveAplicarDescontoZero() {
            Produtos produto = new Produtos("feijão", 50.00, 100, "alimento");
            produto.aplicaDesconto(0.0);
            assertEquals(50.00, produto.getPreco(), 0.01);
        }

        @Test
        public void deveLancarExcecaoDescontoNegativo() {
            try {
                Produtos produto = new Produtos("óleo", 20.00, 50, "alimento");
                produto.aplicaDesconto(-5.0);
                fail();
            } catch (IllegalArgumentException e) {
                assertEquals("desconto invalido", e.getMessage());
            }
        }
    }


