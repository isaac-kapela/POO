package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoTest {

    @Test
    public void testDebitarEstoqueComQuantidadeValida() {
        Produto p = new Produto("Teclado", 20, 100.0, 5, 50);
        p.debitarEstoque(5);
        assertEquals(15, p.getQtdeEstoque());
    }

    @Test
    public void testDebitarEstoqueComEstoqueInsuficiente() {
        Produto p = new Produto("Mouse", 3, 50.0, 2, 30);
        String mensagem = "";
        try {
            p.debitarEstoque(5);
        } catch (IllegalArgumentException e) {
            mensagem = e.getMessage();
        }
        assertEquals("Estoque insuficiente para a venda.", mensagem);
    }

    @Test
    public void testCreditarEstoqueDentroDoLimite() {
        Produto p = new Produto("Monitor", 10, 500.0, 5, 20);
        p.creditarEstoque(5);
        assertEquals(15, p.getQtdeEstoque());
    }

    @Test
    public void testCreditarEstoqueAcimaDoLimite() {
        Produto p = new Produto("Notebook", 18, 3000.0, 5, 20);
        String mensagem = "";
        try {
            p.creditarEstoque(5);
        } catch (IllegalArgumentException e) {
            mensagem = e.getMessage();
        }
        assertEquals("Quantidade excede o estoque máximo permitido.", mensagem);
    }

    @Test
    public void testVerificarEstoqueBaixo() {
        Produto p = new Produto("Cabo HDMI", 3, 20.0, 5, 50);
        assertEquals(true, p.verificarEstoqueBaixo());
    }

    @Test
    public void testVerificarEstoqueNaoBaixo() {
        Produto p = new Produto("Cabo USB", 6, 10.0, 5, 50);
        assertEquals(false, p.verificarEstoqueBaixo());
    }

    @Test
    public void testVerificarEstoqueExcedenteTrue() {
        Produto p = new Produto("HD", 10, 250.0, 2, 15);
        assertEquals(true, p.verificarEstoqueExcedente(5)); // 10 + 5 <= 15
    }

    @Test
    public void testVerificarEstoqueExcedenteFalse() {
        Produto p = new Produto("HD", 13, 250.0, 2, 15);
        assertEquals(false, p.verificarEstoqueExcedente(5)); // 13 + 5 > 15
    }

    @Test
    public void testVerificarEstoqueSuficienteTrue() {
        Produto p = new Produto("SSD", 10, 300.0, 2, 50);
        assertEquals(true, p.verificarEstoqueSuficiente(5));
    }

    @Test
    public void testVerificarEstoqueSuficienteFalse() {
        Produto p = new Produto("SSD", 4, 300.0, 2, 50);
        assertEquals(false, p.verificarEstoqueSuficiente(5));
    }

    @Test
    public void testCalcularValorVenda() {
        Produto p = new Produto("Webcam", 50, 200.0, 5, 100);
        assertEquals(600.0, p.calcularValorVenda(3), 0.0001);
    }

    @Test
    public void testRegistrarHistorico() {
        Produto p = new Produto("Impressora", 10, 400.0, 2, 30);
        Transacao t = new Transacao("2025-06-24", p, 2);
        assertEquals(1, p.getHistorico().size());
        assertEquals(t, p.getHistorico().get(0));
    }
}
