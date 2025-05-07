package org.example;

import org.junit.Test;

import java.lang.annotation.Target;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class LivroTest {

    @Test
    public void deveMarcaPagina(){
        Livro livro = new Livro("verity", "Colleen Hoover", 1111, 200,"Drama/suspense");
        livro.abrir();
        livro.marcaPagina(24);
        assertEquals(24, livro.getPaginaAtual());
    }
    @Test
    public void deveLancarExecaoNumPaginaNegativa(){
        try{
            Livro livro = new Livro("o pequeno principe", "Antoine de Saint-Exupéry", 1111, 100, "fabula");
            livro.abrir();
            livro.marcaPagina(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("pagina invalida", e.getMessage());
        }
    }
    @Test
    public void deveLancarExecaoNumPaginaAlta(){
        try{
            Livro livro = new Livro("A Guerra dos Tronos", "George R. R. Martin", 1996, 400, "Drama/ficção");
            livro.abrir();
            livro.marcaPagina(401);
            fail();
        }
        catch (IllegalArgumentException e){
                assertEquals("pagina invalida", e.getMessage());
        }
    }

    @Test
    public void deveLancarExecaoAvancarUltimaPagina(){
        try{
            Livro livro = new Livro("A Guerra dos Tronos", "George R. R. Martin", 1996, 400,"Drama/ficção");
            livro.abrir();
            livro.marcaPagina(400);
            livro.avancarPagina();
            fail();
        }
        catch (IllegalArgumentException e){
        assertEquals("Ultima pagina", e.getMessage());
        }
    }
    @Test
    public void deveLancarExecaoRetrocederPrimeiraPagina(){
        try{
            Livro livro = new Livro("A Guerra dos Tronos","George R. R. Martin", 1996, 400, "Drama/ficção");
            livro.marcaPagina(0);
            livro.retrocederPagina();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Primeira pagina", e.getMessage());
        }
    }

}
