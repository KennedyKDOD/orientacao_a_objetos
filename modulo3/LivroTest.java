package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LivroTest {

    @Test
    public void testGetTitulo() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        assertEquals("Java Basico", livro1.getTitulo());
    }

    @Test
    public void testGetGenero() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        assertEquals("tecnologia", livro1.getGenero());
    }

    @Test
    public void testGetAutor() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        assertEquals("Jess", livro1.getAutor().getNome());
    }

    @Test
    public void testIsDisponivel() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);
        assertFalse(livro2.isDisponivel());
    }

    @Test
    public void testValidarDisponibilidade() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        livro1.validarDisponibilidade();
        assertTrue(livro1.isDisponivel());
    }
}
