package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;  // ✅ JUnit 4

import com.mycompany.app.Model.Autor;


public class AutorTest {
    @Test
    public void testCriacaoAutor() {
        Autor autor = new Autor("J.K. Rowling", "Britânica", "Autor Tradicional");
        assertEquals("J.K. Rowling", autor.getNome());
        assertEquals("Britânica", autor.getNacionalidade());
        assertEquals("Autor Tradicional", autor.getTipoAutor());
    }
}
