package Testes;

import org.example.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FilialTest {
    @Test
    public void deveRetornarNomeDiretorEmpresaFilial() {
        Escolaridade escolaridade = new Escolaridade();
        Funcionario funcionario = new Funcionario("isaac", "estagiario", escolaridade);
        Pais pais = new Pais("Angola", 30303030, "Luanda");
        Grupo grupo = new Grupo(pais, funcionario);
        Empresa empresa = new Empresa("sla", grupo);
        Estado estado = new Estado("sla", pais);
        Filial filial = new Filial("sla", estado, empresa);
        empresa.setDiretor(funcionario);
        assertEquals("isaac", filial.getNomeDiretorEmpresaFilial());
    }
}
