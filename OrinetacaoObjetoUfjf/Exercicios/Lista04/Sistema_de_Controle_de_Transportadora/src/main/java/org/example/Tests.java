package org.example;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class Tests {

    @Test
    public void deveCadastrarFreteNormalParaCliente() {
        Cliente cliente = new Cliente(1, "Isaac");
        Frete frete = new FreteNormal(cliente, 1001, 120.0, 0.0);
        cliente.adicionarFrete(frete);

        assertEquals(1, cliente.getFretes().size());
        assertEquals(120.0, frete.calcularValorTotal(), 0.01);
    }

    @Test
    public void deveCadastrarFreteEspecialParaCliente() {
        Cliente cliente = new Cliente(2, "Maria");
        Frete frete = new FreteEspecial(cliente, 1002, 200.0, 30.0);
        cliente.adicionarFrete(frete);

        assertEquals(1, cliente.getFretes().size());
        assertEquals(230.0, frete.calcularValorTotal(), 0.01);
    }

    @Test
    public void deveCadastrarFreteUrgenteParaCliente() {
        Cliente cliente = new Cliente(3, "João");
        Frete frete = new FreteUrgente(cliente, 1003, 150.0, 20.0, 4);
        cliente.adicionarFrete(frete);

        assertEquals(1, cliente.getFretes().size());
        assertEquals(210.0, frete.calcularValorTotal(), 0.01);
    }

    @Test
    public void deveConsultarValoresTotaisDosFretes() {
        Cliente cliente = new Cliente(4, "Carlos");

        Frete f1 = new FreteNormal(cliente, 1, 100.0, 0);
        Frete f2 = new FreteEspecial(cliente, 2, 200.0, 25.0);
        Frete f3 = new FreteUrgente(cliente, 3, 150.0, 20.0, 3);

        cliente.adicionarFrete(f1);
        cliente.adicionarFrete(f2);
        cliente.adicionarFrete(f3);

        ArrayList<Double> valores = cliente.consultarValoresFretes();

        assertEquals(3, valores.size());
        assertEquals(100.0, valores.get(0), 0.01);
        assertEquals(225.0, valores.get(1), 0.01);
        assertEquals(200.0, valores.get(2), 0.01);
    }

    @Test
    public void deveConsultarFretesComDescricaoCompleta() {
        Cliente cliente = new Cliente(5, "Lucia");

        Frete f1 = new FreteNormal(cliente, 10, 80.0, 0);
        Frete f2 = new FreteUrgente(cliente, 11, 90.0, 10.0, 2);

        cliente.adicionarFrete(f1);
        cliente.adicionarFrete(f2);

        ArrayList<String> descricoes = cliente.consultarFretePorClinte();

        assertEquals(2, descricoes.size());
        assertTrue(descricoes.get(0).contains("num de frete: 10"));
        assertTrue(descricoes.get(0).contains("FreteNormal"));
        assertTrue(descricoes.get(0).contains("80.0"));

        assertTrue(descricoes.get(1).contains("num de frete: 11"));
        assertTrue(descricoes.get(1).contains("FreteUrgente"));
        assertTrue(descricoes.get(1).contains("120.0"));
    }

    @Test
    public void deveRetornarMensagemDeClienteSemFretes() {
        Cliente cliente = new Cliente(6, "SemFretes");

        ArrayList<String> resultado = cliente.consultarFretePorClinte();
        assertEquals(1, resultado.size());
        assertEquals("esse cliente n possui frte", resultado.get(0));
    }
}
