package Testes;

import org.example.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrupoTest {

    @Test
    public void deveRetornarNomeSede(){
        Pais pais = new Pais("Brazil", 2000, "Brasilia" );
        Escolaridade escolaridade = new Escolaridade();
        Funcionario funcionario = new Funcionario("sla","estagiario",  escolaridade );
        Grupo grupo = new Grupo(pais,funcionario );

        escolaridade.setEscolaridade("graduando");
             assertEquals("graduando", grupo.getEscolaridadePresidenteGrupo());

    }
}
