package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.mycompany.app.Model.Usuario;

public class UsuarioTest {

    @Test
    public void testGetNome() {
        Usuario usuario = new Usuario("Gabriel", 21);
        assertEquals("Gabriel", usuario.getNome());
    }

    @Test
    public void testGetIdade() {
        Usuario usuario = new Usuario("Gabriel", 21);
        assertEquals(21, usuario.getIdade());
    }
}
