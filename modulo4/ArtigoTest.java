package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.mycompany.app.Model.Artigo;
import com.mycompany.app.Model.Autor;


public class ArtigoTest {
    @Test
    public void testCriacaoArtigo() {
        Autor autor = new Autor("Kennedy Duarte", "Brasileiro", "Usuário");
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "Tecnologia", true);

        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals("Kennedy Duarte", artigo.getAutor().getNome());
        assertEquals("Tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }
}
