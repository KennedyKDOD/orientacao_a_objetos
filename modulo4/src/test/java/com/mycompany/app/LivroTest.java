package com.mycompany.app;

import static org.junit.Assert.assertEquals;  // ✅ JUnit 4
import org.junit.Test;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Livro;

public class LivroTest {

    @Test
    public void testGetTitulo() {
        Autor autor = new Autor("Jess", "Brasileira", "Autor Tradicional");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        assertEquals("Java Basico", livro1.getTitulo());
    }
}
