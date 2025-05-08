package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FuncionarioTest {

    @Test
    public void deveReceberAumentoValido() {
        Funcionario funcionario = new Funcionario("Isaac", "Dev", 2000, "TI");
        funcionario.receberAumento(10);
        assertEquals(2200, funcionario.getSalario(), 00.1);
    }

    @Test
    public void deveLancarExcecaoAumentoInvalido() {
        try {
            Funcionario funcionario = new Funcionario("Isaac", "Dev", 2000, "TI");
            funcionario.receberAumento(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Percentual inválido", e.getMessage());
        }
    }

    @Test
    public void deveMudarDepartamento() {
        Funcionario funcionario = new Funcionario("Isaac", "Dev", 2000, "TI");
        funcionario.mudarDepartamento("RH");
        assertEquals("RH", funcionario.getDepartamento());
    }

    @Test
    public void deveLancarExcecaoDepartamentoInvalido() {
        try {
            Funcionario funcionario = new Funcionario("Isaac", "Dev", 2000, "TI");
            funcionario.mudarDepartamento("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Departamento inválido", e.getMessage());
        }
    }

// não esquecer de refazer esse teste
    @Test
    public void deveExibirDadosCorretos() {
        Funcionario funcionario = new Funcionario("Isaac", "Dev", 2000, "TI");
            String esperado = "Nome: Isaac\n" +
                    "Cargo: Dev\n" +
                    "Salário: R$ 2000.00\n" +
                    "Departamento: TI";
            String resultado = funcionario.exibirDados();

            assertEquals(esperado, resultado);
        }



    @Test
    public void deveLancarExcecaoSalarioNegativo() {
        try {
            Funcionario funcionario =  new Funcionario("Isaac", "Dev", -100, "TI");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Salário não pode ser negativo", e.getMessage());
        }
    }

}
