package org.example;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class Testes {

    @Test
    public void deveGerarResumoManutencoesCliente() {
        Cliente cliente = new Cliente("Isaac", 1);
        cliente.adicionarManutencao(new CPU(101, cliente, 200, 150));
        cliente.adicionarManutencao(new Monitor(102, cliente, 100));
        cliente.adicionarManutencao(new Impressora(103, cliente, 80, 70));

        ArrayList<String> resumo = cliente.consultarResumoManutencoes();

        assertEquals(3, resumo.size());
        assertEquals("Manutenção 101 | Tipo: CPU | Valor: R$ 350.0", resumo.get(0));
        assertEquals("Manutenção 102 | Tipo: Monitor | Valor: R$ 100.0", resumo.get(1));
        assertEquals("Manutenção 103 | Tipo: Impressora | Valor: R$ 150.0", resumo.get(2));
    }

    @Test
    public void deveConsultarManutencoesDoCliente() {
        Cliente cliente = new Cliente("Isaac", 1);
        CPU cpu = new CPU(201, cliente, 100, 200);
        Monitor monitor = new Monitor(202, cliente, 50);

        cliente.adicionarManutencao(cpu);
        cliente.adicionarManutencao(monitor);

        assertEquals(2, cliente.getManutencoes().size());
        assertEquals(cliente, cpu.getCliente());
        assertEquals(cliente, monitor.getCliente());
    }
}
