package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AutorTest {

    @Test
    public void testGetNome() {
        Autor autor = new Autor("Alan Turing", "Inglês");
        assertEquals("Alan Turing", autor.getNome());
    }

    @Test
    public void testGetNacionalidade() {
        Autor autor = new Autor("Alan Turing", "Inglês");
        assertEquals("Inglês", autor.getNacionalidade());
    }
}
