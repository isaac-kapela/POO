package Testes;

import org.example.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DepartamentoTest {
    @Test
    public void deveRetornarEsolaridadeChefeDepartamento(){
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setEscolaridade("doutor");
        Funcionario funcionario = new Funcionario("sla", "sla", escolaridade);
        Pais pais = new Pais("Brasil", 50000, "Brasilia");
        Grupo grupo = new Grupo(pais, funcionario);
        Empresa empresa = new Empresa("sla", grupo);
        Departamento departamento = new Departamento("Sla", empresa);
        departamento.setChefe(funcionario);
        assertEquals("doutor", departamento.getEscolaridadeChefeDepartamento());


    }
}
