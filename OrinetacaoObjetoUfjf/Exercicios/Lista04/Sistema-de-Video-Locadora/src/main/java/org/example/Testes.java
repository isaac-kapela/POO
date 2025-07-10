package org.example;

import org.junit.Test;
import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class Testes {



    @Test
    public void deveCriarClienteComEmprestimos() {
        Cliente cliente = new Cliente(1, "Isaac");
        Emprestimo catalogo = new Catalogo(cliente, LocalDate.now(), 3);
        Emprestimo especial = new Especial(cliente, LocalDate.now(), 2, 10);
        cliente.getEmprestimos().add(catalogo);
        cliente.getEmprestimos().add(especial);

        assertEquals(2, cliente.getEmprestimos().size());
        assertEquals("Catalogo", catalogo.getTipoFita());
        assertEquals("Especial", especial.getTipoFita());
    }

    @Test
    public void deveCalcularValorTotal() {
        Cliente cliente = new Cliente(2, "sla");

        Emprestimo catalogo = new Catalogo(cliente, LocalDate.now(), 4);
        Emprestimo especial = new Especial(cliente, LocalDate.now(), 3, 15);
        Emprestimo lancamento = new Lancamento(cliente, LocalDate.now(), 2, 20);

        assertEquals(20, catalogo.calculaValorTotal());
        assertEquals(45, especial.calculaValorTotal());
        assertEquals(40, lancamento.calculaValorTotal());
    }

    @Test
    public void deveConsultarEmprestimosPorCliente() {
        Cliente cliente = new Cliente(3, "marco");
        Emprestimo catalogo = new Catalogo(cliente, LocalDate.of(2025, 7, 10), 2);
        Emprestimo especial = new Especial(cliente, LocalDate.of(2025, 7, 11), 1, 10);

        cliente.getEmprestimos().add(catalogo);
        cliente.getEmprestimos().add(especial);

        ArrayList<String> lista = cliente.consultarEmprestimosPorCliente();

        assertEquals(2, lista.size());
        assertTrue(lista.get(0).contains("Catalogo"));
        assertTrue(lista.get(0).contains("Valor Total: 10"));
        assertTrue(lista.get(1).contains("Especial"));
        assertTrue(lista.get(1).contains("Valor Total: 10"));
    }
    @Test
    public void deveLancarExecaoCodigoInvalido(){
        try{
            Cliente cliente = new Cliente(-1, "sla");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("codigo invalido", e.getMessage());
        }

    }

    @Test
    public void deveLancarExecaoNomeInvalido(){
        try{
            Cliente cliente = new Cliente(123, " ");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("nome invalido", e.getMessage());
        }
    }

    @Test
    public void deveLancarExecaoEmprestimoNaoEncotrado(){
        Cliente cliente = new Cliente(1234, "sla");

    }


}
