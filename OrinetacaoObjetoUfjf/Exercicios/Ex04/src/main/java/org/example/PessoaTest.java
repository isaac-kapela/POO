package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PessoaTest {

    @Test
    public void deveCalcularImc() {
        Pessoa pessoa = new Pessoa("m", 60, 1.60);
        pessoa.calculaImc();
        assertEquals(23.4375, pessoa.calculaImc(), 0.01);
    }

    @Test
    public void deveLancarExecaoSexoInvalido() {
        try {
            Pessoa pessoa = new Pessoa("A", 60, 1.60);
            pessoa.calculaImc();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Gênero inválido para este cálculo.", e.getMessage());
        }
    }

    @Test
    public void deveLancarExecaoPesoInvalido() {
        try {
            Pessoa pessoa = new Pessoa("M", 60, 0);
            pessoa.calculaImc();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Peso e altura devem ser maiores que zero.", e.getMessage());
        }
    }

    @Test
    public void deveLnancarExecaoAlturaInvalida() {
        try {
            Pessoa pessoa = new Pessoa("M", 0, 60);
            pessoa.calculaImc();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Peso e altura devem ser maiores que zero.", e.getMessage());
        }
    }

    @Test
    public void deveRetornarCategoriaAbaixoPesoFeminino() {
        Pessoa pessoa = new Pessoa("F", 1.60, 45); // IMC = 17.58
        assertEquals("Abaixo do peso", pessoa.getCategoriaImc());
    }

    @Test
    public void deveRetornarCategoriaPesoNormalFeminino() {
        Pessoa pessoa = new Pessoa("F", 1.60, 60); // IMC = 23.44
        assertEquals("No peso normal", pessoa.getCategoriaImc());
    }

    @Test
    public void deveRetornarCategoriaPesoIdealFeminino() {
        Pessoa pessoa = new Pessoa("F", 1.60, 70); // IMC = 27.34
        assertEquals("Acima do peso ideal", pessoa.getCategoriaImc());
    }

    @Test
    public void deveRetornarCategoriaAcimaPesoFeminino() {
        Pessoa pessoa = new Pessoa("F", 1.60, 80); // IMC = 31.25
        assertEquals("Acima do peso ideal", pessoa.getCategoriaImc());

    }

    @Test
    public void deveRetornarCategoriaObesoFeminino() {
        Pessoa pessoa = new Pessoa("F", 1.60, 85); // IMC=33.20
        assertEquals("Obeso", pessoa.getCategoriaImc());
    }

    @Test
    public void deveRetornarCategoriaAbaixoPesoMasculino() {
        Pessoa pessoa = new Pessoa("M", 1.80, 65); // IMC = 20.06
        assertEquals("Abaixo do peso", pessoa.getCategoriaImc());
    }

    @Test
    public void deveRetornarCategoriaNormalPesoMasculino() {
        Pessoa pessoa = new Pessoa("M", 1.80, 85); // IMC = 26.23
        assertEquals("No peso normal", pessoa.getCategoriaImc());
    }

    @Test
    public void deveRetornarCategoriaAcimaPesoMasculino() {
        Pessoa pessoa3 = new Pessoa("M", 1.80, 87); // IMC = 26.85
        assertEquals("Marginalmente acima do peso", pessoa3.getCategoriaImc());
    }
    @Test
    public void deveRetornarCategoriaIdealPesoMasculino() {

        Pessoa pessoa4 = new Pessoa("M", 1.80, 95); // IMC = 29.32
        assertEquals("Acima do peso ideal", pessoa4.getCategoriaImc());
    }

    @Test
    public void deveRetornarCategoriaObesoMasculino() {
        Pessoa pessoa5 = new Pessoa("M", 1.80, 105); // IMC = 32.41
        assertEquals("Obeso", pessoa5.getCategoriaImc());

    }
}




