package org.example;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Testes {

    @Test
    public void deveConsultarContasCliente(){
        ArrayList<Conta> contas = new ArrayList<Conta>();
        Cliente cliente = new Cliente(123, "isaac", contas);
        ContaCorrenteEspecial  conta1 = new ContaCorrenteEspecial(cliente, 1, 1500, 2000);
        ContaCorrente conta2 = new ContaCorrente(cliente,2, 500);
        ContaPoupanca conta3 = new ContaPoupanca(cliente,3, 100);
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        ArrayList<Conta> contasDoCliente = cliente.consultarContas();
        assertEquals(3 , contasDoCliente.size() );
        assertEquals(1, contasDoCliente.get(0).getNumero());
        assertEquals(3500.0, contasDoCliente.get(0).getSaldoTotal(), 0.01);
    }

    @Test
    public void deveRetornarResumoDasContas() {
        ArrayList<Conta> contas = new ArrayList<>();
        Cliente cliente = new Cliente(123, "Isaac", contas);
        ContaCorrenteEspecial conta1 = new ContaCorrenteEspecial(cliente, 1, 1000.0, 500.0); // saldo total: 1500.0
        ContaPoupanca conta2 = new ContaPoupanca(cliente, 2, 200.0);                         // saldo total: 200.0
        contas.add(conta1);
        contas.add(conta2);
        ArrayList<String> resumos = cliente.consultarResumoContas();
        assertEquals(2, resumos.size());
        assertEquals("Conta Nº: 1 | Tipo: ContaCorrenteEspecial | Saldo total: R$ 1500.0", resumos.get(0));
        assertEquals("Conta Nº: 2 | Tipo: ContaPoupanca | Saldo total: R$ 200.0", resumos.get(1));
    }
    @Test
    public void deveLancarExecaoNomeInvalido(){
        try {
            ArrayList<Conta> contas = new ArrayList<>();
            Cliente cliente = new Cliente(123, " ", contas);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("precisa de um nome", e.getMessage());
        }
    }

    @Test
    public void deveLancarExecaoCodigoInvalido(){
        try {
            ArrayList<Conta> contas = new ArrayList<>();
            Cliente cliente = new Cliente( -1, "sla ", contas);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("codigo invalido", e.getMessage());
        }

    }
    @Test
    public void deveLancarExecaoListaVazia(){
        try {
            ArrayList<Conta> contas = new ArrayList<>();
            Cliente cliente = new Cliente( 123, "sla ", null);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Lista vazia", e.getMessage());
        }
    }

    @Test
    public void deveLancarExecaoClienteSemConta(){
        try {
            ArrayList<Conta> contas = new ArrayList<>();
            Cliente cliente = new Cliente( 123, "sla ", contas);
            ContaCorrente contaCorrente = new ContaCorrente(null, 123, 700);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Precisa de um cliente", e.getMessage());
        }
    }
    @Test
    public void deveLancarExecaoNumeroContaInvalida(){
        try {
            ArrayList<Conta> contas = new ArrayList<>();
            Cliente cliente = new Cliente( 123, "sla ", contas);
            ContaCorrente contaCorrente = new ContaCorrente(cliente, -1, 700);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Numero invalido", e.getMessage());
        }
    }

    @Test
    public void deveLancarExecaoSaldoInvalida(){
        try {
            ArrayList<Conta> contas = new ArrayList<>();
            Cliente cliente = new Cliente( 123, "sla ", contas);
            ContaCorrente contaCorrente = new ContaCorrente(cliente, 12345, -1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("saldo invalido", e.getMessage());
        }
    }

    @Test
    public void deveLancarExecaoLimiteInvalido(){
        try {
            ArrayList<Conta> contas = new ArrayList<>();
            Cliente cliente = new Cliente( 123, "sla ", contas);
            ContaCorrenteEspecial contaCorrenteEspecial = new ContaCorrenteEspecial(cliente, 123, 600, -1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Limite invalido", e.getMessage());
        }
    }

}
