package org.example;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class Testes {

    @Test
    public void deveCadastrarClienteComVagaDiaria() {
        Cliente cliente = new Cliente(1, "Isaac");
        Vaga diaria = new Diario(cliente, 101, "ABC1234", 3);
        cliente.alugarVaga(diaria);

        assertEquals(1, cliente.getVagas().size());
        assertEquals("Diário", diaria.getTipoAluguel());
        assertEquals(30, diaria.calculaValorTotal(), 0.01);
    }

    @Test
    public void deveCadastrarClienteComVagaSemanal() {
        Cliente cliente = new Cliente(2, "sla");
        Vaga semanal = new Semanal(cliente, 102, "XYZ5678", 2);
        cliente.alugarVaga(semanal);

        assertEquals(1, cliente.getVagas().size());
        assertEquals("Semanal", semanal.getTipoAluguel());
        assertEquals(80, semanal.calculaValorTotal(), 0.01);
    }

    @Test
    public void deveCadastrarClienteComVagaMensal() {
        Cliente cliente = new Cliente(3, "João");
        Vaga mensal = new Mensal(cliente, 103, "DEF9999", 1);
        cliente.alugarVaga(mensal);

        assertEquals(1, cliente.getVagas().size());
        assertEquals("Mensal", mensal.getTipoAluguel());
        assertEquals(150, mensal.calculaValorTotal(), 0.01);
    }

    @Test
    public void deveConsultarTodasAsVagasDeUmCliente() {
        Cliente cliente = new Cliente(4, "Maria");

        Vaga v1 = new Diario(cliente, 201, "AAA1111", 2);
        Vaga v2 = new Semanal(cliente, 202, "BBB2222", 1);
        Vaga v3 = new Mensal(cliente, 203, "CCC3333", 1);

        cliente.alugarVaga(v1);
        cliente.alugarVaga(v2);
        cliente.alugarVaga(v3);

        ArrayList<String> vagas = cliente.consultarVagasAlugadas();
        assertEquals(3, vagas.size());

        assertTrue(vagas.get(0).contains("20"));
        assertTrue(vagas.get(1).contains("40"));
        assertTrue(vagas.get(2).contains("150"));
    }

    @Test
    public void deveLancarExecaoCodigoInvalido(){
        try{
            Cliente cliente = new Cliente(-1, "João");
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
        }catch (IllegalArgumentException e){
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    public void deveDefinirListaDeVagasCorretamente() {
        Cliente cliente = new Cliente(10, "marco antonio");
        ArrayList<Vaga> listaVagas = new ArrayList<>();
        Vaga v = new Diario(cliente, 111, "XXX1111", 2);
        listaVagas.add(v);

        cliente.setVagas(listaVagas);

        assertEquals(1, cliente.getVagas().size());
        assertEquals("XXX1111", cliente.getVagas().get(0).getPlacaVeiculo());
    }

    @Test
    public void deveLancarExcecaoAoDefinirListaDeVagasNula() {
        Cliente cliente = new Cliente(11, "sla");
        try {
            cliente.setVagas(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("lista vazia", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcecaoAoConsultarVagasComListaVazia() {
        Cliente cliente = new Cliente(12, "sla");

        try {
            cliente.consultarVagasAlugadas();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nenhuma vaga encontrada", e.getMessage());
        }
    }

}
