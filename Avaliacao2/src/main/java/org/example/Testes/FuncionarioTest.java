import org.example.Cargo;
import org.example.Funcionario;
import org.example.Ocorrencia;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FuncionarioTest {

    @Test
    public void deveLancarExecaoNomeInvalidoNoSetter() {
        Cargo cargo = new Cargo(4000);
        Funcionario funcionario = new Funcionario("José", cargo);
        try {
            funcionario.setNome("");
            fail("Deveria lançar exceção para nome inválido");
        } catch (IllegalArgumentException e) {
            assertEquals("precisa de nome", e.getMessage());
        }
    }

    @Test
    public void deveLancarExecaoCargoNuloNoSetter() {
        Cargo cargo = new Cargo(4000);
        Funcionario funcionario = new Funcionario("José", cargo);
        try {
            funcionario.setCargo(null);
            fail("Deveria lançar exceção para cargo nulo");
        } catch (IllegalArgumentException e) {
            assertEquals("precisa de cargo", e.getMessage());
        }
    }

    @Test
    public void deveCalcularSalarioCorretamente() {
        Cargo cargo = new Cargo(4000);
        Funcionario funcionario = new Funcionario("João", cargo);

        ArrayList<Ocorrencia> ocorrencias = new ArrayList<>();
        ocorrencias.add(new Ocorrencia(7, 2023, "desconto", "faltas", 200));
        ocorrencias.add(new Ocorrencia(7, 2023, "acrescimo", "bônus", 100));
        ocorrencias.add(new Ocorrencia(6, 2023, "acrescimo", "bônus", 50)); // mês diferente, não conta

        double salario = funcionario.calcularSalarioLiquido(ocorrencias, 7, 2023);
        assertEquals(3900.0, salario, 0.01);
    }

    @Test
    public void deveRetornarSalarioBaseSeNaoHouverOcorrenciasDoMes() {
        Cargo cargo = new Cargo(4000);
        Funcionario funcionario = new Funcionario("Maria", cargo);

        ArrayList<Ocorrencia> ocorrencias = new ArrayList<>();
        ocorrencias.add(new Ocorrencia(6, 2023, "desconto", "faltas", 200));
        ocorrencias.add(new Ocorrencia(6, 2023, "acrescimo", "bônus", 100));

        double salario = funcionario.calcularSalarioLiquido(ocorrencias, 7, 2023);
        assertEquals(4000.0, salario, 0.01);
    }

    @Test
    public void deveRetornarSalarioComApenasAcrescimos() {
        Cargo cargo = new Cargo(4000);
        Funcionario funcionario = new Funcionario("Carlos", cargo);

        ArrayList<Ocorrencia> ocorrencias = new ArrayList<>();
        ocorrencias.add(new Ocorrencia(7, 2023, "acrescimo", "hora extra", 300));
        ocorrencias.add(new Ocorrencia(7, 2023, "acrescimo", "bônus", 100));

        double salario = funcionario.calcularSalarioLiquido(ocorrencias, 7, 2023);
        assertEquals(4400.0, salario, 0.01);
    }

    @Test
    public void deveRetornarSalarioComApenasDescontos() {
        Cargo cargo = new Cargo(4000);
        Funcionario funcionario = new Funcionario("Ana", cargo);

        ArrayList<Ocorrencia> ocorrencias = new ArrayList<>();
        ocorrencias.add(new Ocorrencia(7, 2023, "desconto", "faltas", 300));
        ocorrencias.add(new Ocorrencia(7, 2023, "desconto", "atrasos", 100));

        double salario = funcionario.calcularSalarioLiquido(ocorrencias, 7, 2023);
        assertEquals(3600.0, salario, 0.01);
    }
}
