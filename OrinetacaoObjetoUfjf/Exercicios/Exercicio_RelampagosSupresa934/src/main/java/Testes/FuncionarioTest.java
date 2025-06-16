package Testes;

import org.example.*;
import org.junit.Test;

import javax.swing.plaf.PanelUI;

import static org.junit.Assert.assertEquals;

public class FuncionarioTest {
    @Test
    public void deveRetornarPaisAlocacaoFuncionario(){
        Escolaridade escolaridade = new Escolaridade();
        Pais pais = new Pais("Brazil", 3000, "Brazilia");
        Funcionario funcionario = new Funcionario("sla", "estagiario", escolaridade);
        Grupo grupo = new Grupo(pais, funcionario );
        Empresa empresa = new Empresa("sla", grupo);
        Departamento departamento = new Departamento("TI", empresa );
        funcionario.setAlocacao(departamento);
        assertEquals("Brazil", funcionario.getPaisAlocaoFun());
    }

    @Test
    public void deveRetornarEstadoFilialFuncionarioCoordena(){
        Escolaridade escolaridade = new Escolaridade();
        Pais pais = new Pais("Brazil", 30000, "Brazilia");
        Estado estado = new Estado("MG", pais);
        Funcionario funcionario = new Funcionario("isaac", "Estagiario", escolaridade);
        Grupo grupo = new Grupo(pais, funcionario);
        Empresa empresa = new Empresa("sla", grupo );
        Filial filial = new Filial("sla", estado, empresa);
        funcionario.setCoordenacao(filial);
        assertEquals("MG", funcionario.getEstadoFilialCoordena());
    }
}
